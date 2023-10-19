package main.system;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Gerente> listaGerentes = new ArrayList<>();
    private List<Projeto> listaProjetos = new ArrayList<>();

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void carregarDados() {
        listaClientes.add(new Cliente("lucas", 1l));
        listaClientes.add(new Cliente("Tony", 2l));

        listaGerentes.add(new Gerente("Steve", 1));
        listaGerentes.add(new Gerente("Clint", 2));
        listaGerentes.add(new Gerente("Scott", 3));

        listaProjetos.add(new Projeto(1, "Thanos", "23/06/23", "17/10/23"));
        listaProjetos.add(new Projeto(2, "Xaropada", "23/06/23", "25/10/23"));
        
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Gerente> getListaGerentes() {
        return listaGerentes;
    }

    public void setListaGerentes(List<Gerente> listaGerentes) {
        this.listaGerentes = listaGerentes;
    }

    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(List<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

}
