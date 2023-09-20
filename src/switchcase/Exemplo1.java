package switchcase;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade= s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade){
        String result = switch (idade) {
            case 0, 5 -> "voce é um bebe";
            case 6, 10 -> "voce é uma criança";
            case 11, 18 -> "voce é um adolescente";
            default -> "voce é um adulto";
        };
        return result;
    }
}
