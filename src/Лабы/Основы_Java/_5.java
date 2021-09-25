package Лабы.Основы_Java;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        double x0, xN, h, x, y;
        Scanner scan = new Scanner(System.in);
        while(true) {
            boolean I = false;
            System.out.print("(I)nterval or [S]egment? ");
            String type = scan.next();
            if ("I".equals(type)) { I = true; break; }
            else if ("S".equals(type)) { I = false; break; }
            else { System.out.println("Давай попробуем ещё раз..."); }
        } // ИНТЕРВАЛ ИЛИ ОТРЕЗОК ?
        {
            System.out.print("X0 = ");
            x0 = scan.nextDouble();
            System.out.print("XN = ");
            xN = scan.nextDouble();
            System.out.print("h = ");
            h = scan.nextDouble();
            System.out.println("------------");
        } // ВВОД ПЕРЕМЕННЫХ

        if (xN < x0) {
            x = x0;
            x0 = xN;
            xN = x;
            x = 404;
        } // КРУЧУ, ВЕРЧУ...

        for (x=x0;x<=xN;x+=h) {
            y = Math.sin(x);
            System.out.println("sin("+x+") = "+y+";"); // ДОДЕЛАТЬ, ПОКА ТУФТА
        }
    }
}
