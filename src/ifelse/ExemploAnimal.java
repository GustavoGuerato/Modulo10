package ifelse;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal:");
        String texto = s.next();
        String animal=exampleOfIF(texto);
        System.out.println(animal);
    }
    public static String exampleOfIF(String animal){
        String result;
        if (animal.equals("cachorro")||animal.equals("gato")){
            result="animal dosmetico";
        }else if(animal.equals("tigre")|| animal.equals("leao")) {
            result="animal selvagem";
        }else {
            result="animal desconhecido";
        }
        return result;
    }
}
