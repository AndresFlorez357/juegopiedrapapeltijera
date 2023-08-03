package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Random generador=new Random();//*******************Generador de numeros aleatorios************
        //*************************declarando variables******************************************
        String opcionPc;
        String opcionHumano;
        int marcadorHumano;
        int marcadorPc;
        int  marcadorEmpate;
        int numeroDeJuegos;
        int x;
        marcadorHumano=0;
        marcadorPc=0;
        marcadorEmpate=0;
        x=1;

        //****************************************************************************************************************************************
        //*********************************************Proceso************************************************************************************
        System.out.print("Ingresa La Cantidad de Juegos que Deseas Realizar: ");

        numeroDeJuegos=teclado.nextInt();//Se ingresa el numero de juegos


        do {


            Integer numeroAleatorio = generador.nextInt(3) + 1;//***************Inicializando generador de numeros aleatorios**************************
            // System.out.println(numeroAleatorio);
            //obteniendo la opcion del pc

            switch (numeroAleatorio) {
                case 1:
                    opcionPc = "tijera";
                    break;
                case 2:
                    opcionPc = "piedra";
                    break;
                case 3:
                    opcionPc = "papel";
                    break;
                default:
                    opcionPc = null;//*********************Si no hay caso no asigne nada**************************************************
                    break;
            }
           // System.out.println("la opcion aleatorio es " + opcionPc);
            System.out.print("Escriba piedra, papel o tijera: ");
            do {                                                             //este bukle es para validar la entrada  del dato**********
                opcionHumano = teclado.nextLine().toLowerCase();             //*********************************************************
            }while (!opcionHumano.matches("piedra|papel|tijera"));     //*********************************************************


            //comparando la opcion humano con la opcion pc

            if (opcionHumano.equals("tijera") && opcionPc.equals("papel")) {
                System.out.println("***************(Usted Gana)***************");
                marcadorHumano++;

            } else if (opcionHumano.equals("tijera") && opcionPc.equals("piedra")) {
                System.out.println("***************(pc gana)******************");
                marcadorPc++;

            } else if (opcionHumano.equals("tijera") && opcionPc.equals("tijera")) {
                System.out.println("***************(empate)*******************");
                marcadorEmpate++;

            } else if (opcionHumano.equals("piedra") && opcionPc.equals("tijera")) {
                System.out.println("****************(Usted Gana)*****************");
                marcadorHumano++;

            } else if (opcionHumano.equals("piedra") && opcionPc.equals("papel")) {
                System.out.println("***************(pc gana)*********************");
                marcadorPc++;

            } else if (opcionHumano.equals("piedra") && opcionPc.equals("piedra")) {
                System.out.println("*****************(empate)*********************");
                marcadorEmpate++;

            } else if (opcionHumano.equals("papel") && opcionPc.equals("piedra")) {
                System.out.println("****************(Usted Gana)******************");
                marcadorHumano++;

            } else if (opcionHumano.equals("papel") && opcionPc.equals("tijera")) {
                System.out.println("***************(pc gana)*******************");
                marcadorPc++;

            } else if (opcionHumano.equals("papel") && opcionPc.equals("papel")) {
                System.out.println("*****************(empate)********************");
                marcadorEmpate++;

            }
            System.out.println("Resultados: Usteescribio: "+opcionHumano+" El Pc eligio: "+opcionPc);
            x++;
        }while (x<=numeroDeJuegos);

        System.out.println("******marcadores:***********");
        System.out.println("Numero de victorias Humano: "+marcadorHumano);
        System.out.println("Numero de victorias Pc: "+marcadorPc);
        System.out.println("Numero de empates: "+marcadorEmpate);

        if (marcadorHumano>marcadorPc){
            System.out.println("***************(Humano Campeon)***************************");
        } else if (marcadorPc>marcadorHumano) {
            System.out.println("*****************(Campeon Pc)*****************************");
        }else {

            System.out.println("***********(Empate)**********************");
        }

    }
}