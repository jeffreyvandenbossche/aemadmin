package com.pieterjd.aemadmin.mvc5474;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by pdrouill on 1/09/2017.
 */
public class Query extends QueryCommand {


    public Query() {
        addCondition("path","/content/kpngb-base");
        addCondition("type","nt:unstructured");
        addCondition("nodename","onlinesales");
    }
}
