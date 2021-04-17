package com.elondregan;

import com.elondregan.LispValidator.LispValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(LispValidator.validateString(input));
    }
}
