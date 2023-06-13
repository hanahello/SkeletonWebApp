package com.develogical;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("your name")) {
            return "Hammy";
        }

      if(query.toLowerCase().contains("largest")) {
            String noQuestionMark = query.replace("?", "");
            String []parts = noQuestionMark.split(":");
            String []numbers = parts[1].split(",");

            int first = Integer.parseInt(numbers[0].trim());
            int second = Integer.parseInt(numbers[1].trim());
            int third = Integer.parseInt(numbers[2].trim());

            if(first > second){
                if(first > third){
                    return String.valueOf(first);}
                        else {
                            return String.valueOf(third);
                        }
                    }  else if(second > third){
                            return String.valueOf(second) ;}
                        else{
                            return String.valueOf(third);
                    }  
                }
    return "";}
    
            }