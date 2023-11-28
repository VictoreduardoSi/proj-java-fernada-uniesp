public class Pessoa {
    protected String nome;
    protected String tipo;

    public Pessoa(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTipo: " + tipo;
    }
}
