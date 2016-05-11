package com.tcl.dp.strategy;

import com.tcl.dp.abstractfactory.AbstractFactories;
import com.tcl.dp.abstractfactory.PerfumeFactory;
import com.tcl.dp.entity.Gift;

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
