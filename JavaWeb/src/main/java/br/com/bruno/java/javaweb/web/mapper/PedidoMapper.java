package br.com.bruno.java.javaweb.web.mapper;

import br.com.bruno.java.javaweb.web.model.Pedido;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoMapper {


    private List<Pedido> Pedidos = new ArrayList<Pedido>();

    public PedidoMapper() {
        Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(1);
        pedido.setDataAbertura(Date.from(agora));
        pedido.setRazaoSocial("Bruno Oliveira");
        pedido.setCpfcpnj("08315696971");
        pedido.setTelefone("45998165954");
        adicionar(pedido);
    }

    public List<Pedido> getPedidos() {
        return Pedidos;
    }

    public void adicionar(Pedido pedido) {
        pedido.setNumeroPedido(Pedidos.size() + 1);

        Instant agora = LocalDate.now().atStartOfDay()
                .atZone(ZoneId.systemDefault()).toInstant();
        pedido.setDataAbertura(Date.from(agora));

        Pedidos.add(pedido);
    }

    public void remover(Pedido pedido) {
        try {
            pedido = buscar(pedido.getNumeroPedido());

            Pedidos.remove(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editar(Pedido pedido) {
        try {
            for (Pedido it : Pedidos) {
                if (it.getNumeroPedido() == pedido.getNumeroPedido()) {
                    it = pedido;

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Pedido buscar(int id) {
        Pedido pedido = null;

        try {
            for (Pedido it : Pedidos) {
                if (it.getNumeroPedido() == id) {
                    pedido = it;

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pedido;
    }
}
