package com.company.ads;

/**
 * Created by krishna on 8/3/17.
 */
public class LockScreenAdsViewProvider implements AdsViewProvider {

    private final AdsView adsView;

    public LockScreenAdsViewProvider(AdsView adsView){
        this.adsView=adsView;
    }
    @Override
    public String provideView() {
        return adsView.getAdsView();
    }
}
