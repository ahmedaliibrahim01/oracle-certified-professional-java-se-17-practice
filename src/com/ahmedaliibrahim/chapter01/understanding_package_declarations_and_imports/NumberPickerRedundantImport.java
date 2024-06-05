package com.ahmedaliibrahim.chapter01.understanding_package_declarations_and_imports;

import java.util.Random;

public class NumberPickerRedundantImport {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}