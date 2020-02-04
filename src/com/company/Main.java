package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Variables
        int age;
        age = 37;

        float gpa= 4.77f; //Declaration and intialization
        double precissionnumber = 1.000005;

        byte score = 12;

        short tennisscore = 30;

        long socialsecuritynumber = 650165877;
        boolean isplaying = true;

        char lettergrade = 'A';
        System.out.print("Our integer value is :" +age);
        System.out.print("Our floating  value is :" +gpa);
        System.out.print("Our boolean value is :" +isplaying);

        /*
        Arithmetic operators
        +,-,*,/
        ++  Increment operator adds one
        --  decreement operatoe adds one
        %  Modulus operator

        Combined Assignment Operators
        +=  Add(or concatenate) and asssign
        -= Subtract then
        *=Multiply then Assign

         */



        System.out.println("Next year I will be "+(++age));
        System.out.println("17%4="+(17%3));

        tennisscore += 10;

        System.out.println("Tennis Score ="+ tennisscore);





    }
}
