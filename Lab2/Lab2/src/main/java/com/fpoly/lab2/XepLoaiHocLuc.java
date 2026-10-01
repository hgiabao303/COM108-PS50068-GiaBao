/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hgiab
 */

package com.fpoly.lab2;
import java.util.Scanner;
public class XepLoaiHocLuc{
   public static void main(String[]agrs){
       Scanner sc = new Scanner(System.in);
  System.out.print("nhap diem toan: ");
  double toan = sc.nextDouble();
  System.out.print("nhap diem ly: ");
  double ly = sc.nextDouble();
  System.out.print("nhap diem hoa: ");
  double hoa = sc.nextDouble();
  
   if(toan<0||toan>10||ly<0||ly>10||hoa<0||hoa>10){
   System.out.print("diem khong hop le");
   return;
   }
   double dtb = ( toan *2 + ly + hoa )/4;
   String xepLoai;
   if (dtb >=8.0){
   xepLoai ="gioi";
   }else if (dtb >=6.5){
   xepLoai ="kha";
   }else if (dtb >=5.0){
   xepLoai ="TB";
   }else{
   xepLoai ="Yeu";
   }
   System.out.printf("Diem trung binh: %.2f\n", dtb );
   System.out.println("Xep loai: " + xepLoai);
   sc.close();
   }
   }
   
   
   
   
