package doacao;

public class CNPJ extends Doacao {
    private String nomeEmpresa;

    public CNPJ(String nomeEmpresa, double quantidade) {
        super(quantidade);
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }


}