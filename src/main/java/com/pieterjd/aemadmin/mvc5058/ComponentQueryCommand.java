package com.pieterjd.aemadmin.mvc5058;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class ComponentQueryCommand extends QueryCommand {
    public ComponentQueryCommand(){
        super();
        addCondition("1_property","sling:resourceType");
        addCondition("1_property.value","wcm/foundation/components/text");
        addCondition("path","/content/kpngb-base/");
        addCondition("p.limit","-1");
    }
}
