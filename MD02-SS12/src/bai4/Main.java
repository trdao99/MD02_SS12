package bai4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = sc.nextLine().toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
            stack.push(string.charAt(i));
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Đây là chuỗi Palindrome.");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome.");
        }
    }
}