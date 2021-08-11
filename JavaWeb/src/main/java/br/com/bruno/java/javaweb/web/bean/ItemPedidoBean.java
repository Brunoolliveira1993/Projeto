package br.com.bruno.java.javaweb.web.bean;

import br.com.bruno.java.javaweb.web.mapper.ItemPedidoMapper;
import br.com.bruno.java.javaweb.web.model.ItemPedido;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped

public class ItemPedidoBean {
    private ItemPedido item;
    private int numero_pedido;
    private ItemPedidoMapper mapper = new ItemPedidoMapper(numero_pedido);

    public ItemPedido getItemPedido() {
        return item;
    }

    public List<ItemPedido> getItens() {
        return mapper.getItem();
    }
}


