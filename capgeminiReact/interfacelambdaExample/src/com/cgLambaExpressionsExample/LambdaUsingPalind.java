package com.cgLambaExpressionsExample;

import java.util.Scanner;
public class LambdaUsingPalind {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String str;
        LambdaPalindromStr obj = (s)->{
            boolean fl = false;
            int n = s.length()/2;
            int j = s.length()-1;
            for(int i=0;i<n;i++) {
                if(j!=0) {
                    if(s.charAt(i) == s.charAt(j))
                        fl = true;
                    else
                        fl = false;
                    j--;
                }
            }
            System.out.println("The Given String is Palindrome :" + fl);
        };
        System.out.println("Enter the String to Check whether Palindrome or Not :");
        str = input.next();

        obj.StringPalindrome(str);
    }
}

