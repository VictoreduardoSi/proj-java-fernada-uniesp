public class CamisaGrife extends Produto {
    private String marca;

    public CamisaGrife(String nome, double preco, String tipo, double peso, String codigoBarras, String codigoIdentificacao, String marca) {
        super(nome, preco, tipo, peso, codigoBarras, codigoIdentificacao);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " | Marca: " + marca;
    }
}
