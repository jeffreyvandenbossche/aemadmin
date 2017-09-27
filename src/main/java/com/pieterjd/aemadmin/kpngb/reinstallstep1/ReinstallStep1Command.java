package com.pieterjd.aemadmin.kpngb.reinstallstep1;

import com.pieterjd.aemadmin.command.CompositeCommand;
import com.pieterjd.aemadmin.command.QueryCommand;
import com.pieterjd.aemadmin.command.crx.node.DeleteNodeCommand;

/**
 * Created by pdrouill on 17/08/2017.
 *
 * Based on step 1 as documented on https://share.emakina.net/display/KPNGB/AEM+6
 */
public class ReinstallStep1Command extends CompositeCommand{
    public ReinstallStep1Command(){
        super();
        QueryCommand query = new QueryCommand();
        query.addCondition("path","/apps");
        query.addCondition("path.exact","true");
        query.addCondition("type","nt:folder");
        query.addCondition("nodename","kpngb*");
    }
}
