public class Produto {
    private String nome;
    private double preco;
    private String tipo;
    private double peso;
    private String codigoBarras;
    private String codigoIdentificacao;
    private String marca;

    public Produto(String nome, double preco, String tipo, double peso, String codigoBarras, String codigoIdentificacao, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.peso = peso;
        this.codigoBarras = codigoBarras;
        this.codigoIdentificacao = codigoIdentificacao;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nTipo: " + tipo +
                "\nPreço: " + preco +
                "\nPeso: " + peso +
                "\nCódigo de Barras: " + codigoBarras +
                "\nCódigo de Identificação: " + codigoIdentificacao +
                "\nMarca: " + marca;
    }
}
