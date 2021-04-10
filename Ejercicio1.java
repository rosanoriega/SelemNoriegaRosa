package Ejercicios_Clase_4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        int suma =0;

        int [] horas = new int [10];

        for(int i=0; i<horas.length; i++){
            System.out.println("Ingrese un número");
            int num = input.nextInt();
            horas[i] = num;
            suma = suma + horas[i];

        }

            System.out.println("La suma total es " + suma);

            System.out.println("El promedio de la semana fue de " + suma / horas.length);
        }



        }




