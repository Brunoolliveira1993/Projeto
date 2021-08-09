package br.com.bruno.javaweb.web.model;

import java.util.Date;

public class Produto {
    private int     Numero_pedido;
    private Date    Data_Abertura;
    private String  Razao_Social;
    private String  CPF_CNPJ;
    private String  Telefone;
    private String  Email;

    public Produto() {

    }
    public int getNumero_pedido() {
        return Numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        Numero_pedido = numero_pedido;
    }

    public Date getData_Abertura() {
        return Data_Abertura;
    }

    public void setData_Abertura(Date data_Abertura) {
        Data_Abertura = data_Abertura;
    }

    public String getRazao_Social() {
        return Razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        Razao_Social = razao_Social;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
