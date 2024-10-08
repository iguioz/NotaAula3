public class Gato extends Animal {

    public Gato(String nome, String raca, String mia) {
        super(nome, raca);
        this.mia = mia;
    }

    public String getMia() {
        return mia;
    }

    public void setMia(String mia) {
        this.mia = mia;
    }

    private String mia;
}
