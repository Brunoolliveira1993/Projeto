package br.com.bruno.java.javaweb.web.bean;

import br.com.bruno.java.javaweb.web.mapper.PedidoMapper;
import br.com.bruno.java.javaweb.web.model.Pedido;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import java.util.List;

@ManagedBean
@SessionScoped

public class PedidoBean {

    private Pedido pedido;
    private PedidoMapper mapper = new PedidoMapper();

    @PostConstruct
    public void init() {
        pedido = new Pedido();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public List<Pedido> getPedidos() {
        return mapper.getPedidos();
    }
    public String adicionar(){

        mapper.adicionar(pedido);

        pedido = new Pedido();

        FacesContext context=FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage("Pedido adicionado com sucesso!"));
        context.getExternalContext().getFlash().setKeepMessages(true);

        return "index.xhtml";
    }
}



