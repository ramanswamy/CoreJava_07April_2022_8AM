package com.tekparams.opps_concepts;

public class Circle {
    public Double pi = 3.14;
    Operation op;

    public Double findAreaOfCircle(int radius){
        op = new Operation();
        return pi * op.findSquare(radius);
    }
}
