import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();


        System.out.println("Qual o seu nome?");
        f.setNome(sc1.nextLine());
        System.out.println("Qual teu ano de nascimento?");
        f.setNasc(sc.nextInt());

        System.out.println("O que você é? 1 - Programador/ 2 - Gerente");
        int prof = sc.nextInt();
        switch (prof) {
            case 1:
                System.out.println("Qual linguagem você domina?");
                p.setLinguagem(sc1.nextLine());
                sc1.nextLine();
                System.out.println("Nome: " + f.getNome());
                f.calcularIdade();
                p.informarLinguagem();

                break;
                case 2:
                    System.out.println("Qual seu projeto?");
                    g.setProjeto(sc.nextLine());
                    sc1.nextLine();
                    System.out.println("Nome: " + f.getNome());
                    f.calcularIdade();
                    g.informarProjeto();
                    break;

        }




    }
}
