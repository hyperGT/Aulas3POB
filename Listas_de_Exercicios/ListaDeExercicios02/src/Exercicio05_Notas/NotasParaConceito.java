package Exercicio05_Notas;

public class NotasParaConceito {
    
    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();

        if(nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");            
        } else if(nota >= 9) {
            System.out.println("Conceito A");
        } else if(nota >= 7) {
            System.out.println("Conceito B");
        } else if(nota >= 5) {
            System.out.println("Conceito C");
        } else if(nota >= 3) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
        
        sc.close();
    }
}
