package br.uniesp.POO;

import java.util.Scanner;
import java.util.Random;

public class Ted01While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(10);
        System.out.println(numeroAleatorio);

        int numeroEntrada;
        int tentativas = 1;

        System.out.println("Coloque um número de 1 a 10: ");

        numeroEntrada = scan.nextInt();


        while (numeroEntrada != numeroAleatorio) {

            if (numeroEntrada > numeroAleatorio) {
                System.out.println("Errou!!! Coloque um número menor.");
                numeroEntrada = scan.nextInt();
                tentativas++;
            }
            else if (numeroEntrada < numeroAleatorio) {
                System.out.println("Errou!!! Coloque um número maior.");
                numeroEntrada = scan.nextInt();
                tentativas++;
            }
        }

        if (numeroEntrada == numeroAleatorio) {

            System.out.println("Ok!!! Você acertou. O número: " + numeroAleatorio + " em: " + tentativas + " tentativas.");

        }

        System.out.println("Tentativas: " + tentativas);
    }

}
