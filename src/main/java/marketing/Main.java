package marketing;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Notificador redeSocial = new RedesSociais();
        Notificador email = new Email();
        Notificador whats = new Whatsapp();
        Notificador sms = new SMS();
        List<Notificador> servicos = List.of(whats, sms, redeSocial, email);

        String minhaMensagem = "Olá! Conheça nosso novo produto.";
        for (Notificador servico : servicos) {
            servico.enviar(minhaMensagem);
        }




    }


}

