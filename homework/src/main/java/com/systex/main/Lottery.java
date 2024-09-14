package com.systex.main;

import java.util.ArrayList;

public class Lottery {
    public static void main(String args[]){
        
        ArrayList<Integer> excludeNum = new ArrayList<>();
        
        String excludeNumStr = args[1];
        for(String num : excludeNumStr.split(" ")){
            excludeNum.add(Integer.parseInt(num));
        }
        
        for(int i = 0; i < Integer.parseInt(args[0]); i++){

            ArrayList<Integer> lottery = new ArrayList<>();

            while(lottery.size() < 6){
                int num = (int)(Math.random() * 49) + 1;
                if(!lottery.contains(num) && !excludeNum.contains(num)){
                    lottery.add(num);
                }
            }

            System.out.print("第" + (i + 1) + "組號碼: ");
            lottery.sort(null);
            for(int num : lottery){
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
