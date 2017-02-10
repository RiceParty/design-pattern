package com.tcl.dp.observer;

/**
 * @author tcl
 */

public class OneObserver implements Observer {

    private String state = "init";

    public void update(String state) {
        System.out.println(this.state);
        this.state = state;
        System.out.println(this.state);
    }
}
