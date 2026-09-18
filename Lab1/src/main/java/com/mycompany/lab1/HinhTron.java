/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 final double PI = 3.14159;

System.out.print("Nhap ban kinh: ");
double banKinh = sc.nextDouble();

double chuVi = 2 * PI * banKinh;
double dienTich = PI * banKinh * banKinh;

System.out.printf("Chu vi hinh tron: %.2f\n", chuVi);
System.out.printf("Dien tich hinh tron: %.2f\n", dienTich);

sc.close();
    }
}
