package com.tcl.strategy;

import com.tcl.entity.Gift;

/**
 * @author tcl
 */
public class Strategy {

    private GiftStrategy giftStrategy;

    public Strategy(GiftStrategy giftStrategy) {
        this.giftStrategy = giftStrategy;
    }

    public GiftStrategy getGiftStrategy() {
        return giftStrategy;
    }

    public void setGiftStrategy(GiftStrategy giftStrategy) {
        this.giftStrategy = giftStrategy;
    }

    public Gift getGift(int budget) {
        return this.giftStrategy.behave(budget);
    }

    public static void main(String[] args) {
        Strategy strategy = new Strategy(new HighBudgetImpl());
        System.out.println(strategy.getGift(100));
        strategy.setGiftStrategy(new LowBudgetImpl());
        System.out.println(strategy.getGift(100));
    }
}
