package marketing;

public class Whatsapp implements Notificador {


    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando para marketing.Whatsapp: " + mensagem);

    }
}
