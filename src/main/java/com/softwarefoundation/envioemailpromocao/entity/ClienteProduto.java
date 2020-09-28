package com.softwarefoundation.envioemailpromocao.entity;

import java.util.Objects;

public class ClienteProduto {

    private Cliente cliente;
    private Produto produto;

    public ClienteProduto() {
    }

    public ClienteProduto(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteProduto that = (ClienteProduto) o;
        return cliente.equals(that.cliente) &&
                produto.equals(that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, produto);
    }
}
