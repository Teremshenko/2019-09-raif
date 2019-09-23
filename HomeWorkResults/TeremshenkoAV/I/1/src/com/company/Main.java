package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //определяем рандомное число
        Random rand = new Random();
        System.out.println("Введите число от 0 до 50");
        Scanner myObj = new Scanner(System.in);


        int randomNumber=rand.nextInt(50);
        int interval=5;  //интервал относительно числа, внутри которого будет Горячо
        int leftInterval=randomNumber-interval;
        int rightInterval=randomNumber+interval;


        System.out.println("Загаданное число "+randomNumber);

        boolean flag=true; //перемнная для того, чтобы понять когда остановить цикл
        int number;

        while (flag) {
            number = myObj.nextInt();
            if (number==randomNumber){
                System.out.println("Успех!");
                flag=false;
            }
            if(flag!=false){
                if(number>rightInterval || number<leftInterval ){
                    System.out.println("Холодно!");
                }
                else {System.out.println("Горячо!");}
            }

        }


    }
}
