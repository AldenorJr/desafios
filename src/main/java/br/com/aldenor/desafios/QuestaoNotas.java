package br.com.aldenor.desafios;

import java.util.Scanner;

public class QuestaoNotas {

    public static void main(String[] args) {
        Double[] vector = new Double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular sua nota, digite as suas 3 notas, lembre-se, que nem uma pode ser maior que 10 ou menor que 0.");
        int x = 0;
        System.out.println("Digite sua primeira " + (x + 1) + " nota");
        while (x != 3) {
            double value = scanner.nextDouble();
            if (value <= 10 && value >= 0) {
                vector[x] = value;
                x++;
                if (x != 3) System.out.println("Digite sua primeira " + (x + 1) + " nota");
            } else System.out.println("Digite um valor maior ou igual a 0 ou menor ou igual a 10");
        }
        double soma = 0;
        for (x = 0; x < 3; x++) {
            soma = soma + vector[x];
        }
        System.out.println(soma);
        double media = soma / 3;
        String nota = "Impossível calcular";
        if (media >= 8.5) nota = "A";
        if (media >= 6.5 && media < 8.5) nota = "B";
        if (media >= 4.0 && media < 6.5) nota = "C";
        if (media < 4) nota = "D";
        System.out.println("A nota do aluno é igual a " + nota + ".");
    }

}
