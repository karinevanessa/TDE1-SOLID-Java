package atividade2;

public class NotificacaoEmail extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        if (!mensagemValida(mensagem)) {
            return;
        }

        System.out.println("Enviando E-mail: " + mensagem);
        // Aqui ficaria a logica real de conexao SMTP.
    }
}
