package com.tcl.iterator;

/**
 * @author tcl
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
