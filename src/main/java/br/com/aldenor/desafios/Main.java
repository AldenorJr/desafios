package br.com.aldenor.desafios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] vector = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular sua nota, digite as suas 3 notas, lembre-se, que nem uma pode ser maior que 10 ou menor que 0.");
        int x = 0;
        System.out.println("Digite sua primeira ª"+(x+1));
        while (x != 3) {
            String numberString = scanner.next();
            if(isNumber(numberString)) {
                int value = Integer.parseInt(numberString);
                if(value <= 10 && value >= 0) {
                    vector[x] = value;
                    x++;
                    if(x != 3) System.out.println("Digite sua primeira ª"+(x+1));
                } else System.out.println("Digite um valor maior ou igual a 0 ou menor ou igual a 10");
            } else System.out.println("Digite um numero valido.");
        }
        System.out.println(vector[0] + " "+ vector[1] +" "+ vector[2]);
        double media = (vector[0] + vector[1] + vector[2])/3;
        String nota = "Impossível calcular";
        if(media >= 8.5) nota = "A";
        if(media >= 6.5 && media < 8.5) nota = "B";
        if(media >= 4.0 && media < 6.5) nota = "C";
        if(media < 4) nota = "D";
        System.out.println("A nota do aluno é igual a " + nota + ".");
    }


    public static boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
