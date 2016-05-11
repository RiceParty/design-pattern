package com.tcl.dp.generator;

/**
 * @author tcl
 */
public class GeneratorMain {
    public static void main(String[] args) {
        Generator<Counter> generator = BaseGenerator.create(Counter.class);

        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
