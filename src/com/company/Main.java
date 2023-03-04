package com.company;


import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input =in.nextLine();
        String calcOut =calc(input);
        System.out.println(calcOut);

    }

    public static String calc(String input) {

        String arr1 = "+", arr2 = "-", arr3 = "*", arr4 = "/";
        int strL = input.length();
        String[] num = input.split(" ");

        String num1 = num[0];
        String num2 = num[1];
        String num3 = num[2];

        String[] arabNum = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] arrRom = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
                "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV",
                "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
                "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        String resultOut1 = null;
        if (Arrays.asList(arrRom).contains(num1) && Arrays.asList(arrRom).contains(num3)) {
            Rome numRom = Rome.valueOf(num[0]);
            Rome numRom1 = Rome.valueOf(num[2]);

            String numRom3 = (numRom.getRomeNum());
            String numRom4 = (numRom1.getRomeNum());

            try {
                int c = Integer.parseInt(numRom3);
            } catch (NumberFormatException number) {
                System.out.println("т.к. используются одновременно разные системы счисления");
            }
            try {
                int d = Integer.parseInt(numRom4);
            } catch (NumberFormatException number) {
                System.out.println("т.к. используются одновременно разные системы счисления");
            }

            int in3 = Integer.parseInt(numRom3);
            int in4 = Integer.parseInt(numRom4);

            if (num2.equals(arr1)) {
                int result1 = in3 + in4;
                resultOut1 = arrRom[result1];


            } else if (num2.equals(arr2)) {
                int result2 = in3 - in4;
                resultOut1 = (arrRom[result2]);

            } else if (num2.equals(arr3)) {
                int result3 = in3 * in4;
                resultOut1 = (arrRom[result3]);

            } else if (num2.equals(arr4)) {
                int result4 = in3 / in4;
                resultOut1 = (arrRom[result4]);

            } else {
                System.out.println("т.к. в римской системе нет отрицательных чисел");
            }
        } else if (strL >= 8) {
            System.out.println("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else if (Arrays.asList(arabNum).contains(num1) && Arrays.asList(arabNum).contains(num3)) {
            try {
                int a = Integer.parseInt(num1);
            } catch (NumberFormatException number) {
                System.out.println("");
            }
            try {
                int b = Integer.parseInt(num3);
            } catch (NumberFormatException number1) {
                System.out.println("");
            }
            int in1 = Integer.parseInt(num1);
            int in2 = Integer.parseInt(num3);


            if (num2.equals(arr1) && (in1 >= 0 && in1 <= 10) && (in2 >= 0 && in2 <= 10)) {
                int a1 = in1 + in2;
                resultOut1 ="" + a1;


            } else if (num2.equals(arr2) && (in1 >= 0 && in1 <= 10) && (in2 >= 0 && in2 <= 10)) {
                int a1 = in1 - in2;
                resultOut1 ="" + a1;

            } else if (num2.equals(arr3) && (in1 >= 0 && in1 <= 10) && (in2 >= 0 && in2 <= 10)) {
                int a1 = in1 * in2;
                resultOut1 ="" + a1;

            } else if (num2.equals(arr4) && (in1 >= 0 && in1 <= 10) && (in2 >= 0 && in2 <= 10)) {
                int a1 = in1 / in2;
                resultOut1 ="" + a1;

            }
        } else if (Arrays.asList(arrRom).contains(num1) && Arrays.asList(arabNum).contains(num3)) {
            System.out.println("//т.к. используются одновременно разные системы счисления");
        } else {
            System.out.println("т.к. строка не является математической операцией");
        }

        return resultOut1;
    }
}

