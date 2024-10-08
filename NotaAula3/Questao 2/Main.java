
public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Jeremias", "Pinscher", "Au");
        Gato g = new Gato("Jerimum", "Laranja", "Miau miau");

        System.out.println("CACHORRO:");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());
        System.out.println("Latido: " + c.getLate());


        System.out.println("GATO:");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Raca: " + g.getRaca());
        System.out.println("Miado: " + g.getMia());

    }
}