package com.systex.main;

public class Triangles {
    public static void main(String[] args) {
        switch (Integer.parseInt(args[0])) {
            case 1:
                for (int i = 0; i < Integer.parseInt(args[1]); i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = Integer.parseInt(args[1]); i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 0; i < Integer.parseInt(args[1]); i++) {
                    for(int j = 0; j < Integer.parseInt(args[1]) - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for(int i = 0; i < Integer.parseInt(args[1]); i++) {
                    for(int j = 0; j < Integer.parseInt(args[1]) - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                for(int i = Integer.parseInt(args[1]); i > 0; i--) {
                    for(int j = 0; j < Integer.parseInt(args[1]) - i + 1; j++) {
                        System.out.print(" ");
                    }
                    
                    for(int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                for(int i = Integer.parseInt(args[1]); i > 0; i--) {
                    for(int j = 0; j < Integer.parseInt(args[1]) - i + 1; j++) {
                        System.out.print(" ");
                    }

                    for(int j = 0; j < 2 * (i - 1) + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                break;
            case 7:
                for(int i = 0; i < Integer.parseInt(args[1]); i++) {
                    for(int j = 0; j < Integer.parseInt(args[1]) - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = Integer.parseInt(args[1]) - 2; i >= 0; i--) {
                    for(int j = 0; j < Integer.parseInt(args[1]) - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Please input a number between 1 and 7.");
                break;
        }
    }
}
