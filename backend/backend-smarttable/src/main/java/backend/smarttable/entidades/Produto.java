package backend.smarttable.entidades;

import java.util.Objects;

/**
 * Representa um item do cardápio (produto/prato).
 */
public class Produto {
    private String codigo;     // Identificador único do produto
    private String nome;       // Nome do produto
    private String descricao;  // Descrição do produto
    private double preco;      // Preço do produto

    public Produto() {}

    public Produto(String codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public int hashCode() { return Objects.hash(codigo); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto other = (Produto) obj;
        return Objects.equals(codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Produto{codigo='" + codigo + "', nome='" + nome + "', preco=" + preco + "}";
    }
}
