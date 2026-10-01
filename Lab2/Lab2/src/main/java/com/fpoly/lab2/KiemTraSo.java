/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab2;

/**
 *
 * @author hgiab
 */
import java.util.Scanner;
public class KiemTraSo{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if (n % 2 ==0){
System.out.println(n+": la so chan");
}else{
System.out.println(n+": la so le");
}if (n >0){
System.out.println(n+": la so duong");
}else if(n <0){
System.out.println(n+": la so am");
}else{
System.out.println(n+": bang 0");
}
sc.close();

}
}







