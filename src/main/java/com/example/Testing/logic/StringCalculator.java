package com.example.Testing.logic;

public class StringCalculator {
    public static void main(String[] args) {

//         String input = "1,2,3";
        String input = "7,8,9";


        int add = add(input);
        System.out.println(add);





//         System.out.println("Sum of '4\n5\n6': " + calculator.add("4\n5\n6")); // Expected: 15
//         System.out.println("Sum of '7,8\n9': " + calculator.add("7,8\n9")); // Expected: 24

    }
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
//
        String[] splitNumbers = numbers.split("[,\n]");// split on basis of newline
        int sum = 0;

        for (String number : splitNumbers) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers not allowed: " + number);
            }
            sum += num;
        }

        return sum;
    }

    private int callCount = 0;
    public int GetCalledCount() {
        return callCount;
    }









}
