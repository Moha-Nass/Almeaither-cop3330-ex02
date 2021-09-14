package org.example;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohammed_Almeaither
 */

import java.util.Scanner;
public class App
{

    public static void main(String[] args) {

        // TO DO Auto-generated method stub
        Scanner in = new Scanner(System.in);


        System.out.println("Exercise 2");
        System.out.print("What is input string? ");
        String s = in.nextLine();
        int c = s.length();
        System.out.println(s + " has " + c + " characters.");
    }
}
