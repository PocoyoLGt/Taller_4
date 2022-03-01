package Segundo;

import java.util.Random;

public class Punto_2 {
    private int num,i,anum;

    public void Punto_2(){
        int pares = 0;
        int impares =0;


        int[] Num = new int[20];
        int[] Par = new int[pares];
        int[] ImPar = new int[impares];

        System.out.println("Numeros pares e impares");
        for (i = 0; i < Num.length ; i++) {

            Num[i] = new Random().nextInt(100);
            System.out.print(Num[i]+" ");

        }
        for (int i = 0; i < 20;i++) {
            if (Num[i] % 2 == 0) {
                Par[pares] = Num[i];
                pares++;


            } else {
                ImPar[impares] = Num[i];
                impares++;

            }

        }

        System.out.print("Numeros pares: ");
        for (int i=0; i < Par.length; i++){
            System.out.print(Par[i]+" - ");

        }
        System.out.println(" ");

        System.out.print("Numeros impares: ");
        for (int i=0; i < ImPar.length; i++){
            System.out.print(ImPar[i]+" - ");
        }
        System.out.println(" ");


    }
}
