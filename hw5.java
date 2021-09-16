package hw3;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("First String: ");
        String main = s.nextLine();
        System.out.print("Second String : ");
        String request= s.nextLine();
        System.out.println("Output : " + main.contains(request));
    }
}
