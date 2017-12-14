package com.pieterjd.aemadmin.mivc647;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.node.CreateNodeCommand;
import com.pieterjd.aemadmin.command.crx.node.DeleteNodeCommand;
import com.pieterjd.aemadmin.command.crx.node.ReorderNodeAfterCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;
import com.pieterjd.aemadmin.mivc647.components.IComponent;
import com.pieterjd.aemadmin.mvc5619.QuerySubpage;
import org.testng.util.Strings;

/**
 * Created by thavadar on 20/10/2017.
 */
public class DeleteComponentFromSubpage<T extends IComponent> extends PostProcessCommand<QuerySubpage> {

    private T component;

    public DeleteComponentFromSubpage(QuerySubpage command, T component) {
        super(command);
        this.component = component;
    }

    private String constructNodePath(String nodePath) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodePath);
        if (Strings.isNotNullAndNotEmpty(this.component.getPathPrefix())) {
            sb.append("/")
                    .append(this.component.getPathPrefix())
                    .append("/")
                    .append(this.component.getName());
        } else {
            sb.append("/")
                    .append(this.component.getName());
        }

        return sb.toString();
    }

    @Override
    public void postProcess() {
        JSONObject jObj = getCommand().getQueryResult();
        JSONArray hits = jObj.getJSONArray("hits");
        System.out.println("[+] hits size = " + hits.length());
        for (int i = 0; i < hits.length(); i++) {
            String nodePath = constructNodePath(hits.getJSONObject(i).getString("path"));
            System.out.println("\t[-] " + nodePath);
            System.out.println("\t\t[-] Removing " + this.component.getName() + " component..");
            DeleteNodeCommand delete = new DeleteNodeCommand(nodePath);
            delete.execute();
            System.out.println("\t\t[-] Deleted in " + nodePath);
        }
    }
}
