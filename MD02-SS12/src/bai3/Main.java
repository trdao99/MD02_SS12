package bai3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String string = "";

        System.out.println("nhap so luowng tu");
        int input = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= input; i++) {
            System.out.println("nhap tu thu " + i);
            stack.push(sc.nextLine());
        }
        for (int i = stack.size()-1; i >= 0 ; i--) {
            string += stack.get(i) + " ";
        }
        System.out.println(string);
    }
}