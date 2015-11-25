package com.tcl.abstractfactory;

import com.tcl.entity.Gift;
import com.tcl.entity.Perfume;

/**
 * @author tcl
 */
public class PerfumeFactory implements GiftFactory {
    public Gift getGift() {
        return new Perfume();
    }
}
