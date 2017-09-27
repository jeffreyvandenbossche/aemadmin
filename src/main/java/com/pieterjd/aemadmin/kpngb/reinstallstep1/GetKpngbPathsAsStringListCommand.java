package com.pieterjd.aemadmin.kpngb.reinstallstep1;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.QueryCommand;

import javax.management.Query;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdrouill on 18/08/2017.
 */
public class GetKpngbPathsAsStringListCommand extends PostProcessCommand<QueryCommand> {

    private List<String> paths;





    public GetKpngbPathsAsStringListCommand(QueryCommand query) {
        super(query);

        paths = new ArrayList<>();

    }

    @Override
    public void postProcess() {
        try {
            String jsonString = getCommand().getHttpResponseAsString();
            JSONObject json = new JSONObject(jsonString);
            JSONArray hits = json.getJSONArray("hits");
            for(int i=0;i<hits.length();i++){
                paths.add(hits.getJSONObject(i).getString("path"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            setSuccess(false);
        }
        setExecuted(true);
    }

    public List<String> getPaths() {
        return paths;
    }
}
