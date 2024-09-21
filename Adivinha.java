import java.util.Random;
import java.util.Scanner;


public class Adivinha {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random random = new Random();
        int randomizado = random.nextInt(100);
        int tentativa = 0;
        while (tentativa < 6) {
            System.out.println("-------------------------------- ");
            System.out.println("INSIRA UM NUMERO AQUI!!!");
            int numero = lerTeclado.nextInt();                                      
            tentativa++;
            System.out.println("  ");
            System.out.println("TENTATIVA: " + tentativa);

            if (numero !=randomizado) {
                if (numero > randomizado) {
                    System.out.println("Esse numero é maior que #"  );
                    System.out.println(randomizado - 10 <= numero ? "ESTÁ QUENTE" : "ESTÁ FRIO");} 
                else if (numero < randomizado){
                    System.out.println("  ");
                    System.out.println("Esse numero é menor que #" );
                    System.out.println(randomizado + 10 >= numero ? "ESTÁ QUENTE" : "ESTÁ FRIO");} 
            } else {
                System.out.println("--------------------------------");
                System.out.println("VOCÊ ACERTOUUUU,O numero era : "+ randomizado );
                System.out.println("TOTAL DE TENTATIVAS: "+ tentativa);
                System.out.println("  ");
                break;
            }
              
        }
        if (tentativa == 6) {
            System.out.println("--------------------------------");
            System.out.println("Tentativas Esgotadas,VOCÊ PERDEU !!!!!!");
            System.out.println("O numero era: "+ randomizado);
            System.out.println("  ");
        }
    }
}
