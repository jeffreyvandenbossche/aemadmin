package com.pieterjd.aemadmin.mvc5619.tags;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pdrouill on 18/09/2017.
 */

@Test
public class UrlToTagMapperTest {
    private UrlToTagMapperFactory urlToTagMapperFactory;

    @org.junit.Before
    public void setup(){
        urlToTagMapperFactory = new UrlToTagMapperFactory();
    }


    @Test
    public void testMonthyPlanTag(){
        urlToTagMapperFactory = new UrlToTagMapperFactory();
        UrlToTagMapper uttm = urlToTagMapperFactory.getMappers("fr").get(0);
        Assert.assertTrue(uttm.matchesUrl("/content/kpngb-base/fr/frequently-asked-questions/monthly-plans"));
        Assert.assertFalse(uttm.matchesUrl("/content/kpngb-base/fr/frequently-asked-questions/monthly-plans/blabla"));
        Assert.assertFalse(uttm.matchesUrl("/content/kpngb-base/fr/frequently-asked-questions/network"));
        ;
    }
}
