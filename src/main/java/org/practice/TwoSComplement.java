package org.practice;

import java.util.Random;

public class TwoSComplement {

    public static void main ( String[] args[]){

        Random random = new Random();
        int num = random.nextInt();

        System.out.println(Integer.toBinaryString(num));

        //NOT to reverse the bits of the original number and add 1 : The method to two's algorithm

        int twoScomplement = ~num + 1;

        System.out.println(Integer.toBinaryString(twoScomplement));

        System.out.println(num+ " ---> "+ twoScomplement);







    }




}
