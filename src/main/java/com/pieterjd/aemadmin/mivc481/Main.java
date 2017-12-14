package com.pieterjd.aemadmin.mivc481;

import com.pieterjd.aemadmin.mvc5619.QuerySubpage;

/**
 * Created by thavadar on 26/10/2017.
 */
public class Main {

    public static void main(String[] args) {
        QuerySubpage query = new QuerySubpage("/content/tg-baseturk", true);
        ConvertToBaseTurk converter = new ConvertToBaseTurk(query);
        converter.execute();
    }

}
