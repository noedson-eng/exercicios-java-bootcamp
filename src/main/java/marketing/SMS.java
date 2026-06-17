package marketing;

public class SMS implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando marketing.SMS: " + mensagem);
    }


}
