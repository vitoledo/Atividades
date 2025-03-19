// classe objeto
package atividades.ATVDS01;

public class Produto {

    // caracteristicas - atributos - propriedades
    private int id;
    private String nome;
    private String sobre;
    private float valor;
    private int quant;

    // metodos - funçoes contrutoras
    public Produto() {
    }

    public Produto(int id, String nome, String sobre, float valor, int quant) {
        this.id = id;
        this.nome = nome;
        this.sobre = sobre;
        this.valor = valor;
        this.quant = quant;

    }

    public Produto(float valor, int quant) {
        this.valor = valor;
        this.quant = quant;

    }

    public Produto(int id, String nome, String sobre) {
        this.id = id;
        this.nome = nome;
        this.sobre = sobre;

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

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    // public int getPro(int id, String nome, String sobre, float valor, int quant){
    // return id;
    // ret
    // }

}
