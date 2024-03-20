package bai8;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "4,5,*,-,+,/";
        String[] arr = input.split(",");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (String item : arr) {
            switch (item) {
                case "*":
                    double operand2 = Double.parseDouble(stack.pop());
                    double operand1 = Double.parseDouble(stack.peek());
//                    stack.push(operand1 * operand2);
                    break;
                case "/":
                    operand2 = Double.parseDouble(stack.pop());
                    operand1 = Double.parseDouble(stack.peek());
//                    stack.push(operand1 / operand2);
                    break;
                case "+":
                    operand2 = Double.parseDouble(stack.pop());
                    operand1 = Double.parseDouble(stack.peek());
//                    stack.push(operand1 + operand2);
                    break;
                case "-":
                    operand2 = Double.parseDouble(stack.pop());
                    operand1 = Double.parseDouble(stack.peek());
//                    stack.push(operand1 - operand2);
                    break;
                default:
//                    stack.push(Double.parseDouble(item));
                    break;
            }
        }

//        double result = stack.pop();
//        System.out.println("Result: " + result);
    }
}