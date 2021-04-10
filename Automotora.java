package Practico_5_clase;

import java.util.Scanner;

public class Automotora {

    public static void main(String [] args){
        Camion c1= new Camion();
        Camion c2=new Camion("Azul");
        Camion c3= new Camion("Verde", 1100);

        c1.setColor("Rojo");
        c1.setChapa(900);

        c2.setAñoCompra(1990);

        System.out.println("El color del camion c1 " + c1.getColor());
        System.out.println("El color del camion c1 " + c1.getChapa());

        System.out.println("El color del camion c3 " + c3.getColor());
        System.out.println("El color del camion c3 " + c3.getChapa());

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el color del camión c3: ");
        String nuevoColor= input.next();
        c3.setColor(nuevoColor);
        System.out.println("Actualizando color del camion.....");
        System.out.println("El color del camion c3 es "+ c3.getColor());

        System.out.println("*******************");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);



    }
}
