public class Gerente extends Funcionario{

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    protected String projeto;

    public void informarProjeto() {
        System.out.println("Projeto: " + getProjeto());

    }
}
