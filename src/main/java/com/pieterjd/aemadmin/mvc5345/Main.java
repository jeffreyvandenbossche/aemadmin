package com.pieterjd.aemadmin.mvc5345;

import com.pieterjd.aemadmin.command.LoginCommand;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.mvc5058.ComponentQueryCommand;
import com.pieterjd.aemadmin.mvc5058.RenameSlingResourceTypeCommand;

import java.io.IOException;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String[] languages = {"nl","fr","en"};
        for(String language:languages){
            RepositoryPageQueryCommand query = new RepositoryPageQueryCommand(language);
            //query.execute();
            //System.out.println(query.getQueryResult().getInt("total"));
            //System.out.println(query.getHttpResponseAsString());
            PostProcessCommand ppc = new SetExludeFromSearchPropertyCommand(query);
            ppc.execute();
        }


    }
}
