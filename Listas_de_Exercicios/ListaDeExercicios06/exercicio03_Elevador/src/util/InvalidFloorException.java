package util;
public class InvalidFloorException extends Exception{
    public InvalidFloorException(String message){
        super(message);
    }
    
    public String getMyErrorMessage(){
        return "Quantidade de andares inserida é inválida.";
    }
}
