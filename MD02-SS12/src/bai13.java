import java.util.Scanner;
import java.util.Stack;

public class bai13 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao can chuyen doi");
        Integer input = Integer.parseInt(scanner.nextLine());
        while (input>0){
            stack.push(input%2);
            input/=2;
        }
        System.out.println("So sau chuyen doi la: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }
    }
}
