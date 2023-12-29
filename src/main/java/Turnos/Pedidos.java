package Turnos;

import CanchasPadelDispon.Dispon;
import Clientes.Client;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Table(name = "Pedido")
@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedidos;
    private LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cancha_id")
    private Dispon cancha;
    private Boolean activo;
    public Pedidos(Client client, LocalDateTime  fecha, Dispon  cancha){
        this.client=client;
        this.fecha=fecha;
        this.cancha=cancha;
    }

    public void yatieneturno() { this.activo = false; }


}
