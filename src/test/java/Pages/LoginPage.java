package Pages;

import static Locators.Login_Locators.*;

public class LoginPage extends UsefulConstants {

     public void fazerLogin() {
          Envio_O_Dado(INPUT_USUARIO, USUARIO_CERTO);
          Envio_O_Dado(INPUT_SENHA, SENHA_CERTA);
          ClicoNoElemento(BOTAO_ENTRAR);
          VerificoUrl(URL_LOG_ON);
     }

}