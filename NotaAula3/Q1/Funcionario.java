public class Funcionario{

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String nome;

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    protected int nasc;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected double salario;

    public void informarSalario() {

    }

    public void calcularIdade() {
        int idade = 2024 - nasc;
        System.out.println("Idade: " + idade);
    }

}
