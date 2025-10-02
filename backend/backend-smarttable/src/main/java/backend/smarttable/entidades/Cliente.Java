package backend.smarttable.entidades;

import java.util.Objects;

/**
 * Representa um cliente do restaurante.
 */
public class Cliente {
    private String id;       // Identificador do cliente
    private String nome;     // Nome completo
    private String telefone; // Telefone de contato
    private String email;    // E-mail

    public Cliente() {}

    public Cliente(String id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Cliente{id='" + id + "', nome='" + nome + "'}";
    }
}
