package Quinto;

import java.util.Scanner;

public class Punto_5 {
    private boolean estado;
    private int f,c;
    private Scanner input;

    public void Punto_5(){
        this.input = new Scanner(System.in);
        int[][] matrizr = new int[10][10];
        String[][] matriz = new String[10][10];

        matriz[0][0]= "1x1";  matriz[0][1]= "2x1"; matriz[0][2]=  "3x1"; matriz[0][3]= "4x1"; matriz[0][4]= "5x1"; matriz[0][5]=  "6x1"; matriz[0][6]="7x1"; matriz[0][7]=  "8x1"; matriz[0][8]= "9x1"; matriz[0][9]= "10x1";
        matriz[1][0]= "1x2";  matriz[1][1]= "2x2"; matriz[1][2]= "3x2"; matriz[1][3]= "4x2"; matriz[1][4]= "5x2"; matriz[1][5]=  "6x2"; matriz[1][6]= "7x2"; matriz[1][7]=  "8x2"; matriz[1][8]= "9x2"; matriz[1][9]= "10x2";
        matriz[2][0]= "1x3";  matriz[2][1]= "2x3"; matriz[2][2]= "3x3"; matriz[2][3]= "4x3"; matriz[2][4]= "5x3"; matriz[2][5]= "6x3"; matriz[2][6]= "7x3"; matriz[2][7]=  "8x3"; matriz[2][8]= "9x3"; matriz[2][9]= "10x3";
        matriz[3][0]= "1x4";  matriz[3][1]="2x4"; matriz[3][2]= "3x4"; matriz[3][3]= "4x4"; matriz[3][4]= "5x4"; matriz[3][5]=  "6x4"; matriz[3][6]= "7x4"; matriz[3][7]=  "8x4"; matriz[3][8]= "9x4"; matriz[3][9]= "10x4";
        matriz[4][0]= "1x5";  matriz[4][1]= "2x5"; matriz[4][2]= "3x5"; matriz[4][3]= "4x5"; matriz[4][4]= "5x5"; matriz[4][5]=  "6x5"; matriz[4][6]= "7x5"; matriz[4][7]=  "8x5"; matriz[4][8]= "9x5"; matriz[4][9]= "10x5";
        matriz[5][0]= "1x6";  matriz[5][1]= "2x6"; matriz[5][2]= "3x6"; matriz[5][3]= "4x6"; matriz[5][4]= "5x6"; matriz[5][5]=  "6x6"; matriz[5][6]= "7x6"; matriz[5][7]=  "8x6"; matriz[5][8]= "9x6"; matriz[5][9]= "10x6";
        matriz[6][0]= "1x7";  matriz[6][1]= "2x7"; matriz[6][2]= "3x7"; matriz[6][3]= "4x7"; matriz[6][4]= "5x7"; matriz[6][5]=  "6x7"; matriz[6][6]= "7x7"; matriz[6][7]=  "8x7"; matriz[6][8]= "9x7"; matriz[6][9]= "10x7";
        matriz[7][0]= "1x8";  matriz[7][1]= "2x8"; matriz[7][2]= "3x8"; matriz[7][3]= "4x8"; matriz[7][4]= "5x8"; matriz[7][5]=  "6x8"; matriz[7][6]= "7x8"; matriz[7][7]=  "8x8"; matriz[7][8]= "9x8"; matriz[7][9]= "10x8";
        matriz[8][0]= "1x9";  matriz[8][1]="2x9"; matriz[8][2]= "3x9"; matriz[8][3]= "4x9"; matriz[8][4]= "5x9"; matriz[8][5]=  "6x9"; matriz[8][6]= "7x9"; matriz[8][7]=  "8x9"; matriz[8][8]= "9x9"; matriz[8][9]= "10x9";
        matriz[9][0]= "1x10"; matriz[9][1]= "2x10"; matriz[9][2]= "3x10"; matriz[9][3]= "4x10"; matriz[9][4]= "5x10"; matriz[9][5]=  "6x10"; matriz[9][6]= "7x10"; matriz[9][7]=  "8x10"; matriz[9][8]= "9x10"; matriz[9][9]= "10x10";


        matrizr[0][0]= 1;  matrizr[0][1]= 2; matrizr[0][2]= 3; matrizr[0][3]= 4; matrizr[0][4]= 5; matrizr[0][5]= 6; matrizr[0][6]= 7; matrizr[0][7]= 8; matrizr[0][8]=9; matrizr[0][9]= 10;
        matrizr[1][0]= 2;  matrizr[1][1]= 4; matrizr[1][2]= 6; matrizr[1][3]= 8; matrizr[1][4]= 10; matrizr[1][5]= 12; matrizr[1][6]= 14; matrizr[1][7]= 16; matrizr[1][8]= 18; matrizr[1][9]= 20;
        matrizr[2][0]= 3;  matrizr[2][1]= 6; matrizr[2][2]= 9; matrizr[2][3]= 12; matrizr[2][4]= 15; matrizr[2][5]= 18; matrizr[2][6]= 21; matrizr[2][7]=24; matrizr[2][8]=27; matrizr[2][9]= 30;
        matrizr[3][0]= 4;  matrizr[3][1]= 8; matrizr[3][2]= 12; matrizr[3][3]= 16; matrizr[3][4]= 20; matrizr[3][5]= 24; matrizr[3][6]= 28; matrizr[3][7]= 32; matrizr[3][8]= 36; matrizr[3][9]= 40;
        matrizr[4][0]= 5;  matrizr[4][1]= 10; matrizr[4][2]= 15; matrizr[4][3]= 20; matrizr[4][4]= 25; matrizr[4][5]= 30; matrizr[4][6]= 35; matrizr[4][7]= 40; matrizr[4][8]= 45; matrizr[4][9]= 50;
        matrizr[5][0]= 6;  matrizr[5][1]= 12; matrizr[5][2]= 18; matrizr[5][3]= 24; matrizr[5][4]= 30; matrizr[5][5]= 36; matrizr[5][6]= 42; matrizr[5][7]= 48; matrizr[5][8]= 54; matrizr[5][9]= 60;
        matrizr[6][0]= 7;  matrizr[6][1]= 14; matrizr[6][2]= 21; matrizr[6][3]= 28; matrizr[6][4]= 35; matrizr[6][5]= 42; matrizr[6][6]= 49; matrizr[6][7]= 56; matrizr[6][8]= 63; matrizr[6][9]= 70;
        matrizr[7][0]= 8;  matrizr[7][1]= 16; matrizr[7][2]= 24; matrizr[7][3]= 32; matrizr[7][4]= 40; matrizr[7][5]= 48; matrizr[7][6]= 56; matrizr[7][7]= 64; matrizr[7][8]= 72; matrizr[7][9]= 80;
        matrizr[8][0]= 9;  matrizr[8][1]= 18; matrizr[8][2]= 27; matrizr[8][3]= 36; matrizr[8][4]= 45; matrizr[8][5]= 54; matrizr[8][6]= 63; matrizr[8][7]= 72; matrizr[8][8]= 81; matrizr[8][9]= 90;
        matrizr[9][0]= 10; matrizr[9][1]= 20; matrizr[9][2]= 30; matrizr[9][3]= 40; matrizr[9][4]= 50; matrizr[9][5]=60; matrizr[9][6]= 70; matrizr[9][7]= 80; matrizr[9][8]= 90; matrizr[9][9]= 100;
        estado = true;
        while (estado== true){
            for (f =0 ; f< matriz.length; f++){
                for (c = 0 ; c< matriz[f].length; c++){
                    System.out.print(matriz[f][c] +" " );
                }
                System.out.println(" ");
            }
            for (f =0 ; f<= 9; f++){
                for (c = 0 ; f<=9; c++){
                    System.out.println(" -----------------------");
                    System.out.println("Inserte la fila del resultado que desea ver ");
                    this.f = this.capturarDatoInt();
                    f=f-1;
                    System.out.println(" Inserte la columna del resultado que desea ver");
                    this.c = this.capturarDatoInt();
                    c=c-1;
                    System.out.println(" El valor es:");
                    System.out.print(matrizr[f][c]);
                    System.out.println("¿ Desea continuar?");
                    this.estado = this.capturarBoolean();



                }
                System.out.println(" ");
            }





        }

    }
    private int capturarDatoInt() {return this.input.nextInt();}
    private  boolean capturarBoolean(){

        return this.input.nextBoolean();
    }

}
