package Locators;

import org.openqa.selenium.By;

public interface Bug_Log_Off_Usuario_Locators {
	static String DESTINATARIO_ERRADO = "Teste";
	static String TEXT_ASSUNTO = "Teste";
	static String TEXT_MENSAGEM = "Teste";
	public static final By TURMA = By.xpath("//tbody/tr[7]/td[1]/form[1]/a[1]");
	public static final By PARTCIPANTES = By.xpath("//div[contains(text(),'Participantes')]");
	public static final By SELECT_MENSAGEM = By.xpath("//tbody/tr[10]/td[3]/a[1]/img[1]");
	public static final By DESTINATARIO = By.xpath("//input[@id='destinatarios']");
	public static final By ASSUNTO = By.xpath("//input[@id='assunto-facade']");
	public static final By MENSAGEM = By.xpath("//textarea[@id='corpo-facade']");
	public static final By BOTAO_ENVIAR = By.xpath("//button[@id='ext-gen15']");
	public static final By FECHAR_POPUP = By.xpath("/html[1]/body[1]/div[8]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]");
	public static final By HOME = By.xpath("//body/div[@id='baseLayout']/div[@id='cabecalho']/div[2]/div[4]/form[2]/button[1]/span[1]");
}
