package domain;

public class Pessoa {

    // Atributos (Attributes)
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    // Construtores (Constructors)
    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade não pode ser negativa e maior que 150 anos");
        }
        if (altura < 0 || altura > 3) {
            throw new IllegalArgumentException("Altura não pode ser negativa e maior que 3 m");
        }
        if (peso < 0 || peso > 500) {
            throw new IllegalArgumentException("Peso não pode ser negativo e maior que 500 kg");
        }
        if (sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo deve ser M ou F");
        }

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }    
    
    // Métodos (Methods)
    public void classificaIMC(){

        double imc = calculaIMC();
        System.out.printf("IMC: %.2f\n", imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso adequado");
        }else if(imc < 25){
            System.out.println("Peso Adequado");
        }else if(imc < 30){
            System.out.println("Sobrepeso");
        }else if(imc < 35){
            System.out.println("Obesidade Grau I");
        }else if(imc < 40){
            System.out.println("Obesidade Grau II");
        }else{
            System.out.println("Obesidade Grau III");
        }
    }

    public double calculaIMC(){
        return (peso/(altura*altura));        
    }

    public void listarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        if (sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Feminino");
        }
    }

    // Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
