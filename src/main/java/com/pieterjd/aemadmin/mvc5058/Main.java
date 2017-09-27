package com.pieterjd.aemadmin.mvc5058;

import com.pieterjd.aemadmin.command.LoginCommand;

import java.io.IOException;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LoginCommand login = new LoginCommand();
        login.execute();
        System.out.println(login);

        ComponentQueryCommand query = new ComponentQueryCommand();
        query.execute();
        //System.out.println(query.getHttpResponseAsString());
        System.out.println(query.getQueryResult().getInt("total"));
        RenameSlingResourceTypeCommand rename = new RenameSlingResourceTypeCommand(query);
        rename.execute();
    }
}
