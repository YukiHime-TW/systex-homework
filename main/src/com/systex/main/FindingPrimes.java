package com.systex.main;

import java.util.ArrayList;

public class FindingPrimes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;
        while (count <= max) {
            if (isPrime(count)) {
                primes.add(count);
            }
            count++;
        }
        
        for(int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i) + " ");
        }
        System.out.println();

        System.out.println("Total primes: " + primes.size());
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
