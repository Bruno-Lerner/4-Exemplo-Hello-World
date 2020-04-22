package lerner.bruno.exemplohellowworld.controller;

import lerner.bruno.exemplohellowworld.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 10:35
 */
@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public Cliente getClient() {

        Cliente cliente = new Cliente();
        cliente.setNome("Bruno");

        return cliente;
    }

    @GetMapping("/arrayclientes")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Bruno");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("José");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        return clientes;
    }
}
