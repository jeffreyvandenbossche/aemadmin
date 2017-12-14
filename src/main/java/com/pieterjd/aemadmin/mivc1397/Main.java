package com.pieterjd.aemadmin.mivc1397;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.HttpRequestCommand;
import com.pieterjd.aemadmin.command.crx.node.GetNodeCommand;
import com.pieterjd.aemadmin.command.crx.property.DeletePropertyCommand;
import com.pieterjd.aemadmin.command.crx.property.GetPropertyCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;
import com.pieterjd.aemadmin.mivc481.ReplacePath;
import com.pieterjd.aemadmin.mvc5058.ComponentQueryCommand;
import com.pieterjd.aemadmin.mvc5619.QuerySubpage;

import java.io.IOException;

/**
 * Created by thavadar on 26/10/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        CompareCardQueryCommand query = new CompareCardQueryCommand();
        query.execute();
        JSONArray arr = query.getQueryResult().getJSONArray("hits");
        System.out.println("Found " + arr.length() + " orion_comparecard");

        for (int i = 0; i < arr.length(); i++) {
            JSONObject jObj = arr.getJSONObject(i);
            String compareCardPath = jObj.getString("path");
            System.out.println("[-] orion_comparecard processing.. [" + compareCardPath + "]");
            String compareCardButtonPath = compareCardPath + "/button";
            HttpRequestCommand buttonNode = new GetNodeCommand(compareCardButtonPath);
            buttonNode.execute();
            if (buttonNode.isSuccess() && "kpngb/content/components/button".equals(buttonNode.getHttpResponseAsJSON().getString("sling:resourceType"))) {
                System.out.println("\t[-] Button node found under the compare card. resourceType is changing..");
                SetPropertyCommand addProperty = new SetPropertyCommand(compareCardButtonPath,
                        "sling:resourceType", "kpngb/content/components/orion/cta");
                addProperty.execute();
                System.out.println("\t\t[-] resourceType is changed");
                GetPropertyCommand getLinkProperty = new GetPropertyCommand(compareCardButtonPath, "link");
                getLinkProperty.execute();
                System.out.println("\t\t[-] the property named 'link' is changing to href...");
                String linkValue = getLinkProperty.getPropertyValue();
                System.out.println("\t\t[-] value of the link property = " + linkValue);
                DeletePropertyCommand deleteLinkProperty = new DeletePropertyCommand(compareCardButtonPath,
                        "link", linkValue);
                deleteLinkProperty.execute();
                SetPropertyCommand setHrefProperty = new SetPropertyCommand(compareCardButtonPath,
                        "href", linkValue);
                setHrefProperty.execute();
                System.out.println("\t\t[-] link is changed to href");
                HttpRequestCommand getResultNode = new GetNodeCommand(compareCardButtonPath);
                getResultNode.execute();
                System.out.println("\t[*] Result of the button: \n" + getResultNode.getHttpResponseAsJSON().toString(4));
            } else {
                System.out.println("\t[!] There is no button node inside the compare card");
            }
        }

    }

}
