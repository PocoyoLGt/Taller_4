package Cuarto;

public class Punto_4 {
    private int f,c;
    public void Punto_4(){
        int[][] Matriz = new int[4][5];
        Matriz[0][0]= 01;Matriz[0][1] = 02; Matriz[0][2] = 03; Matriz[0][3] = 04; Matriz[0][4] = 05;
        Matriz[1][0]= 06;Matriz[1][1] = 07; Matriz[1][2] = 8; Matriz[1][3] = 9; Matriz[1][4] = 10;
        Matriz[2][0]= 11;Matriz[2][1]= 12; Matriz[2][2] = 13; Matriz[2][3] = 14; Matriz[2][4] = 15;
        Matriz[3][0]= 16;Matriz[3][1] = 17; Matriz[3][2] = 18; Matriz[3][3] = 19; Matriz[3][4] = 20;

        for (f =0 ; f< Matriz.length; f++){
            for (c = 0 ; c<Matriz[f].length; c++){
                System.out.print(Matriz[f][c] +" " );
            }
            System.out.println(" ");
        }
        System.out.println("Segunda Matriz");
        for (f =0 ; f<= 0; f++){
            for (c = 0 ; c<= 4; c++){
                System.out.print(Matriz[f][c] +" " );
            }
            System.out.println(" ");
        }
        for (f =1 ; f<= 1; f++){
            for (c = 4 ; c>=0; c--){
                System.out.print(Matriz[f][c] +" " );
            }
            System.out.println(" ");
        }
        for (f =2 ; f<= 2; f++){
            for (c = 0 ; c<=4; c++){
                System.out.print(Matriz[f][c] +" " );
            }
            System.out.println(" ");
        }
        for (f =3 ; f<= 3; f++){
            for (c = 4 ; c>=0; c--){
                System.out.print(Matriz[f][c] +" " );
            }
            System.out.println(" ");
        }










    }
}
