package forewhile;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);

        System.out.println("deseja gerar alguma tabuada?");
        String resposta=s.next();

        while (resposta.equals("sim")){
            System.out.println("Digite um numero para gerar a tabuada");
            int num=s.nextInt();
            for (int i=0;i<=10;i++){
                System.out.println(num + "X" + i + "=" + num*i);
            }

            System.out.println("Deseja gerar outra tabuada? ");
        }

        System.out.println("Obrigado. ");
    }

}
