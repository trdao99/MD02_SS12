package bai7;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String string = sc.nextLine().trim();
        for (int i = string.length()-1; i >=0 ; i--) {
            stack.add(string.charAt(i));
        }
        System.out.println(stack);
    }
}
