package Locators;

import org.openqa.selenium.By;

public interface Alterar_Senha_Sucesso_Locators {
	static String TEXTO_TITULO_SUCESSO_ALTERAR_SENHA = "Dados Alterados com Sucesso";
	public static final By ALTERAR_SENHA = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
	public static final By CLICO_EM_ALTERAR_SENHA = By.xpath("//a[@id='form:alterarSenha']");
	public static final By CAMPO_SENHA_ATUAL = By.xpath("//input[@id='form:senhaAtual']");
	public static final By CAMPO_NOVA_SENHA = By.xpath("//input[@id='form:novaSenha']");
	public static final By CAMPO_REPETIR_NOVA_SENHA = By.xpath("//input[@id='form:repetnNovaSenha']");
	public static final By BOTAO_ALTERAR_DADOS = By.xpath("//input[@id='form:alterarDados']");
	public static final By TITULO_SUCESSO_ALTERAR_SENHA = By.xpath("//h1[contains(text(),'Dados Alterados com Sucesso')]");
	public static final By BOTAO_FECHAR = By.xpath("//body/div[@id='container']/center[1]/a[1]/img[1]");
}