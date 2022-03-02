package Segundo;

import java.util.HashMap;
import java.util.Random;

public class Punto_2 {
    private int num,i,anum;

    public void Punto_2(){
        int pares = 0;
        int impares =0;
        HashMap<Integer, Integer> NumerosPares = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> NumerosImPares = new HashMap<Integer, Integer>();


        int[] Num = new int[20];

        System.out.println("Numeros pares e impares");
        for (i = 0; i < Num.length ; i++) {

            Num[i] = new Random().nextInt(100);
            System.out.print(Num[i]+" ");


        }
        System.out.print("  ");
        for (int i = 0; i < 20;i++) {
            if (Num[i] % 2 == 0) {
                NumerosPares.put(pares,Num[i]);
               // Par[pares] = Num[i];
                pares++;


            } else {
                NumerosImPares.put(impares,Num[i]);
                //ImPar[impares] = Num[i];
                impares++;

            }

        }

        System.out.print("Numeros pares: ");
        for (int i=0; i < NumerosPares.size(); i++){

                System.out.print(NumerosPares.get(i)+" - ");



       }
        System.out.println(" ");

        System.out.print("Numeros impares: ");
        for (int i=0; i < NumerosImPares.size(); i++){

                System.out.print(NumerosImPares.get(i)+" - ");


       }
        System.out.println(" ");


    }
}
