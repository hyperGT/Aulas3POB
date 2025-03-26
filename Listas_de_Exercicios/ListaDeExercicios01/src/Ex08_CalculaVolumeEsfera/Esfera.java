package Ex08_CalculaVolumeEsfera;

public class Esfera {
   private double raio;
      
   public double volume(double radius){
    return (4/3) * Math.PI * Math.pow(radius, 3);
   }

   public double volume(){
    double radius = this.raio;
    return (4/3) * Math.PI * Math.pow(radius, 3);
   }
   public static void main(String[] args) {
        Esfera esfera = new Esfera();
        
        double rad = Double.parseDouble(System.console().readLine("Insira o raio: "));        

        esfera.raio = rad;

        System.out.printf("Volume da esfera: %.2f", esfera.volume());
   }
}
