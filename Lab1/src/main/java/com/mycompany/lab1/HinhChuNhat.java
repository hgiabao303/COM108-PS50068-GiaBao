/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author hgiab
 */
import java.util.Scanner;
public class HinhChuNhat{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Nhap Chieu Dai: ");
double chieuDai = sc.nextDouble();
System.out.print("Nhap Chieu Rong: ");
double chieuRong =sc.nextDouble();
double chuVi = (chieuDai + chieuRong)*2;
double dienTich = chieuDai * chieuRong;
System.out.println("Chu vi HCN: " +chuVi);
System.out.println("Dien tich HCN: " +dienTich);
sc.close();

}    
}