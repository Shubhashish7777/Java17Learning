package org.practice;

public class DoubleLongRepresentation {


    public static void main( String[] args){

        double num = 12.53252;
        long numLong = Double.doubleToLongBits(num);

        System.out.println(numLong);

        String binaryRep = Long.toBinaryString(numLong);

        System.out.println(binaryRep);






    }
}
