package Primero;

import java.util.Scanner;

public class Punto_1 {
    private String Usuario;
    private int indice;
    private boolean verificacion;
    private Scanner input;

    public void Punto_1(){
        this.input = new Scanner(System.in);
        int[] Datos = new int[5];
        System.out.println("Digite su nombre");
        this.Usuario = this.capturarDatoString();
        System.out.println(Usuario+" Digite su edad");
        Datos[0]= this.capturarDatoInt();
        System.out.println(" Digite la edad de su mama");
        Datos[1]= this.capturarDatoInt();
        System.out.println(" Digite la edad de su papa");
        Datos[2]= this.capturarDatoInt();
        System.out.println(" Digite la edad de su mejor amigo");
        Datos[3]= this.capturarDatoInt();
        System.out.println(" Digite la edad de su hermano o hermana");
        Datos[4]= this.capturarDatoInt();

        System.out.println(" -----------------------------");

        System.out.println(" EDADES");
        System.out.println(Usuario+": "+Datos[0]);
        System.out.println("Mama de "+Usuario+": "+Datos[1]);
        System.out.println("Padre de "+Usuario+": "+Datos[2]);
        System.out.println("Amigo de "+Usuario+": "+Datos[3]);
        System.out.println("Hermano de "+Usuario+": "+Datos[4]);

        System.out.println("¿Es correcta la informacion?");
        this.verificacion = this.capturarBoolean();
        for(int indice= 0 ; indice <= 4 ; indice++){

            System.out.println("Posicion "+"["+indice+"]"+" = "+Datos[indice]);
        }





    }
    private String capturarDatoString() {return this.input.nextLine();}
    private  boolean capturarBoolean(){

        return this.input.nextBoolean();
    }
    private int capturarDatoInt() {return this.input.nextInt();}

}
