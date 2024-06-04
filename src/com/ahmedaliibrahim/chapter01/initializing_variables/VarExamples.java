package com.ahmedaliibrahim.chapter01.initializing_variables;

public class VarExamples {

    // Since question and answer are not assigned values on the lines where they are defined,
    // the compiler does not know what to make of them

//    public void doesThisCompile(boolean check) {
//        var question;
//        question = 1;
//
//        var question2
//                = 1;
//
//        var question3
//        question3 = 1;
//
//        var answer;
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//
//        System.out.println(answer);
//    }

//    public void twoTypes() {
//        int a, var b = 3; // DOES NOT COMPILE // We couldn’t write int a, int v = 3; either.
//        var n = null; // DOES NOT COMPILE
//    }

    /*
    While a var cannot be initialized with a null value without a type,
    it can be reassigned a null value after it is declared,
    provided that the underlying data type is a reference type.
     */
    public void nullVar() {
        var str = (String) null;
        str = "content";

        var size = (Integer) null;
        size = 200;
    }

    // In this example, a and b are method parameters.
    // Remember that var is only used for local variable type inference!
//    public int addition(var a, var b) { // DOES NOT COMPILE
//        return a + b;
//    }

}
