package com.pieterjd.aemadmin.mvc5345;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class RepositoryPageQueryCommand extends QueryCommand {
    public RepositoryPageQueryCommand(String lang){
        addCondition("type","cq:Page");
        addCondition("group.1_group.1_path","/content/kpngb-base/"+lang+"/retail/repository");
        addCondition("group.1_group.2_path","/content/kpngb-base/"+lang+"/sme/repository");
        addCondition("group.1_group.3_path","/content/kpngb-base/"+lang+"/soho/repository");
        addCondition("group.1_group.p.or","true");
        addCondition("p.limit","-1");
    }
}
