package homework.school;

import java.util.Scanner;

public class ScannerProject {
    public static void main(String[] args) {
        System.out.print("값을 입력해주세요: ");
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        System.out.println("입력받은 값: " + y);
    }
}
