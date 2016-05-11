package com.tcl.dp.abstractfactory;

import com.tcl.dp.entity.Gift;
import com.tcl.dp.entity.Perfume;

/**
 * @author tcl
 */
public class PerfumeFactory implements GiftFactory {
    public Gift getGift() {
        return new Perfume();
    }
}
