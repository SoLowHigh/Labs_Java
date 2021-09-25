package Лабы.Основы_Java;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class _4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c; int flag = -2;
        // ВВОД ДАННЫХ
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if (a==0) {
            System.out.println("Это не квадратное уравнение"); return;
        }

        // ВЫЧИСЛЕНИЯ КОРНЕЙ
        // ЕСЛИ ВЫЧИСЛЕНИЯ ПОЙДУТ НЕ ТУДА, ВЫВЕДЕТСЯ 404
        double D = sqrt(b*b - 4*a*c);
        double x1=404, x2=404;
        if (D>=0) {
            x1 = (-b - sqrt(D)) / (2 * a);
            x2 = (-b + sqrt(D)) / (2 * a);
            if (D>0) flag=1; else flag=0;
        }
        else flag=-1;

        // ВЫВОД КОРНЕЙ
        switch (flag) {
            case -1: System.out.println("Нет X1, X2 из R"); break;
            case 0: System.out.println("X = "+x1); break;
            case 1: System.out.println("X1 = "+x1+"; X2 = "+x2); break;
            case -2: System.out.println("Разраб лох"); break;
        }
    }
}