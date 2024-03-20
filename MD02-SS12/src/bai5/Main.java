package bai5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean isMatching = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if (input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    isMatching = false;
                    break;
                }
                if (!isMatchingBracket(stack.pop(), input.charAt(i))) {
                    isMatching = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isMatching = false;
        }

        if (isMatching) {
            System.out.println("well");
        } else {
            System.out.println("????");
        }
    }

    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}