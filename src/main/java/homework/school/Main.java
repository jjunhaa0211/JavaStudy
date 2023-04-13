package homework.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr = input.nextInt();
        System.out.println("값을 입력해주세요");
        System.out.println(arr);
//        int[]data = new int[arr];
//
//        for(int i = 0; i < data.length; i++) {;
//            data[i] = input.nextInt();
//        }

        A2407 a = new A2407();

        int b = a.sum(new int[] { 1, 2, 3, 4, 5 });

        System.out.println(b);
    }
}
