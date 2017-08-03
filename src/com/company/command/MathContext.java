package com.company.command;

/**
 * Created by krishna on 8/2/17.
 */
public class MathContext implements Strategy{

    private final MathCommand command;

    public MathContext(MathCommand command){
        this.command=command;
    }


    @Override
    public double doOperation(double x, double y) {
        return  command.calculate(x,y);
    }
}
