package Pages;

import static Locators.Emitir_Historico_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirHistoricoPage extends UsefulConstants {
     LoginPage LoginPageObject =  new LoginPage();
     int x = 55; // Coordenada Left do elemento
     int y = 166;  // Coordenada Top do elemento

     public void EmitirHistorico( ) throws InterruptedException {
          LoginPageObject.fazerLogin();
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);
          MoveCursorParaPositionEClicar(x, y);
     }

     public void ExcluirHistorico(){
          verificarEExcluirArquivo(NOME_HISTORICO);
     }

}