import IntsCalculator.*;
import BinOps.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //1*
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sum(10, 22));
        System.out.println(calc.mult(10, 5));
        System.out.println(calc.pow(10, 2));
        //2*
        BinOps bins = new BinOps();
        String bin1 = "101";
        String bin2 = "11";
        String sumResult = bins.sum(bin1, bin2);
        String multResult = bins.mult(bin1, bin2);
        System.out.println("Сумма " + bin1 + " и " + bin2 + " = " + sumResult);
        System.out.println("Произведение " + bin1 + " и " + bin2 + " = " + multResult);
    }
}