package com.pieterjd.aemadmin.mvc5474;

import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.mvc5345.RepositoryPageQueryCommand;
import com.pieterjd.aemadmin.mvc5345.SetExludeFromSearchPropertyCommand;

import java.io.IOException;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String[] languages = {"nl","fr","en"};

            Query query = new Query();
            //query.execute();
            //System.out.println(query.getQueryResult().getInt("total"));
            //System.out.println(query.getHttpResponseAsString());
            PostProcessCommand ppc = new ExtractHrefs(query);
            ppc.execute();



    }
}
