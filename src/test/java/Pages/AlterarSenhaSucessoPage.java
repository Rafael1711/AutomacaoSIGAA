package Pages;

import org.openqa.selenium.WebElement;
import java.util.Set;
import static Locators.Alterar_Senha_Sucesso_Locators.*;
import static Locators.Login_Locators.SENHA_CERTA;
import static org.junit.Assert.assertEquals;

public class AlterarSenhaSucessoPage extends UsefulConstants {
    LoginPage LoginPageObject = new LoginPage();

    public void AlterarSenha() {
        LoginPageObject.fazerLogin();

        ClicoNoElemento(ALTERAR_SENHA);

        String originalWindow = Xerxes.getWindowHandle(); // Janela original
        Set<String> allWindows = Xerxes.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                Xerxes.switchTo().window(windowHandle); // Troca para o popup
                break;
            }
        }

        EsperoEstarVisivel(CLICO_EM_ALTERAR_SENHA).click();
        Envio_O_Dado(CAMPO_SENHA_ATUAL, SENHA_CERTA);
        Envio_O_Dado(CAMPO_NOVA_SENHA, SENHA_CERTA);
        Envio_O_Dado(CAMPO_REPETIR_NOVA_SENHA, SENHA_CERTA);
        ClicoNoElemento(BOTAO_ALTERAR_DADOS);

        // Aguarda o título de sucesso e valida
        WebElement tituloSucesso = EsperoEstarVisivel(TITULO_SUCESSO_ALTERAR_SENHA);
        String valorDaPagina = tituloSucesso.getText();
            assertEquals(valorDaPagina, TEXTO_TITULO_SUCESSO_ALTERAR_SENHA);
            System.out.println("Título da página: " + valorDaPagina);

        ClicoNoElemento(BOTAO_FECHAR);
        UsefulConstants.close();
    }
}