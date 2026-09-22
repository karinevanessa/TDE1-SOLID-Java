package atividade1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "Karine Galvao",
                "karine@email.com",
                "123456"
        );

        AutenticadorUsuario autenticador = new AutenticadorUsuario();

        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());

        boolean acesso1 = autenticador.autenticar(usuario, "123456");
        System.out.println("Tentativa com senha correta: " +
                (acesso1 ? "Autenticacao realizada com sucesso." : "Falha na autenticacao."));

        boolean acesso2 = autenticador.autenticar(usuario, "senhaErrada");
        System.out.println("Tentativa com senha incorreta: " +
                (acesso2 ? "Autenticacao realizada com sucesso." : "Falha na autenticacao."));
    }
}
