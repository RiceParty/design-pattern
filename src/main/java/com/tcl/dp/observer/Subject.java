package com.tcl.dp.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author tcl
 */
public class Subject {

    private List<Observer> observers = Lists.newArrayList();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
