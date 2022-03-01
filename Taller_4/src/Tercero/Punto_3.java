package Tercero;

public class Punto_3 {
    private int num,n,contador;

    public void Punto_3(){

       System.out.println("Numeros primos del 1 al 1000");
        for(num = 1; num <= 1000; num++){
            n=1;
            contador=0;
            while (n <= num){
                if (num % n == 0){
                    contador=contador+1;
                }
                n = n+1;
            }
            if(contador == 2){
                System.out.println("Numero primo: "+ num);

            }
        }
    }

}
