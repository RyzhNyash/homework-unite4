package by.ld.unit04;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int x;
        int y;
        int min;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x: ");x =sc.nextInt();

        System.out.print("Введите y: ");y =sc.nextInt();

        min = Math.min(x, y);

        System.out.println("min = " + min);
    }

}
