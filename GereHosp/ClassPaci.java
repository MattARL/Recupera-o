public class ClassPaci extends ClassPessoa {
    private String PlanoSaude;

    public ClassPaci(String nome, String endereco, String nascimento, String PlanoSaude) {
        super(nome, endereco, nascimento);
        this.PlanoSaude = PlanoSaude;
    }

    public ClassPaci(String nome, String endereco, String nascimento) {
        super(nome, endereco, nascimento);
    }

    public String getPlanoSaude() {
        return PlanoSaude;
    }

    public void setPlanoSaude(String PlanoSaude) {
        this.PlanoSaude = PlanoSaude;
    }
}
