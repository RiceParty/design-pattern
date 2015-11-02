package com.tcl.abstractfactory;

/**
 * @author tcl
 */
public class PerfumeFactory implements GiftFactory {
    public Gift getGift() {
        return new Perfume();
    }
}
