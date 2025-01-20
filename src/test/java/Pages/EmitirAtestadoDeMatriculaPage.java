package Pages;

import org.openqa.selenium.By;
import static Locators.Emitir_Atestado_De_Matricula_Locators.*;
import static Locators.Useful_Constants_Locators.*;


// Esse script ainda está sendo construído

public class EmitirAtestadoDeMatriculaPage extends UsefulConstants {
     LoginPage LoginPageObject =  new LoginPage();

     int x = 55; // Coordenada Left do elemento
     int y = 146;  // Coordenada Top do elemento
     int i = 869;  // Coordenada Top do elemento
     int j = 630;  // Coordenada Top do elemento

     public void EmitirAtestadoDeMatricula( ) throws InterruptedException {
          LoginPageObject.fazerLogin();
          ClicoNoElemento(ENSINO);
               Thread.sleep(500);
          MoveCursorParaPositionEClicar(x, y);
               Thread.sleep(500);
          ClicoNoElemento(BOTAO_IMPRIMIR);
               Thread.sleep(1500);
          Xerxes.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")).click();

     }

     public void ExcluirAtestadoDeMatricula(){
          verificarEExcluirArquivo(NOME_ATESTADO_DE_MATRICULA);
     }

}