package com.pieterjd.aemadmin.mvc5619.tags;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class UrlToTagMapper {
    private String urlRegEx;
    private Tag tag;
    private Pattern pattern;

    public String getUrlRegEx() {
        return urlRegEx;
    }

    public void setUrlRegEx(String urlRegEx) {
        this.urlRegEx = urlRegEx;
        this.pattern = Pattern.compile(urlRegEx);
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
    public boolean matchesUrl(String url){
        Matcher m = pattern.matcher(url);
        return m.matches();
    }
}
