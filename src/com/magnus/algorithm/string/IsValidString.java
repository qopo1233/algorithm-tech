package com.magnus.algorithm.string;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName IsValidString
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/9 22:12
 */
public class IsValidString {


    public static void main(String[] args) {
        IsValidString isValidString = new IsValidString();
        boolean valid = isValidString.isValid("){");
        System.out.println(valid);
    }
    Map<Character, Character> paris = new HashMap<>() {
        {
            put(')', '(');
            put('}', '{');
            put(']', '[');

        }
    };
    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (paris.containsKey(charAt)) {
                if (deque.isEmpty() || deque.peek() != paris.get(charAt)) {
                    return false;
                }
                deque.pop();
            }else {
                deque.push(charAt);
            }
        }
        return deque.isEmpty();
    }
}
