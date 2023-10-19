package main.system;

public class Projeto {
    private int id;
    private String nome;
    private String dataInicio;
    private String dataFim;

    public Projeto() {
    }

    public Projeto(int id, String nome, String dataInicio, String dataFim) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Projeto pesquisarProjetoId(int id){
        Banco banco = new Banco();
        banco.carregarDados();
        for (Projeto projeto  : banco.getListaProjetos()) {
            if(projeto.getId() == id){
                return projeto;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Projeto [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
    }

    

}
