import java.util.Scanner;

import domain.Elevador;

public class ElevadorController {

    public static void main(String[] args) {
    
        Elevador elevador = new Elevador(2, 12);

        Scanner sc = new Scanner(System.in);
        int op;
        do{
            elevador.exibirAndar();
            
            System.out.print("\n1 - Subir\n2 - Descer\nPressione qualquer outro valor para sair\n > ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                default:
                op = 4;
                break;
            }
        }while(op != 4);
        System.out.println("Programa encerrado...");
        sc.close();
    }
}
