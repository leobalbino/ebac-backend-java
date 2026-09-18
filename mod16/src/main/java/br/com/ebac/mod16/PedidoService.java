package br.com.ebac.mod16;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final EmailService emailService;

    public PedidoService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void realizarPedido(String nomeCliente, String produto) {
        System.out.println("Pedido de " + produto + " criado para " + nomeCliente + ".");
        emailService.enviarConfirmacao(nomeCliente, produto);
    }
}
