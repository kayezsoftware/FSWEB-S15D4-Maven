package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String text) {

        if(text == null) return false;

        // Noktalama, boşluk, büyük/küçük farkını temizle
        text = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        for(char c : text.toCharArray()){
            stack.push(c);
        }

        for(char c : text.toCharArray()){
            if(c != stack.pop()){
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int number){
        if(number == 0) return "0";

        Stack<Integer> stack = new Stack<>();

        while(number > 0){
            stack.push(number % 2);
            number /= 2;
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }
}
