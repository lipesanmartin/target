//5) Escreva um programa que inverta os caracteres de um string.
//
//
//IMPORTANTE:
//
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//
//b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class Teste5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string para inverter: ");
        String string = sc.nextLine();
        StringBuilder invertida = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            invertida.append(string.charAt(i));
        }
        System.out.println("String invertida: " + invertida);
    }
}
