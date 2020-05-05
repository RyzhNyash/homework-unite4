package by.ld.unit04;

import java.util.Scanner;


public class SumAndMul {

    public static void main(String[] args) {

        System.out.println("Введите x: ");
        int x = InpNumber();

        System.out.println("Введите y: ");
        int y = InpNumber();

        Ops(x, y);

    }

    public static int InpNumber() {

        int xIn;

        Scanner conin = new Scanner(System.in);

        while (!conin.hasNextInt()) {
            conin.next();
        }
        xIn = conin.nextInt();

        return xIn;
    }

    public static void Ops (int x, int y) {
        int sum, mul;

        sum = x + y;
        mul = x * y;

        System.out.println("sum = " + sum + "; mul = " + mul);
    }
}

