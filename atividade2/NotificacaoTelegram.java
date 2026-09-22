package atividade2;

public class NotificacaoTelegram extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        if (!mensagemValida(mensagem)) {
            return;
        }

        System.out.println("Enviando Telegram: " + mensagem);
        // Exemplo de novo canal sem alterar o ServicoNotificacao.
    }
}
