package util;

/**
 * Lançada quando uma operação inválida relacionada a andares é realizada no elevador
 * Essa Exceção é realizada em tempo de execução e não precisa ser checada (não é necessário blocos de try-catch para lançar) 
 */
public class InvalidFloorException extends RuntimeException{
    public InvalidFloorException(String message){
        super(message);
    }

    public InvalidFloorException(String message, Throwable cause){
        super(message, cause);
    }
}
