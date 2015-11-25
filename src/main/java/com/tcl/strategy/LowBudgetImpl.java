package com.tcl.strategy;

import com.tcl.abstractfactory.AbstractFactories;
import com.tcl.abstractfactory.PlushToysFactory;
import com.tcl.entity.Gift;

/**
 * @author tcl
 */
public class LowBudgetImpl implements GiftStrategy {
    public Gift behave(int budget) {
        if (budget >= 100) {
            System.out.println("so much money . you can use High Budget");
            return null;
        }
        return AbstractFactories.getGift(new PlushToysFactory());
    }
}
