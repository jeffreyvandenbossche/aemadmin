package com.pieterjd.aemadmin.addmultiplenodestreestructure;

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
/*
        CreateNodeCommand cnc = new CreateNodeCommand(destination, gncResult.getString("jcr:primaryType"));
        cnc.execute();
        */
        ComponentQueryCommand query = new ComponentQueryCommand();
        query.execute();
        //System.out.println(query.getHttpResponseAsString());
        CreatePar12Command create = new CreatePar12Command(query);
        create.execute();
/*        RenameSlingResourceTypeCommand rename = new RenameSlingResourceTypeCommand(query);
        rename.execute();*/
    }
}
