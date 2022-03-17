package tarefa_classes;

public class Funcionario {

    public static void main(String args[]){
        System.out.println("\nConsulta de Funcionários\n");
    }

    private String nome;
    private String setorAtuacao;
    private int idade;
    private int codigo;
    private int vendas;

    /**
     * Método para incrementar numero de vendas sem precisar do get sempre
     * @param vendasRealizadas
     */
    public void computarVendas(int vendasRealizadas){
        int vendasTotal = this.getVendas();
        this.setVendas(vendasTotal + vendasRealizadas);
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetorAtuacao() {
        return setorAtuacao;
    }

    public void setSetorAtuacao(String setorAtuacao) {
        this.setorAtuacao = setorAtuacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
