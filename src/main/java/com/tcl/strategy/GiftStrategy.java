package com.tcl.strategy;

import com.tcl.entity.Gift;

/**
 * @author tcl
 */
public interface GiftStrategy {
    Gift behave(int budget);
}
