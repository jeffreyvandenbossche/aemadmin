package com.pieterjd.aemadmin.mvc5619;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class QuerySubpage extends QueryCommand{
    private String path;

    public String getPath() {
        return path;
    }

    public QuerySubpage(String path){
        this.path = path;

        addCondition("path",path);
        addCondition("path.flat","true");
        addCondition("type","cq:Page");
        addCondition("p.limit","-1");
    }
}
