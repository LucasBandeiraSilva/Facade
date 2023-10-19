package main.facade;

import main.system.Cliente;
import main.system.Gerente;
import main.system.Projeto;

public class Facade {

    private static Facade facade = new Facade();

    private Facade(){

    }
    public static Facade getInstance(){
        return facade;
    }
    public void gerarRelatorio() {
        Cliente cliente = new Cliente();
        Projeto projeto = new Projeto();
        Gerente gerente = new Gerente();
        System.out.println("cliente: " + cliente.pesquisarClienteId(1));
        System.out.println("cliente: " + projeto.pesquisarProjetoId(1));
        System.out.println("gerente: " + gerente.pesquisarGerenteId(1));
    }
}
