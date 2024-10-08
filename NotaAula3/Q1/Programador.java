public class Programador extends Funcionario{

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    protected String linguagem;

    public void informarLinguagem() {
        System.out.println("Linguagem: " + getLinguagem());
    }
}
