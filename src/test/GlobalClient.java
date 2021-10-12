package test;

import abstractFactory.AmericanFactory;
import abstractFactory.BangladeshFactory;
import abstractFactory.GlobalFactory;
import abstractFactory.IndiaFactory;
import beans.Global;

public class GlobalClient {
    public static void main(String[] args) {

        Global Bangladesh = GlobalFactory.createPayable(new BangladeshFactory());

        System.out.println(Bangladesh.getCurrencyName());

        Global India = GlobalFactory.createPayable(new IndiaFactory());

        System.out.println(India.getCurrencyName());

        Global America = GlobalFactory.createPayable(new AmericanFactory());

        System.out.println(America.getCurrencyName());

    }
}
