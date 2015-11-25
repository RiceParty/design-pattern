package com.tcl.abstractfactory;

import com.tcl.entity.Gift;
import com.tcl.entity.PlushToys;

/**
 * @author tcl
 */
public class PlushToysFactory implements GiftFactory {
    public Gift getGift() {
        return new PlushToys();
    }
}
