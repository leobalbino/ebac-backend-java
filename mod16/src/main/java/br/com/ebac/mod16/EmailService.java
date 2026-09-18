package br.com.ebac.mod16;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void enviarConfirmacao(String nomeCliente, String produto) {
        System.out.println(
                "E-mail enviado para " + nomeCliente
                        + ": seu pedido de " + produto + " foi confirmado."
        );
    }
}
