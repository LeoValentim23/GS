package doacao;

public class CPF extends Doacao {
    private String nome;

    public CPF(String nome, double quantidade) {
        super(quantidade);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}