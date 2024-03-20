package bai12;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra");
        String input = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                stack.push(Character.getNumericValue(input.charAt(i)));
            }
        }
        if (stack.empty()) {
            System.out.println("Chuoi tren la chuoi rong");
        } else {
            boolean check = false;
            for (int i = 0; i < stack.size(); i++) {
                for (int j = 2; j < stack.get(i); j++) {
                    if (stack.get(i) % j == 0) {
                        check = true;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("Chuoi nhap vao khong phai la chuoi so ngto");
            } else {
                System.out.println("Chuoi nhap vao la chuoi so ngto");
            }
        }
    }
}
