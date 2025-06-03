import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];        
        int i = 0;
        while(i < 5){
            try {
                System.out.printf("Digite o %dº número inteiro: ", i + 1);
                valores[i] = sc.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: O número digitado deve ser inteiro (ex: 25, -10, 50).");
                sc.nextLine(); // limpa o buffer do scanner
            }
        }

        System.out.println("\nValores Digitados: ");
        for(int valor : valores){
            System.out.println(valor);
        }
        sc.close();
    }
}
