package Locators;

import org.openqa.selenium.By;

public interface Login_Locators {
	static String USUARIO_CERTO = "Seu_Usuario";
	static String SENHA_CERTA = "Sua_Senha";
	static String URL_LOG_ON = "https://sigaa.uern.br/sigaa/portais/discente/discente.jsf";
	static String SENHA_ERRADA = "123@#";
	static String USUARIO_ERRADO = "rafaelsousa#";
	public static final By INPUT_USUARIO = By.xpath("//tbody/tr[1]/td[1]/input[1]");
	public static final By INPUT_SENHA = By.xpath("//tbody/tr[2]/td[1]/input[1]");
	public static final By BOTAO_ENTRAR = By.xpath("//body/div[@id='container']/div[@id='conteudo']/div[4]/form[1]/table[1]/tfoot[1]/tr[1]/td[1]/input[1]");
	public static final By TITULO_LOGIN_FALHA = By.xpath("//center[contains(text(),'Usuário e/ou senha inválidos')]");
}