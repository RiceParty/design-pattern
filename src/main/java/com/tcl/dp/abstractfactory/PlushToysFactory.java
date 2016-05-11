package com.tcl.dp.abstractfactory;

import com.tcl.dp.entity.Gift;
import com.tcl.dp.entity.PlushToys;

/**
 * @author tcl
 */
public class PlushToysFactory implements GiftFactory {
    public Gift getGift() {
        return new PlushToys();
    }
}
