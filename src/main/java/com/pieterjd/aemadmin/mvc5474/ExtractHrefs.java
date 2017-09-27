package com.pieterjd.aemadmin.mvc5474;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;

/**
 * Created by pdrouill on 1/09/2017.
 */
public class ExtractHrefs extends PostProcessCommand<Query> {
    public ExtractHrefs(Query command) {
        super(command);
    }

    @Override
    public void postProcess() {
        String jsonString = null;

        JSONObject json = getCommand().getQueryResult();
        JSONArray hits = json.getJSONArray("hits");
        System.out.println("# hits: "+hits.length());
        for(int i=0;i<hits.length();i++){
            String nodePath = hits.getJSONObject(i).getString("path");
            System.out.println(nodePath);

        }

    }
}
