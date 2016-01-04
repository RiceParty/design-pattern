package com.tcl.generator;

/**
 * @author tcl
 */
public class Counter {
    private static int counter = 0;
    private final int id = counter++;

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                '}';
    }
}
