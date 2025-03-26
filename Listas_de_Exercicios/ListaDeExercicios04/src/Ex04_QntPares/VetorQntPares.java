package Ex04_QntPares;

public class VetorQntPares {
        
        public static void main(String[] args) {
            
            int vetor[] = new int[8];
            int qntPares = 0;
            
            for(int i = 0; i < vetor.length; i++) {
                vetor[i] = Integer.valueOf(System.console().readLine("Digite um valor: "));

                if(vetor[i] % 2 == 0) {
                    qntPares++;
                }
            }            
            System.out.println("Quantidade de números pares: " + qntPares);
        }
}
