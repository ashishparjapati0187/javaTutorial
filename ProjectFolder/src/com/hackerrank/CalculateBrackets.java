package com.hackerrank;



import java.util.*;
import java.io.*;


class CalculateBrackets {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();   
        int forw=0,back=0;              // Reading input from 
        for(int i=0;i=<name.length();i++){
                    if(name.charAt(i)=='(')
                    forw++;
                    else if(name.charAt(i)==')')
                    back++;


        }
        if(forw==back)
                    System.out.println(forw);


    }
}
