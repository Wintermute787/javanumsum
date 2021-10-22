package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum of digits in num  is " + digitSum(125));
        System.out.println("sum of digits  is " + digitSum(48952));

    }
    private static int digitSum(int num){
        if(num < 10){
            return -1;
        }
        int sum = 0;
        //125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while(num > 0){
            //extract least-significant digit
            int digit = num % 10;
            sum += digit;
            //drop least significant digit
            num /= 10;
        }
        return sum;
    }
}



