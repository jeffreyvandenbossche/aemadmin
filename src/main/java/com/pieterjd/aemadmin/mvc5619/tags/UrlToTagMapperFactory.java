package com.pieterjd.aemadmin.mvc5619.tags;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class UrlToTagMapperFactory {
    private TagFactory tagFactory;
    public UrlToTagMapperFactory() {
        tagFactory = new TagFactory();
    }

    public List<UrlToTagMapper> getMappers(String language){
        List<UrlToTagMapper> res = new ArrayList<>();
        //monthly plan
        UrlToTagMapper uttm = new UrlToTagMapper();
        uttm.setUrlRegEx("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans");
        uttm.setTag(tagFactory.findTag("faq:monthly-plans"));
        res.add(uttm);

        uttm = new UrlToTagMapper();
        uttm.setUrlRegEx("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/tariffs-free-minutes-sms");
        uttm.setTag(tagFactory.findTag("faq:monthly-plans/tariffs-and-free-minutes-sms"));
        res.add(uttm);

        uttm = new UrlToTagMapper();
        uttm.setUrlRegEx("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/my-contract");
        uttm.setTag(tagFactory.findTag("faq:monthly-plans/my-contract"));
        res.add(uttm);

        uttm = new UrlToTagMapper();
        uttm.setUrlRegEx("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/switch");
        uttm.setTag(tagFactory.findTag("faq:monthly-plans/switch"));
        res.add(uttm);

        uttm = new UrlToTagMapper();
        uttm.setUrlRegEx("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/international-call-roaming");
        uttm.setTag(tagFactory.findTag("faq:monthly-plans/international-calls-and-roaming"));
        res.add(uttm);


        return res;
    }

    public UrlToTagMapper find(String language,String url){
        List<UrlToTagMapper> mappers = getMappers(language);
        for(UrlToTagMapper uttm:mappers){
            if(uttm.matchesUrl(url)){
                return uttm;
            }
        }
        return null;
    }
}
