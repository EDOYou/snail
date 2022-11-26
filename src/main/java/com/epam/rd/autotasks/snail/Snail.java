package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scan = new Scanner(System.in);

        int a, b, h, days = 0, feet = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        h = scan.nextInt();
        boolean reached = false;

        if ((a == b && a < h) || (a < b && a < h)) System.out.println("Impossible");
        else {
            while (!reached) {
                feet += a;
                days++;
                if (feet >= h) reached = true;
                feet -= b;
            }
            System.out.println(days);
        }
    }
}
