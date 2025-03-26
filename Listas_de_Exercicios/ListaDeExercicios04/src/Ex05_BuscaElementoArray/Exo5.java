package Ex05_BuscaElementoArray;

public class Exo5 {
        
        public static void main(String[] args) {
            
            int vetor[] = new int[5];
            int elemento = 0;
            int posicao = -1;
            
            for(int i = 0; i < vetor.length; i++) {
                vetor[i] = Integer.valueOf(System.console().readLine("Digite um valor: "));
            }
            
            elemento = Integer.valueOf(System.console().readLine("Digite o elemento a ser buscado: "));
            
            for(int i = 0; i < vetor.length; i++) {
                if(vetor[i] == elemento) {
                    posicao = i;
                    break;
                }
                posicao = -1;
            }
            
            if(posicao != -1) {
                System.out.println("Elemento encontrado na posição: " + (posicao + 1));
            }else {
                System.out.println("Elemento não encontrado!");
            }
        }
}
