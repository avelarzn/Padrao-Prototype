package prototype;

public class Produto implements Cloneable {
    private int codigo;
    private String nome;
    private int preco;
    private Categoria categoria;

    public Produto(int codigo, String nome, int preco, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.categoria = (Categoria) produtoClone.categoria.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}