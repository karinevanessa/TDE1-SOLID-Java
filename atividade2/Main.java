package atividade2;

public class Main {
    public static void main(String[] args) {
        ServicoNotificacao servicoEmail =
                new ServicoNotificacao(new NotificacaoEmail());
        servicoEmail.enviar("Seu cadastro foi realizado com sucesso.");

        ServicoNotificacao servicoSMS =
                new ServicoNotificacao(new NotificacaoSMS());
        servicoSMS.enviar("Codigo de verificacao: 9876");

        ServicoNotificacao servicoTelegram =
                new ServicoNotificacao(new NotificacaoTelegram());
        servicoTelegram.enviar("Nova mensagem via Telegram.");

        // Teste da validacao de mensagem vazia.
        servicoEmail.enviar("   ");
    }
}
