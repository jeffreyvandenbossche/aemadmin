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

    public QuerySubpage(String path, boolean recursive) {
        this.path = path;
        if (recursive) {
            addCondition("path",path);
            addCondition("type","cq:Page");
            addCondition("p.limit","-1");
        } else {
            addCondition("path",path);
            addCondition("path.flat","true");
            addCondition("type","cq:Page");
            addCondition("p.limit","-1");
        }
    }

    public QuerySubpage(String path, String resourceType){
        this.path = path;

        addCondition("1_property","sling:resourceType");
        addCondition("1_property.value", resourceType);
        addCondition("path",path);
        addCondition("p.limit","-1");
    }
}
