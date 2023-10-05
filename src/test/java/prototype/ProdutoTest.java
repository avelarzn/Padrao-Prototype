package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(1, "Produto Original", 100, new Categoria("Aspirador", "Notebook"));

        Produto produtoClone = produto.clone();
        produtoClone.setCodigo(2);
        produtoClone.setNome("Produto Clonado");
        produtoClone.setPreco(200);
        produtoClone.getCategoria().setEletronico("Celular");

        assertEquals("Produto{codigo=1, nome='Produto Original', preco=100, categoria=Categoria{eletrodomestico='Aspirador', eletronico='Notebook'}}", produto.toString());
        assertEquals("Produto{codigo=2, nome='Produto Clonado', preco=200, categoria=Categoria{eletrodomestico='Aspirador', eletronico='Celular'}}", produtoClone.toString());
    }
}