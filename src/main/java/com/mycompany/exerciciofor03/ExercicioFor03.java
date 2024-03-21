/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
      
Resumo: Você digitará um número para quantidade de número que o programa irá usar para fazer a média
      
ENTRADA
3
6.5 
4.3
6.2
      
SAIDA
5.7
*/

package com.mycompany.exerciciofor03;

import java.util.Scanner;

public class ExercicioFor03 {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in); 
        
          int n;
          double x = 0; //= teclado.nextDouble();
          double x1 = 0;
          double x2 = 0;
          double x3 = 0;
          double resultado;
          
          System.out.printf("Escolha 3 números para dividir.\n", n = 3);
          
          for(n=0; n <= x; n++){
              
            if (n <= 3) {
              System.out.printf("primeiro número: ");x = teclado.nextDouble();
              System.out.printf("segundo número: ");x1 = teclado.nextDouble();
              System.out.printf("terceiro número: ");x2 = teclado.nextDouble();
              resultado = (x + x1 + x2) /3;
              System.out.printf("Resultado: %.2f ",resultado);
              break;
            } 
        }  
    }
}

