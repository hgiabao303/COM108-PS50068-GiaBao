/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;
public class NhapHoTen {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Nhap ho ten: ");
String hoTen = sc.nextLine();

System.out.print("Nhap nam sinh: ");
int namSinh = sc.nextInt();

int tuoi = 2026 - namSinh;

System.out.println("Ho ten: " + hoTen);
System.out.println("Tuoi: " + tuoi);

sc.close();
}
}