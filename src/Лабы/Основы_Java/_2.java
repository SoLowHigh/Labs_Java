package Лабы.Основы_Java;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        // ВВОД ДАННЫХ
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        // ПЕРЕМНОЖЕНИЕ
        double multiply = a * b * c;
        System.out.println("A * B * C = "+multiply);

        // СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ
        double medium = (a + b + c) / 3;
        System.out.println("(A+B+C)/3 = "+String.format("%f,3",medium));

        // СОРТИРОВКА ПО ВОЗРАСТАНИЮ
        // ЕСЛИ ПРОГА НЕПРАВИЛЬНО ОТСОРТИРУЕТ ВЕЛИЧИНЫ, ВЫВЕДЕТСЯ 4 0 4
        double min=4, mid=0, max=4;
        if (a<b) {
            if (b<c) {
                min=a; mid=b; max=c;
            }
            if (c<a) {
                min=c; mid=a; max=b;
            }
            if (a<c && c<b) {
                min=a; mid=c; max=b;
            }
        }
        if (b<a) {
            if (a<c) {
                min=b; mid=a; max=c;
            }
            if (c<b) {
                min=c; mid=b; max=a;
            }
            if (b<c && c<a) {
                min=b; mid=c; max=a;
            }
        }
        System.out.println("<: "+min+"; ~: "+mid+"; >:"+max);
    }
}
