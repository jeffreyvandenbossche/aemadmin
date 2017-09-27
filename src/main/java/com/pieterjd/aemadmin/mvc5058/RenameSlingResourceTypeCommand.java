package com.pieterjd.aemadmin.mvc5058;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;

import java.io.IOException;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class RenameSlingResourceTypeCommand extends PostProcessCommand<ComponentQueryCommand>{

    public RenameSlingResourceTypeCommand(ComponentQueryCommand command) {
        super(command);
    }

    @Override
    public void postProcess() {
        String jsonString = null;
        try {
            jsonString = getCommand().getHttpResponseAsString();
            JSONObject json = new JSONObject(jsonString);
            JSONArray hits = json.getJSONArray("hits");
            for(int i=0;i<hits.length();i++){
                String nodePath = hits.getJSONObject(i).getString("path");
                System.out.println(nodePath);
                SetPropertyCommand rename = new SetPropertyCommand(nodePath,"sling:resourceType","kpngb/content/components/orion/text");
                rename.execute();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
