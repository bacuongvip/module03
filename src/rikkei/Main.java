package rikkei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap chieu rong");
        double width = Double.parseDouble(sc.nextLine());
        Rectangle rectangle1 = new Rectangle(height, width);
        System.out.println("dien tich:" + rectangle1.getArea());
        System.out.println("Chu vi:" + rectangle1.getPerimeter());
    }
}
