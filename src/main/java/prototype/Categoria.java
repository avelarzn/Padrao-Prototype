package prototype;

public class Categoria implements Cloneable{
    private String eletrodomestico;
    private String eletronico;

    public Categoria(String eletrodomestico, String eletronico) {
        super();
        this.eletrodomestico = eletrodomestico;
        this.eletronico = eletronico;
    }

    public String getEletrodomestico() {
        return eletrodomestico;
    }

    public void setEletrodomestico(String eletrodomestico) {
        this.eletrodomestico = eletrodomestico;
    }

    public String getEletronico() {
        return eletronico;
    }

    public void setEletronico(String eletronico) {
        this.eletronico = eletronico;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "eletrodomestico='" + eletrodomestico + '\'' +
                ", eletronico='" + eletronico + '\'' +
                '}';
    }
}
