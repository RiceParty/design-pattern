package com.tcl.dp.entity;

/**
 * @author tcl
 */
public class Perfume implements Gift {
    public String getDes() {
        return "i am perfume. Most girls like me to perform better!";
    }

    @Override
    public String toString() {
        return getDes();
    }
}
