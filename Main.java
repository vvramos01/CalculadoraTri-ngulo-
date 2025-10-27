package com.company;
import java.util.Scanner;
public class Main {


   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
       System.out.println("Lado a: ");
       double l1 = sc.nextDouble();
       System.out.println("Lado b: ");
       double l2 = sc.nextDouble();
       System.out.println("Lado c: ");
       double l3 = sc.nextDouble();


       double p = (l1 + l2 + l3) / 2;
       double areaX = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
       System.out.println("Area do triangulo x: " + areaX);


       System.out.println("Lado a: ");
       l1 = sc.nextDouble();
       System.out.println("Lado b: ");
       l2 = sc.nextDouble();
       System.out.println("Lado c: ");
       l3 = sc.nextDouble();


       double p = (l1 + l2 + l3) / 2;
       double areaY = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
       System.out.println("Area do triangulo x: " + areaY);


       if(areaX > areaY){
           System.out.println("Triangulo X é maior!");
       }else{
           System.out.println("Triangulo Y é maior!");
       }
   }
}
