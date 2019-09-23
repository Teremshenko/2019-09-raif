package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Введите номер карты:");
        String cardNumber = myObj.nextLine().replace(" ","");
        System.out.println(cardNumber);

        int numItems=cardNumber.length();
        //System.out.println(numItems);

        if(checkEven(numItems)){
            forEven(cardNumber,0);
        }
        else {forEven(cardNumber,1);}
    }
    static boolean checkEven(int a){
        return (a%2==0);
    }

    public static int[] convertToArr(String strs){
        String strArr[] = strs.split("");
        int arrayNum[]= new int[strs.length()];
        for(int i = 0; i < strArr.length; i++){
            arrayNum[i]=Integer.parseInt(strArr[i]);
        }
        return arrayNum;
    }
    public static void forEven(String str,int ch){
        int arrayNum[]=convertToArr(str);//преобразуем строку в массив цифр

        int sum=0;
        for(int i = ch; i < arrayNum.length; i=i+2){
            int doubling;
            if(arrayNum[i]*2-9>0){
                doubling=arrayNum[i]*2-9;
            }
            else doubling=arrayNum[i]*2;
            //System.out.println("dou "+doubling);
            sum=sum+doubling;
            //System.out.println("sum "+sum);
        }
        if (ch==0){for(int i = 1; i < arrayNum.length; i=i+2){sum=sum+arrayNum[i];}}
        else{for(int i = 0; i < arrayNum.length; i=i+2){sum=sum+arrayNum[i];}}
        //System.out.println("final sum+ "+sum);
        if(sum%10==0){
            System.out.println("Карта валидна");
        }
        else {
            System.out.println("Карта невалидна");
        }
    }
}
