package com.tcl.dp.abstractfactory;

import com.tcl.dp.entity.Gift;

/**
 * @author tcl
 */
public class AbstractFactories {
    public static Gift getGift(GiftFactory giftFactory) {
        return giftFactory.getGift();
    }

    public static void main(String[] args) {
        Gift perfume = getGift(new PerfumeFactory());
        Gift plushToys = getGift(new PlushToysFactory());
        System.out.println(perfume.getDes());
        System.out.println(plushToys.getDes());
    }
}
