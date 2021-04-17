package com.elondregan.LispValidator;

public class LispValidator {

    public static Boolean validateString(String s){
        //Concept here is to count the number of parantheses ( as 1, ) as -1, if we ever go negative, then
        //we are no longer a valid parentheses, if we end without 0, then we are also invalid.
        int paranthesesCount = 0;
        char[] characters = s.toCharArray();
        for(char c : characters){
            if(c == '('){
                paranthesesCount++;
            } else if (c == ')'){
                paranthesesCount--;
            }

            if(paranthesesCount < 0){
                return false;
            }
        }

        return paranthesesCount == 0;
    }
}
