package com.encaps;
import java.util.Scanner;

class Piy {
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter num1");
        String num = myObj1.next();
        int num1=Integer.parseInt(num); 
        
        System.out.println("Enter num2");
        String nums = myObj1.next();
        int num2=Integer.parseInt(nums); 
        
        System.out.println("Enter num3");
        String nums2 = myObj1.next();
        int num3=Integer.parseInt(nums2); 
        
        System.out.println(num1+num2+num3);

        if(num1>num2 && num1>num3)
        {
            System.out.println("Num1 is greatest");
        }else if(num2>num1 && num2>num3)
        {
            System.out.println("Num2 is greatest");
        }else
        {
            System.out.println("Num3 is greatest");
        }
    }
}
