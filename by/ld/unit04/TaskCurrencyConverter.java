package by.ld.unit04;

import java.util.Scanner;

public class TaskCurrencyConverter {
    public static void main(String[] args) {


        //        Scanner inData = new Scanner(System.in);
        String type1 = inputType1(); //в какую валюту конвертируем
        String type2 = inputType2(); //что конвертируем
        double sumIn = sumIn1(); // сумма к конвертации
        double sumOut = 0;
        System.out.println("__________");

        //        курс и виды валюты
        String rubS = "1";
        String dolS = "2";
        String dolC = "3";
        String eurS = "4";

        //      коэффициенты для конверт.

        double rubRu = 1; //остальный значения относительно рубля
        double dolUs = 0.014;
        double dolCa = 0.019;
        double eurEu = 0.012;

        //        конвертер

        if ((rubS.equals(type1)) && (dolS.equals(type2))) {
            sumOut = sumIn * dolUs;
            System.out.println(sumIn + " российских рублей = " + sumOut + " $ ");
        } else if ((type1.equals(rubS)) && (type2.equals(dolC))) {
            sumOut = sumIn * dolCa;
            System.out.println(sumIn + " российских рублей = " + sumOut + " канадских $");
        } else if ((type1.equals(rubS)) && (type2.equals(eurS))) {
            sumOut = sumIn * eurEu;
            System.out.println(sumIn + " российских рублей = " + sumOut + " евро ");
        } else if ((type1.equals(dolS)) && (type2.equals(rubS))) {
            sumOut = sumIn / dolUs;
            System.out.println(sumIn + " $ = " + sumOut + " российским рублям ");
        } else if ((type1.equals(dolC)) && (type2.equals(rubS))) {
            sumOut = sumIn / dolCa;
            System.out.println(sumIn + " канадских $ = " + sumOut + "российским рублей ");
        } else if ((type1.equals(eurS)) && (type2.equals(rubS))) {
            sumOut = sumIn / eurEu;
            System.out.println(sumIn + " евро = " + sumOut + " российским рублям ");
        } else if ((type1.equals(eurS)) && (type2.equals(dolS))) {
            sumOut = (sumIn / dolUs) * eurEu;
            System.out.println(sumIn + " евро = " + sumOut + " $ ");
        } else if ((type1.equals(dolS)) && (type2.equals(eurS))) {
            sumOut = (sumIn / eurEu) * dolUs;
            System.out.println(sumIn + " $ = " + sumOut + " евро ");
        } else if ((type1.equals(dolC)) && (type2.equals(dolS))) {
            sumOut = (sumIn / dolCa) * dolUs;
            System.out.println(sumIn + " канадский $ = " + sumOut + " $ ");
        } else if ((type1.equals(dolS)) && (type2.equals(dolC))) {
            sumOut = (sumIn / dolUs) * dolCa;
            System.out.println(sumIn + " $ = " + sumOut + " канадский $ ");
        } else if ((type1.equals(dolC)) && (type2.equals(eurS))) {
            sumOut = (sumIn / dolCa) * eurEu;
            System.out.println(sumIn + " канадский $ = " + sumOut + " евро ");
        } else if ((type1.equals(eurS)) && (type2.equals(dolC))) {
            sumOut = (sumIn / dolUs) * dolCa;
            System.out.println(sumIn + " евро = " + sumOut + " канадский $ ");
        } else {
            System.out.println("что то в логике твоей не верно");
        }

        //        вывод

        System.out.println("первый выбор = " + type1);
        System.out.println("второй выбор = " + type2);

        return;
    }

    //__________декомпозиция !!!

    public static String inputType1() {

        Scanner inData = new Scanner(System.in);

        System.out.println("В какую валюту конвертировать, введите цифру: ");
        System.out.println("1 - Рубли Россия");
        System.out.println("2 - Доллары США");
        System.out.println("3 - Доллары Канада");
        System.out.println("4 - Евро");
        System.out.print(">  ");

        String type1 = inData.nextLine();
        System.out.println(type1);
        return (type1);
    }

    public static String inputType2() {

        Scanner inData = new Scanner(System.in);

        System.out.println("Из какуй валюты конвертировать, введите цифру: ");
        System.out.println("1 - Рубли Россия");
        System.out.println("2 - Доллары США");
        System.out.println("3 - Доллары Канада");
        System.out.println("4 - Евро");
        System.out.print(">  ");

        String type2 = inData.nextLine();
        System.out.println(type2);
        return (type2);
    }

    public static double sumIn1() {
        double sumIn1;
        Scanner inData = new Scanner(System.in);
        System.out.print("Сумма в исходной валюте >  ");
        sumIn1 = inData.nextDouble();
        return (sumIn1);
    }
}