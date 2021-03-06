package com.pieterjd.aemadmin.mvc5619;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.property.DeletePropertyCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;

import com.pieterjd.aemadmin.mvc5619.tags.UrlToTagMapperFactory;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class AddTagToSubpage extends PostProcessCommand<QuerySubpage> {

    private String tagid;
    private String language;

    public AddTagToSubpage(QuerySubpage command, String language,String tagid) {
        super(command);
        this.language = language;
        this.tagid = tagid;
    }

    @Override
    public void postProcess() {
        String jsonString = null;

        JSONObject json = getCommand().getQueryResult();
        JSONArray hits = json.getJSONArray("hits");
        System.out.println("# hits: " + hits.length());
        for (int i = 0; i < hits.length(); i++) {
            String nodePath = hits.getJSONObject(i).getString("path");
            System.out.println(nodePath);
            if(language.equals("en")) {
                DeletePropertyCommand dpc = new DeletePropertyCommand(nodePath + "/jcr:content", "cq:tags", "dummyvalue");
                dpc.execute();
            }
            SetPropertyCommand spc = new SetPropertyCommand(nodePath + "/jcr:content", "cq:tags", tagid);

                spc.execute();


        }
    }
}
