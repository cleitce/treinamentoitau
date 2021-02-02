package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        //Funcionario func = new Funcionario();
        Funcionario func2 = new Funcionario("Mané",3000);
        Funcionario func3 = new Funcionario("Joaquim");
        Gerente gerente = new Gerente("Mario");
        Gerente gerente2 = new Gerente("João",5000);
        
        func3.setNome("Cleiton");

        System.out.println("Funcionário: " + func2.getNome());
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Gerente: " + gerente.getNome("Sr. "));

        System.out.println("Funcionário: " + func2.getDados());
        System.out.println("Gerente: " + gerente2.getDados());
    }
}