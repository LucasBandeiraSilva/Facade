package main.system;

public class Cliente {
    private String nome;
    private Long id;

    public Cliente(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    public Cliente() {
    }

    public Cliente pesquisarClienteId(long id) {

        Banco banco = new Banco();
        banco.carregarDados();
        for (Cliente cliente : banco.getListaClientes()) {
            if(cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", id=" + id + "]";
    }

}
