package com.pieterjd.aemadmin.addmultiplenodestreestructure;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.HttpRequestCommand;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.node.CreateNodeCommand;
import com.pieterjd.aemadmin.command.crx.node.GetNodeCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;

public class CreatePar12Command  extends PostProcessCommand<ComponentQueryCommand> {

    public CreatePar12Command(ComponentQueryCommand command) {
        super(command);
    }

    @Override
    public void postProcess() {
        String jsonString = null;
        String[][] multiplenodes = {
                {"/card-faq","kpngb/content/components/orion_cardFAQ"},
                {"/par-12-card","wcm/foundation/components/responsivegrid"},
                {"/title","kpngb/content/components/title"}
        };
        JSONObject json = getCommand().getQueryResult();
        JSONArray hits = json.getJSONArray("hits");
        System.out.println("# hits: "+hits.length());
        int i = 0;
        while (i < hits.length()) {
            String nodePath = hits.getJSONObject(i).getString("path");
            System.out.println(nodePath);
            for (int x = 0 ; x <= multiplenodes[0].length; x++){
                nodePath += multiplenodes[x][0].toString();
                HttpRequestCommand node = new GetNodeCommand(nodePath);
                node.execute();
                System.out.println(node.isSuccess());
                if(!node.isSuccess()){
                    HttpRequestCommand create = new CreateNodeCommand(nodePath, "nt:unstructured");
                    create.execute();
                    SetPropertyCommand addProperty = new SetPropertyCommand(nodePath, "sling:resourceType", multiplenodes[x][1].toString());
                    addProperty.execute();
                }
            }

           /*
            if(language.equals("en")) {
                DeletePropertyCommand dpc = new DeletePropertyCommand(nodePath + "/jcr:content", "cq:tags", "dummyvalue");
                dpc.execute();
            }
            SetPropertyCommand spc = new SetPropertyCommand(nodePath + "/jcr:content", "cq:tags", tagid);

            spc.execute();*/


            i++;
        }
    }
}
