package backend.smarttable.entidades;

import java.util.Objects;

/**
 * Representa a reserva de uma mesa em certa data/horário.
 */
public class Reserva {
    private String id;           // Identificador da reserva
    private String idCliente;    // Relaciona com Cliente
    private String data;         // Data da reserva (ex.: 2025-10-01)
    private String horario;      // Horário (ex.: 19:30)
    private int numeroMesa;      // Mesa reservada
    private String status;       // PENDENTE, CONFIRMADA, CANCELADA

    public Reserva() {}

    public Reserva(String id, String idCliente, String data, String horario, int numeroMesa, String status) {
        this.id = id;
        this.idCliente = idCliente;
        this.data = data;
        this.horario = horario;
        this.numeroMesa = numeroMesa;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getIdCliente() { return idCliente; }
    public void setIdCliente(String idCliente) { this.idCliente = idCliente; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public int getNumeroMesa() { return numeroMesa; }
    public void setNumeroMesa(int numeroMesa) { this.numeroMesa = numeroMesa; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Reserva other = (Reserva) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Reserva{id='" + id + "', cliente='" + idCliente + "', mesa=" + numeroMesa + ", status='" + status + "'}";
    }
}
