package Locators;

import org.openqa.selenium.By;

public interface Emitir_Atestado_De_Matricula_Locators {
	static String NOME_ATESTADO_DE_MATRICULA = "Sistema Integrado de Gestão de Atividades Acadêmicas.pdf";
	public static final By BOTAO_IMPRIMIR = By.xpath("//a[contains(text(),'Imprimir')]");
	public static final By BOTAO_IMPRIMIR_TWO = By.xpath("/html/body/print-preview-app//print-preview-sidebar//print-preview-button-strip//div/cr-button[1]");
}