package com.pieterjd.aemadmin.kpngb.reinstallstep1;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by pdrouill on 18/08/2017.
 */
public class KpngbPathsQuery extends QueryCommand {
    public KpngbPathsQuery(int offset) {
        super();
        addCondition("path","/apps");
        addCondition("path.flat","true");
        addCondition("type","nt:folder");
        //addCondition("nodename","kpngb*");
        addCondition("p.offset",""+offset);
    }
}
