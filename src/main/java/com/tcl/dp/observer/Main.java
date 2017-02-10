package com.tcl.dp.observer;

/**
 * @author tcl
 */

public class Main {
    public static void main(String[] args) {
        OneSubject subject = new OneSubject();

        Observer observer = new OneObserver();

        subject.attach(observer);

        subject.change("sdf");
    }
}
