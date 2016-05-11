package com.tcl.dp.iterator;

/**
 * @author tcl
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
