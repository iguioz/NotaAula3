public class Cachorro extends Animal {

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    private String late;

    public Cachorro(String nome, String raca, String late) {
        super(nome, raca);
        this.late = late;
    }
}
