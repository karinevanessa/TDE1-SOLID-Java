package atividade2;

public class NotificacaoSMS extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        if (!mensagemValida(mensagem)) {
            return;
        }

        System.out.println("Enviando SMS: " + mensagem);
        // Aqui ficaria a logica real de conexao com a operadora.
    }
}
