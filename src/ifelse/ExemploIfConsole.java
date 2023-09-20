package ifelse;

import java.util.Scanner;

public class ExemploIfConsole {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int resultado=s.nextInt();

        if(resultado>=1 && resultado<5){
            System.out.println("Seu resultado esta entre 1 e 5");
        }else if (resultado>=5 && resultado<8){
            System.out.println("Seu resultado esta entre 5 e 8");
        }else {
            System.out.println("resultado acima de 8");

        }
    }
}
