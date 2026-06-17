package marketing;

public class RedesSociais implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando para Redes Sociais: " + mensagem);

    }
}
