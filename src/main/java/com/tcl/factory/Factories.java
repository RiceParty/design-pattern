package com.tcl.factory;

import com.google.common.base.Preconditions;
import com.tcl.entity.Gift;
import com.tcl.entity.Perfume;
import com.tcl.entity.PlushToys;

/**
 * @author tcl
 */
public class Factories {
    protected static Gift getGift(String type) {
        if ("perfume".equals(type)) {
            return new Perfume();
        } else if ("plushtoys".equals(type)) {
            return new PlushToys();
        }
        return null;
    }
    public static void main(String[] args) {
        Gift perfume = getGift("perfume");
        Gift plushtoys = getGift("plushtoys");
        Preconditions.checkNotNull(perfume);
        Preconditions.checkNotNull(plushtoys);
        System.out.println(perfume.getDes());
        System.out.println(plushtoys.getDes());

        Gift perfume_haha = GiftEnum.getGifyByType("perfume");
        Preconditions.checkNotNull(perfume_haha);
        System.out.println(perfume_haha.getDes());
    }
}
