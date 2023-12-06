package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double soma , media;
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = ler.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Valor: ");
            vet[i] = ler.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < vet.length; i++){
            soma += vet[i];
        }

        media = 0;
        media = soma/ vet.length;

        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + ", ");
        }
        System.out.println();
        System.out.println("soma dos VALORES: " + soma);
        System.out.println("media do VALORES: " + media);

        ler.close();
    }
}
