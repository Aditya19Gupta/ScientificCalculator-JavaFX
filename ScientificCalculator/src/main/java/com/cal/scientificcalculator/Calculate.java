package com.cal.scientificcalculator;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;


public class Calculate {
    public float calculateOperation(float n1, float n2, String operator) {

        switch (operator){
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "cube":
                return (float) Math.pow(3,n1);
            case "pi":
                return (float) Math.PI;
            case "/":
                return n1/n2;
            case "Mod":
                return n1%n2;
            case "^":
                return (float) Math.pow(n2,n1);
            default: break;

        }
        return 0;
    }

    public float calculateSpecialOperation(float n1, String operator) {

        switch (operator){
            case "sqrt(":
                return (float) Math.sqrt(n1);
            case "sin(":
                return (float) Math.sin(n1);
            case "cos(":
                return (float) Math.cos(n1);
            case "tan(":
                return (float) Math.tan(n1);
            case "inv":
                return (float) Math.pow(n1,-1);
            case "cbrt(":
                return (float) Math.cbrt(n1);
            case "e":
                return (float) Math.exp(n1);
            case "!":
                float factorial=1;
                while(n1>0){
                    factorial+=factorial*n1;
                    n1--;
                }
                return factorial;

            default: break;

        }
        return 0;
    }
}
