package atividade1;

import java.util.Random;

public class AutenticadorUsuario {
    private final Random random;

    public AutenticadorUsuario() {
        this.random = new Random();
    }

    public boolean autenticar(Usuario usuario, String senhaDigitada) {
        if (usuario == null || senhaDigitada == null) {
            return false;
        }

        boolean senhaCorreta = usuario.getSenha().equals(senhaDigitada);

        // Simulacao pedida no enunciado: 90% de chance de sucesso.
        boolean simulacaoAutenticacao = random.nextInt(100) < 90;

        return senhaCorreta && simulacaoAutenticacao;
    }
}
