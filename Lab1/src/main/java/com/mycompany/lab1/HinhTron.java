/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;
public class HinhTron {
public static void main(String[] agrs){
Scanner sc = new Scanner(System.in);
final double PI = 3.14159;
System.out.print("Nhap Ban Kinh: ");
double banKinh = sc.nextDouble();
double chuVi = 2*PI*banKinh;
double dienTich = PI*banKinh*banKinh;
System.out.printf("Chu vi HT: %.2f ", chuVi);
System.out.printf("Dien Tich HT: %.2f ", dienTich);

sc.close();
       
}
}
