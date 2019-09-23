package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        boolean flag=true; //перемнная для того, чтобы понять когда остановить цикл

        while (flag) {
            System.out.println("Если хотите остановиться введите '666'");
            System.out.println("Введите задание: ");
            String task = myObj.nextLine().replace(" ","");
            String strArr[] = task.split("");
            double result=0.0;
            int x=0;
            try {
                x= Integer.parseInt(strArr[0]);
            } catch (NumberFormatException e){System.out.println("Слева от знака не цифра, попробуйте ещё");continue;}


            int y=0;
            try {
                y= Integer.parseInt(strArr[2]);
            } catch (NumberFormatException e){System.out.println("Справа от знака не цифра, попробуйте ещё");continue;}




            switch ((strArr[1])){
                case "+":
                    result=x+y;
                    break;
                case "-":
                    result=x-y;
                    break;
                case "*":
                    result=x*y;
                    break;
                case "/":
                    try{
                    result=x/y;}
                    catch (ArithmeticException ae){
                        int z=0;
                        System.out.println("Я не умею делить на 0. Введи другое число, на которое нужно поделить");
                        try {
                        z= Integer.parseInt(myObj.nextLine());}
                        catch (NumberFormatException e){System.out.println("Давай попробуем заново");continue;}
                        try{result=x/z;}
                        catch (ArithmeticException aex){System.out.println("Давай попробуем заново");continue;}
                    }
                    break;
                case "6":
                    flag=false;
                    break;
            }

        System.out.println("Ответ: "+result);
        }

        }}


