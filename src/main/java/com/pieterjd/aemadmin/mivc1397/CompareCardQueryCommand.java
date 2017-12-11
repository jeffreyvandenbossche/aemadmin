package com.pieterjd.aemadmin.mivc1397;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by thavadar on 11/12/2017.
 */
public class CompareCardQueryCommand extends QueryCommand {

    public CompareCardQueryCommand(){
        super();
        /*
        /content/kpngb-base
        /content/kpngb-turk-telekom
        /content/kpngb-turk-telekom-mobile
        /content/kpngb-telenetgroup
        /content/kpngb-basecompany
        /content/kpngb-basecompany-mobile
        /content/kpngb-onescreen
        /content/kpngb-salesportal
        /content/tg-baseturk
         */
        addCondition("1_property","sling:resourceType");
        addCondition("1_property.value","kpngb/content/components/orion_comparecard");
        addCondition("group.p.or", "true");
        addCondition("group.1_path", "/content/kpngb-base");
        addCondition("group.2_path", "/content/tg-baseturk");
        addCondition("p.limit","-1");
    }

}
