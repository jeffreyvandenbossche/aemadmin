package com.pieterjd.aemadmin.mivc481;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.property.GetPropertyCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;
import com.pieterjd.aemadmin.mvc5619.QuerySubpage;

import java.util.HashMap;

/**
 * Created by thavadar on 26/10/2017.
 */
public class ConvertToBaseTurk extends PostProcessCommand<QuerySubpage> {

    private static final HashMap CHANGE_MAP = new HashMap() {{
        put("/apps/kpngb-whitelabel/templates/responsive-selfcare-page", "/apps/kpngb-whitelabel/templates/responsive-baseturk-selfcare-page");
        put("kpngb-whitelabel/components/page/responsive-eservices-page", "kpngb-whitelabel/components/page/responsive-baseturk-eservices-page");
        put("kpngb-whitelabel/components/page/responsive-landingpage", "kpngb-whitelabel/components/page/responsive-baseturk-landingpage");
        put("/apps/kpngb-whitelabel/templates/responsive-landingpage", "/apps/kpngb-whitelabel/templates/responsive-baseturk-landingpage");
        put("/apps/kpngb-whitelabel/templates/responsive-homepage", "/apps/kpngb-whitelabel/templates/responsive-baseturk-homepage");
        put("kpngb-whitelabel/components/page/responsive-homepage", "kpngb-whitelabel/components/page/responsive-baseturk-homepage");
        put("/apps/kpngb-whitelabel/templates/responsive-page", "/apps/kpngb-whitelabel/templates/responsive-baseturk-page");
        put("kpngb-whitelabel/components/page/responsive-page", "kpngb-whitelabel/components/page/responsive-baseturk-page");
    }};

    public ConvertToBaseTurk(QuerySubpage command) {
        super(command);
    }

    @Override
    public void postProcess() {
        JSONObject jobj = getCommand().getQueryResult();

        JSONArray jArr = jobj.getJSONArray("hits");
        for (int i = 0; i < jArr.length(); i++) {
            try {
                String jcrPath = jArr.getJSONObject(i).getString("path") + "/jcr:content";
                System.out.println("[-] Found: " + jcrPath);
                System.out.println("\t[-] Property sling:resourceType is changing..");
                changeProperty(jcrPath, "sling:resourceType");
                System.out.println("\t[-] Property cq:template is changing..");
                changeProperty(jcrPath, "cq:template");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void changeProperty(String jcrPath, String propertyName) throws Exception {
        GetPropertyCommand getPropertyCommand = new GetPropertyCommand(jcrPath, propertyName);
        getPropertyCommand.execute();
        String value = (String) CHANGE_MAP.get(getPropertyCommand.getPropertyValue());
        if (value != null) {
            SetPropertyCommand setPropertyCommand = new SetPropertyCommand(jcrPath, propertyName, value);
            setPropertyCommand.execute();
            System.out.println("\t\t[*] Success.");
        } else {
            System.out.println("\t\t[!] Failed.");
        }
    }

}
