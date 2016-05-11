package com.tcl.dp.factory;

import com.tcl.dp.entity.Gift;
import com.tcl.dp.entity.Perfume;
import com.tcl.dp.entity.PlushToys;

/**
 * @author tcl
 */
public enum GiftEnum {
    PERFUME("perfume", new Perfume()),
    PLUSH_TOYS("plushtoys", new PlushToys());

    private String type;
    private Gift gift;

    GiftEnum(String type, Gift gift) {
        this.type = type;
        this.gift = gift;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public static Gift getGifyByType(String type) {
        for (GiftEnum gift : GiftEnum.values()) {
            if (gift.getType().equals(type)) {
                return gift.getGift();
            }
        }
        return null;
    }
}
