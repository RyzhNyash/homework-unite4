import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {

        int x1 = MyImp();

        OuTex(x1);

        Tab(x1);
    }

    public static int MyImp() {
        int xin;

        Scanner sc = new Scanner(System.in);

        System.out.println("> ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число a > ");
        }
        xin = sc.nextInt();

        return xin;
    }

    public static void Tab(int x1) {

        if (x1 > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(x1 + " * " + i + " = " + (x1 * i));
            }
        } else {
            System.out.println("все результаты ноль");
        }
    }

    public static void OuTex(int x1) {
        System.out.println("таблица умножения " + x1);
    }
}


