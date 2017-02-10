package com.tcl.dp.observer;

/**
 * @author tcl
 */

public class OneSubject extends Subject {


    public void change(String newState) {
        this.notifyObservers(newState);
    }
}
