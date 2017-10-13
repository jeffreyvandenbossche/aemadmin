package com.pieterjd.aemadmin.mivc647;

import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import com.pieterjd.aemadmin.command.PostProcessCommand;
import com.pieterjd.aemadmin.command.crx.node.CreateNodeCommand;
import com.pieterjd.aemadmin.command.crx.property.DeletePropertyCommand;
import com.pieterjd.aemadmin.command.crx.property.SetPropertyCommand;
import com.pieterjd.aemadmin.mivc647.components.IComponent;
import com.pieterjd.aemadmin.mvc5619.QuerySubpage;
import org.testng.util.Strings;

/**
 * Created by thavadar on 12/10/2017.
 */
public class AddComponentToSubpage<T extends IComponent> extends PostProcessCommand<QuerySubpage> {
    private T component;
    public AddComponentToSubpage(QuerySubpage command, T component) {
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
            System.out.println("\t\t[-] Creating " + this.component.getName() + " component..");
            CreateNodeCommand create = new CreateNodeCommand(nodePath, this.component.getPrimaryType());
            create.execute();
            SetPropertyCommand addProperty = new SetPropertyCommand(nodePath, "sling:resourceType", this.component.getResourceType());
            addProperty.execute();
            System.out.println("\t\t[-] Created in " + nodePath + " Resource Type= " + this.component.getResourceType());
        }
        // CreateNodeCommand createNodeCommand = new CreateNodeCommand()
    }
}
