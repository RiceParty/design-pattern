package com.tcl.strategy;

import com.tcl.abstractfactory.AbstractFactories;
import com.tcl.abstractfactory.PerfumeFactory;
import com.tcl.entity.Gift;

/**
 * @author tcl
 */
public class HighBudgetImpl implements GiftStrategy {
    public Gift behave(int budget) {
        if (budget < 100) {
            System.out.println("so little money . use Low Budget pleas");
            return null;
        }
        return AbstractFactories.getGift(new PerfumeFactory());
    }
}
