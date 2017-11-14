package com.test;

import java.math.BigInteger;
import java.util.*;
 
public class Main4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int n = Integer.valueOf(scanner.nextLine());
            BigInteger[] fibonacci = new BigInteger[90];
            fibonacci[0] = BigInteger.valueOf(1);
            fibonacci[1] = BigInteger.valueOf(2);
            for (int i = 2; i < 90; i++)
            {
                fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
            }
            System.out.println(fibonacci[n - 1]);
        }
    }
}