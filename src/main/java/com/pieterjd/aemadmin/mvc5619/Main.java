package com.pieterjd.aemadmin.mvc5619;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class Main {
    public static void main(String[] args){
        String[] languages = {"fr","nl","en"};
        for(String language:languages) {

            /*Monthly plans*/
            AddTagToSubpage atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans"), language,"faq:monthly-plans");
            atts.execute();
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/tariffs-free-minutes-sms"), language,"faq:monthly-plans/tariffs-and-free-minutes-sms");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/my-contract"), language,"faq:monthly-plans/my-contract");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/switch"), language,"faq:monthly-plans/switch");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/monthly-plans/international-call-roaming"), language,"faq:monthly-plans/international-calls-and-roaming");
            atts.execute();

            /*Prepaid cards*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/prepaid-cards"), language,"faq:prepaid-cards");
            atts.execute();
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/prepaid-cards/call-value-and-free-minutes-sms"), language,"faq:prepaid-cards/call-value-and-free-minutes-sms");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/prepaid-cards/international-calls-roaming"), language,"faq:prepaid-cards/international-calls-and-roaming");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/prepaid-cards/transfer"), language,"faq:prepaid-cards/transfer");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/prepaid-cards/my-prepaid"), language,"faq:prepaid-cards/my-prepaid");
            atts.execute();
            
            
            /*options + service*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services"), language,"faq:options-and-services");
            atts.execute();
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/voicemail"), language,"faq:options-and-services/voicemail");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/mobile-internet-alert"), language,"faq:options-and-services/mobile-internet-alert");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/budget-alert"), language,"faq:options-and-services/budget-alert");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/base-cloud"), language,"faq:options-and-services/base-cloud");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/other-services"), language,"faq:options-and-services/other-services");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/sms-mms"), language,"faq:options-and-services/sms-mms");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/options-services/second-call"), language,"faq:options-and-services/second-call");
            atts.execute();


            /*invoice payments*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/invoices-payments"), language,"faq:invoices-and-payments");
            atts.execute();
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/invoices-payments/my-invoice"), language,"faq:invoices-and-payments/my-invoice");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/invoices-payments/direct-debit"), language,"faq:invoices-and-payments/direct-debit");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/invoices-payments/consult-your-invoice"), language,"faq:invoices-and-payments/consult-your-invoice");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/invoices-payments/how-to-pay"), language,"faq:invoices-and-payments/how-to-pay");
            atts.execute();


            /*Top up your call credit*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/top-up-your-call-credit"), language,"faq:topup");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/top-up-your-call-credit/how-to-top-up"), language,"faq:topup/how-to-topup");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/top-up-your-call-credit/top-up-online"), language,"faq:topup/topup-online");
            atts.execute();


            /*mobile internet and apps*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/mobile-internet-and-apps"), language,"faq:mobile-internet-and-apps");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/mobile-internet-and-apps/data-bundles"), language,"faq:mobile-internet-and-apps/data-bundles");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/mobile-internet-and-apps/mobile-internet"), language,"faq:mobile-internet-and-apps/mobile-internet");
            atts.execute();


            /*network devices*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/network-devices"), language,"faq:network-and-devices");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/network-devices/network-coverage"), language,"faq:network-and-devices/network-coverage");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/network-devices/mobile-phone-and-sim-card"), language,"faq:network-and-devices/mobile-phone-and-simcard");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/network-devices/device-lost-or-stolen"), language,"faq:network-and-devices/device-lost-or-stolen");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/network-devices/4g-network"), language,"faq:network-and-devices/4g-network");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/network-devices/4g-plus"), language,"faq:network-and-devices/4g-plus");
            atts.execute();


            /*your online order*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/your-online-order"), language,"faq:your-online-order");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/your-online-order/order"), language,"faq:your-online-order/order");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/your-online-order/delivery-and-activation"), language,"faq:your-online-order/delivery-and-activation");
            atts.execute();
            
            /*manage your account*/
            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account"), language,"faq:manage-your-account");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/address-change"), language,"faq:manage-your-account/address-change");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/number-transfer"), language,"faq:manage-your-account/number-transfer");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/tariff-change"), language,"faq:manage-your-account/tariff-change");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/terminate-contract"), language,"faq:manage-your-account/terminate-contract");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/become-costumer"), language,"faq:manage-your-account/become-a-customer");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/give-access"), language,"faq:manage-your-account/give-access");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/master"), language,"faq:manage-your-account/master-your-account");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/change-master"), language,"faq:manage-your-account/change-your-master");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/change-personal-details"), language,"faq:manage-your-account/change-your-personal-details");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/details-plan-tarifaire"), language,"faq:manage-your-account/details-tariff-plan");
            atts.execute();

            atts = new AddTagToSubpage(new QuerySubpage("/content/kpngb-base/"+language+"/frequently-asked-questions/manage-your-account/access-costumer-zone"), language,"faq:manage-your-account/access-costumer-zone");
            atts.execute();


           
        }
    }
}
