package bai10;

import java.net.Inet4Address;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9,0};
        int min = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if(min>integers[i]){
                min = integers[i];
            }
        }
        stack.push(min);
        System.out.println(stack);
    }
}
