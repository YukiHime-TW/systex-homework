package com.systex.main;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);

        int count = 2;
        while (fib.get(count - 1) + fib.get(count - 2) <= max) {
            fib.add(fib.get(count - 1) + fib.get(count - 2));
            count++;
        }

        for (int i = 0; i < fib.size(); i++) {
            System.out.print(fib.get(i) + " ");
        }
        System.out.println();

        System.out.println("Total Fibonacci: " + fib.size());
    }
}
