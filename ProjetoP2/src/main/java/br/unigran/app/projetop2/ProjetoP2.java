package br.unigran.app.projetop2;

import br.unigran.view.login.TelaLogin;

/**
 *
 * @author laboratorio
 */
public class ProjetoP2 {

    public static void main(String[] args) {
        // Cria e exibe a tela de login
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
}
