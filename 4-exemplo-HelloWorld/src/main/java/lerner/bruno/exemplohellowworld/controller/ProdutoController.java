package lerner.bruno.exemplohellowworld.controller;

import lerner.bruno.exemplohellowworld.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 10:40
 */
@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    public String getProducts() {
        return "Área do produto";
    }

    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setDescricao("Sabão");
        return produto;
    }
}
