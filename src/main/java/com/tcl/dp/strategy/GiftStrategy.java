package com.tcl.dp.strategy;

import com.tcl.dp.entity.Gift;

/**
 * @author tcl
 */
public interface GiftStrategy {
    Gift behave(int budget);
}
