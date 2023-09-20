package forewhile;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Digite o numero que voce quer descobrir a tabuada: ");
        int num=s.nextInt();
        for(int i=0; i<=10;i++){
            System.out.println(num + "X" + i + "=" + num*i);
        }
    }
}
