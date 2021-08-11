package br.com.bruno.java.javaweb.web.mapper;

import br.com.bruno.java.javaweb.web.model.ItemPedido;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemPedidoMapper {

    private List<ItemPedido> Itens = new ArrayList<ItemPedido>();

    public ItemPedidoMapper(int numero_pedido) {
        ItemPedido item = new ItemPedido(numero_pedido);
        item.setProduto("Item teste");
        item.setQuantidade(2);
        item.setValor(100);
        item.setValor_total( ( item.getValor() * item.getQuantidade() ) );

        adicionar(item);
    }

    public List<ItemPedido> getItem() {
        return Itens;
    }

    public void adicionar(ItemPedido item) {
        item.setId(Itens.size() + 1);
        Itens.add(item);
    }

    public void remover(ItemPedido item) {
        try {
            item = buscar(item.getId());

            Itens.remove(item);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editar(ItemPedido item){
        try {
            for (ItemPedido it : Itens) {
                if (item.getId() == item.getId()) {
                    it = item;

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ItemPedido buscar(int id) {
        ItemPedido item = null;

        try {
            for (ItemPedido it : Itens) {
                if (it.getId() == id) {
                    item = it;

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return item;
    }


}


