package com.pieterjd.aemadmin.mvc5345;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;
import com.pieterjd.aemadmin.mvc5058.ComponentQueryCommand;

import java.io.IOException;

/**
 * Created by pdrouill on 25/08/2017.
 */
public class SetExludeFromSearchPropertyCommand extends PostProcessCommand<RepositoryPageQueryCommand> {


    public SetExludeFromSearchPropertyCommand(RepositoryPageQueryCommand command) {
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
            SetPropertyCommand addProperty = new SetPropertyCommand(nodePath+"/jcr:content","excludeFromSearch","true");
            addProperty.execute();

        }

    }
}
