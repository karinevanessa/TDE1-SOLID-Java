package atividade2;

public abstract class Notificacao implements CanalNotificacao {

    protected boolean mensagemValida(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            System.out.println("Notificacao nao enviada: a mensagem nao pode ser vazia.");
            return false;
        }
        return true;
    }
}
