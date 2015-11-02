package com.tcl.abstractfactory;

/**
 * @author tcl
 */
public class PlushToysFactory implements GiftFactory {
    public Gift getGift() {
        return new PlushToys();
    }
}
