package com.company;

import com.company.ads.CouponAds;
import com.company.ads.LockScreenAdsViewProvider;

public class Main {

    public static void main(String[] args) {
        double x = 10;
        double y = 20;
        double total = 0;
        LockScreenAdsViewProvider lockScreenAdsViewProvider=new LockScreenAdsViewProvider(new CouponAds());
       String result= lockScreenAdsViewProvider.provideView();
      /*  MathContext mathContext = new MathContext(new AddCommand());
       double total= mathContext.doOperation(x, y);
       System.out.print("Result : "+ total);*/
        String task = "-";
        switch (task) {
            case "+":
                total = x + y;
                break;
            case "-":
                total = x - y;
                break;


        }
        System.out.print("Result : " + result);
    }


}
