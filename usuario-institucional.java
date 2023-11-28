public class UsuarioInstitucional extends Usuario {
    private String instituicao;

    public UsuarioInstitucional(String nome, String tipo, int numeroInscricao, String dataNascimento, String instituicao) {
        super(nome, tipo, numeroInscricao, dataNascimento);
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInstituição: " + instituicao;
    }
}
