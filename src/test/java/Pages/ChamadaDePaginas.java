package Pages;

import javax.swing.*;
import java.awt.*;

public class ChamadaDePaginas {
    public static void main(String[] args) throws InterruptedException {
        String opcao;

        do {
            // Criando um JPanel customizado para desenhar a imagem de fundo
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("D:\\AutomacaoSIGAA\\Img_Fundo\\SIGAA.png"); // Caminho para a imagem
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

                    // Desenha uma sobreposição semi-transparente
                    Color overlayColor = new Color(100, 100, 100, 230); // Azul com transparência
                    g.setColor(overlayColor);
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            };

            panel.setLayout(new BorderLayout());

            // Criando o JLabel com o título e o menu
            JLabel label = new JLabel(
                    "<html>" +
                            "<div style='text-align: center; font-size: 18px; font-weight: bold;'>TESTES FUNCIONAIS NO SIGAA</div><br>" +
                            "<div style='text-align: center; font-size: 14px; font-weight: bold;'>Escolha um teste a ser realizado:</div><br>" +
                            "<table style='width: 100%; text-align: center; font-size: 14px;'>" +

                            "   <tr>" +
                            "       <td style='padding: 10px;'>1 - Fazer Login</td>" +
                            "       <td style='padding: 10px;'>2 - Falha no Login</td>" +
                            "       <td style='padding: 10px;'>3 - Bug Log-Off Usuário</td>" +
                            "   </tr>" +

                            "   <tr>" +
                            "       <td style='padding: 10px;'>4 - Spam De Mensagens</td>" +
                            "       <td style='padding: 10px;'>5 - Histórico</td>" +
                            "       <td style='padding: 10px;'>6 - Declaração De Vínculo</td>" +
                            "   </tr>" +

                            "   <tr>" +
                            "       <td style='padding: 10px;'>7 - Atestado De Matrícula</td>" + // O script de atestado de matrícula ainda está sendo construído
                            "       <td style='padding: 10px;'>8 - Alterar Senha Sucesso</td>" +
                            "       <td style='padding: 10px;'>9 - Alterar Senha Falha</td>" +
                            "   </tr>" +

                            "</table><br>" +
                            "<div style='text-align: center; font-size: 12px;'>Informe sua opção:</div>" +
                            "</html>",
                    JLabel.CENTER
            );

            label.setForeground(Color.WHITE);
            label.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

            // Adicionando o texto ao painel
            panel.add(label, BorderLayout.CENTER);

            // Exibindo o painel no JOptionPane
            opcao = JOptionPane.showInputDialog(
                    null,
                    panel,
                    null,
                    JOptionPane.PLAIN_MESSAGE
            );

            if (opcao == null) {
                break;
            }

            switch (opcao) {
                case "1":
                    UsefulConstants.start();
                    LoginPage LoginPageObject = new LoginPage();
                    LoginPageObject.fazerLogin();
                    UsefulConstants.ClicarBotaoSair();
                    UsefulConstants.close();
                    break;

                case "2":
                    UsefulConstants.start();
                    LoginFalhaPage FazerLoginFalhaObject = new LoginFalhaPage();
                    FazerLoginFalhaObject.FazerLoginFalha();
                    UsefulConstants.close();
                    break;

                case "3":
                    UsefulConstants.start();
                    BugLogOffUsuarioPage DeslogarUserPageObject = new BugLogOffUsuarioPage();
                    DeslogarUserPageObject.UserLogOff();
                    UsefulConstants.close();
                    break;

                case "4":
                    UsefulConstants.start();
                    SpamDeMensagemPage SobrecargaDeMensagemPageObject = new SpamDeMensagemPage();
                    SobrecargaDeMensagemPageObject.SpamDeMensagemaUmMesmoUser();
                    UsefulConstants.close();
                    break;

                case "5":
                    UsefulConstants.start();
                    EmitirHistoricoPage EmitirHistoricoPageObject = new EmitirHistoricoPage();
                    EmitirHistoricoPageObject.EmitirHistorico();
                    EmitirHistoricoPageObject.ExcluirHistorico();
                    UsefulConstants.close();
                    break;

                case "6":
                    UsefulConstants.start();
                    EmitirDeclaracaoVinculoPage EmitirDeclaracaoVinculoPageObject = new EmitirDeclaracaoVinculoPage();
                    EmitirDeclaracaoVinculoPageObject.EmitirDeclaracaoDeVinculo();
                    EmitirDeclaracaoVinculoPageObject.ExcluirDeclaracaoVinculo();
                    UsefulConstants.close();
                    break;

                case "7":
                    UsefulConstants.start();
                    EmitirAtestadoDeMatriculaPage EmitirAtestadoDeMatriculaPageObject = new EmitirAtestadoDeMatriculaPage();
                    EmitirAtestadoDeMatriculaPageObject.EmitirAtestadoDeMatricula();
                    EmitirAtestadoDeMatriculaPageObject.ExcluirAtestadoDeMatricula();
                    UsefulConstants.close();
                    break;

                case "8":
                    UsefulConstants.start();
                    AlterarSenhaSucessoPage AlterarSenhaSucessoPageObject = new AlterarSenhaSucessoPage();
                    AlterarSenhaSucessoPageObject.AlterarSenha();
                    UsefulConstants.close();
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida! Por favor, tente novamente.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                    break;
            }

        } while (true);
    }
}