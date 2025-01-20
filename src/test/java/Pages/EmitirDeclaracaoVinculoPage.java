package Pages;

import static Locators.Emitir_Declaracao_Vinculo_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirDeclaracaoVinculoPage extends UsefulConstants {
     LoginPage LoginPageObject =  new LoginPage();
     int x = 55; // Coordenada Left do elemento
     int y = 186;  // Coordenada Top do elemento

     public void EmitirDeclaracaoDeVinculo( ) throws InterruptedException {
          LoginPageObject.fazerLogin();
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);
          MoveCursorParaPositionEClicar(x, y);
          Thread.sleep(5000);
     }

     public void ExcluirDeclaracaoVinculo(){
          verificarEExcluirArquivo(NOME_DECLARACAO_VINCULO);
     }

}