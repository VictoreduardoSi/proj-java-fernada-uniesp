public class Usuario extends Pessoa {
    private int numeroInscricao;
    private String dataNascimento;

    public Usuario(String nome, String tipo, int numeroInscricao, String dataNascimento) {
        super(nome, tipo);
        this.numeroInscricao = numeroInscricao;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Inscrição: " + numeroInscricao + "\nData de Nascimento: " + dataNascimento;
    }
}
