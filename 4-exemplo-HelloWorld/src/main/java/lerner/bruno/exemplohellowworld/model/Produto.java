package lerner.bruno.exemplohellowworld.model;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 10:40
 */
public class Produto {

    private String descricao;

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição do Produto: " + descricao;
    }
}
