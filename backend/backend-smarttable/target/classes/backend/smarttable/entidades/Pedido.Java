package backend.smarttable.entidades;

import java.util.Objects;

/**
 * Representa um pedido feito pelo cliente (pode ser antecipado).
 */
public class Pedido {
    private String id;          // Identificador do pedido
    private String idCliente;   // Cliente que fez o pedido
    private String itens;       // Itens do pedido (JSON simples por enquanto)
    private double valorTotal;  // Valor total do pedido
    private String status;      // ABERTO, PAGO, CANCELADO

    public Pedido() {}

    public Pedido(String id, String idCliente, String itens, double valorTotal, String status) {
        this.id = id;
        this.idCliente = idCliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getIdCliente() { return idCliente; }
    public void setIdCliente(String idCliente) { this.idCliente = idCliente; }

    public String getItens() { return itens; }
    public void setItens(String itens) { this.itens = itens; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pedido other = (Pedido) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Pedido{id='" + id + "', cliente='" + idCliente + "', valorTotal=" + valorTotal + "}";
    }
}
