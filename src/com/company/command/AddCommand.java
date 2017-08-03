package com.company.command;

/**
 * Created by krishna on 8/2/17.
 */
public class AddCommand extends MathCommand {
    @Override
    public double calculate(double x, double y) {
        return x+y;
    }
}
