package br.com.aldenor.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestaoMatrizes {

    public static void main(String[] args) {
        int[][] matrizes = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você precisará fornecer informações sobre uma matriz 4x4. Começando...");
        for(int line = 0; line <= 3; line++) {
            for (int column = 0; column <= 3; column++){
                System.out.println("Digite o dado sobre a " + (line+1) + " linha e a " + (column+1) + " coluna.");
                String valueString = scanner.next();
                if(isNumber(valueString)) {
                    int value = Integer.parseInt(valueString);
                    matrizes[line][column] = value;
                } else {
                    column--;
                    System.out.println("Digite um valor valido.");
                }
            }
        }
        for(int line = 0; line <= 3; line++) {
            for (int column = 0; column <= 3; column++) {
                System.out.print("["+matrizes[line][column]+"] ");
            }
            System.out.println();
        }
        int somaDiagonalPrinciapal = 0;
        int somaDiagonalSecundaria = 0;
        for (int principal = 0; principal < 4; principal++) {
            somaDiagonalPrinciapal = somaDiagonalPrinciapal+matrizes[principal][principal];
        }
        for(int secundaria = 0; secundaria < 4; secundaria++) {
            somaDiagonalSecundaria = somaDiagonalSecundaria+matrizes[secundaria][matrizes.length-1-secundaria];
        }
        String positionAcima = "";
        int valueAcima = 0;
        for (int i = 0; i < matrizes.length; i++) {
            for(int j = i+1; j < matrizes[i].length; j++) {
                if(matrizes[i][j] > valueAcima) {
                    valueAcima = matrizes[i][j];
                    positionAcima = "["+(1+i)+"]" + " " + "["+(1+j)+"]";
                }
            }
        }

        String positionAbaixo = "";
        int valueAbaixo = Integer.MAX_VALUE;
        for(int i = 0; i < matrizes.length; i++) {
            for(int j = 0; j < i; j++) {
                if(matrizes[i][j] < valueAbaixo) {
                    valueAbaixo = matrizes[i][j];
                    positionAbaixo = "["+(1+i)+"]" + " " + "["+(1+j)+"]";
                }
            }
        }

        System.out.println("Diferença entre a diagonal principal e a diagonal secundária: " + (somaDiagonalPrinciapal-somaDiagonalSecundaria));
        System.out.println("O valor maior da diagonal acima da principal é: " + valueAcima + " e está na posição " + positionAcima);
        System.out.println("O valor menor abaixo da diagonal principal é: " + valueAbaixo + " e está na posição " + positionAbaixo);
    }

    public static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception ignore) {
            return false;
        }
    }

}
