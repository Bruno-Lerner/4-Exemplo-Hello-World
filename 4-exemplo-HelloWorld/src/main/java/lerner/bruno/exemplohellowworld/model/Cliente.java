package lerner.bruno.exemplohellowworld.model;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 10:30
 */
public class Cliente {

    private String nome;

    /**
     *
     * @param nome
     */
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + nome;
    }
}
