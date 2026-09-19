package br.com.leo.exceptions;


public class ClienteService {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontrato2Exception {
        try {
            ClienteDAO.consultarCliente(codigo);
        } catch (ClienteNaoEncontradoException e) {
            throw new ClienteNaoEncontrato2Exception(e.getMessage(), e);
        }
    }
}
