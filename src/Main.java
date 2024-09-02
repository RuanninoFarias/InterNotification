public class Main {
    public static void main(String[] args) {
        //construtor ?
        GerenciadorDeNotificacao gerenciador = new GerenciadorDeNotificacao();
        // Chamada do cada objeto
        Notificacoes email = new NotificacaoEmail();
        Notificacoes sms = new NotificacaoSMS();
        Notificacoes push = new NotificacaoPush();
        Notificacoes wpp = new NotificacaoWhatsapp();
        // Chamada do gerenciador estánciando os objetos
        gerenciador.enviarNotificacao(email);
        gerenciador.enviarNotificacao(sms);
        gerenciador.enviarNotificacao(push);
        gerenciador.enviarNotificacao(wpp);
    }
}
