public class ExemploIf {
    public static void main(String[] args) {
       int resultado=1;

       if(resultado>=1 && resultado<5){
           System.out.println("Seu resultado esta entre 1 e 5");
       }else if (resultado>=5 && resultado<8){
        System.out.println("Seu resultado esta entre 5 e 8");
       }else {
           System.out.println("resultado acima de 8");

       }
    }
}