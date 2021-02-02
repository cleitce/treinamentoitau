package exemplos.exemplo01;


public class Gerente extends Funcionario {
    private int nFuncionarios;

    //Construtor 1 
    public Gerente(String nome, double salario){
        super(nome, salario);  //chamada ao construtor da superclasse Funcionario
    }

    //Construtor 1 - OVERLOAD
    public Gerente(String nome){
        super(nome);  //chamada ao construtor da superclasse Funcionario
    }    
    
    public int getNumeroFuncionarios(){
        return nFuncionarios;
    }

    public void setNumeroFuncionarios(int qtdeFuncionarios){
        this.nFuncionarios = qtdeFuncionarios;
    }

}
