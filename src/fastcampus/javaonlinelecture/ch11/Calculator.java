package fastcampus.javaonlinelecture.ch11;

import fastcampus.javaonlinelecture.ch14.Calc;

public abstract class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
