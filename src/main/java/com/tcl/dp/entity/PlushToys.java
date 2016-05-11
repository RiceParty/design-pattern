package com.tcl.dp.entity;

/**
 * @author tcl
 */
public class PlushToys implements Gift {
    public String getDes() {
        return "i am plush toys. Most girls like me for a company!";
    }


    @Override
    public String toString() {
        return getDes();
    }
}
