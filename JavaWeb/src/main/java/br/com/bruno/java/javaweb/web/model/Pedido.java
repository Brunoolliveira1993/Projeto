package br.com.bruno.java.javaweb.web.model;

import java.util.Date;

public class Pedido {
    private int     numeroPedido;
    private Date    dataAbertura;
    private String  razaoSocial;
    private String  cpfcpnj;
    private String  telefone;
    private String  email;

    public Pedido() {

    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfcpnj() {
        return cpfcpnj;
    }

    public void setCpfcpnj(String cpfcpnj) {
        this.cpfcpnj = cpfcpnj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
