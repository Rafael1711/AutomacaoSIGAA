package Pages;

import org.openqa.selenium.Keys;
import static Locators.Spam_De_Mensagem_Locators.*;

public class SpamDeMensagemPage extends UsefulConstants {
    LoginPage LoginPageObject =  new LoginPage();
    int i = 1;
    int count = 1;

    public void SpamDeMensagemaUmMesmoUser() throws InterruptedException {
        LoginPageObject.fazerLogin();

        ClicoNoElemento(MENSAGEM_SPAM);
        ClicoNoElemento(ENVIAR_MENSAGEM);

            while( i <= 100 ) {
                Envio_O_Dado(DESTINATARIO, DESTINATARIO_SPAM);
                    Thread.sleep(1500);
                EsperoEstarVisivel(DESTINATARIO).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
                    Thread.sleep(1500);
                ClicoNoElemento(ADD_DESTINATARIO);
                    Thread.sleep(1500);
                System.out.println(count + "º inserção");
                    count++;
                    i++;
            }

        EsperoEstarVisivel(INPUT_TEXT_ASSUNTO).sendKeys(TEXT_ASSUNTO, Keys.TAB, Keys.TAB, TEXT_MENSAGEM);
        Envio_O_Dado(INPUT_DESCRICAO, TEXT_DESCRICAO);
        ClicoNoElemento(BOTAO_ENVIAR_SPAM);
        VerificoUrl(URL_MENSAGEM_ENVIADA);
        ClicarBotaoSair();
    }
}