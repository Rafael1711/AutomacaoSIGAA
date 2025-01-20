package Locators;

import org.openqa.selenium.By;

public interface Spam_De_Mensagem_Locators {
	static String DESTINATARIO_SPAM = "Jose Inacio Mendes Ferreira";
	static String TEXT_ASSUNTO = "Manuntenção no SIGAA";
	static String TEXT_MENSAGEM = "Informamos que o Sistema Integrado de Gestão de Atividades Acadêmicas - SIGAA está passando por manutenção técnica. Durante este período, algumas funcionalidades podem estar temporariamente indisponíveis. Estamos trabalhando para concluir os ajustes o mais rápido possível e retomar o pleno funcionamento do sistema.";
	static String TEXT_DESCRICAO = "Manuntençãoo no SIGAA";
	static String URL_MENSAGEM_ENVIADA = "https://sigadmin.uern.br/cxpostal/envia_mensagem.jsf";
	public static final By MENSAGEM_SPAM = By.xpath("//a[contains(text(),'Mensagens')]");
	public static final By ENVIAR_MENSAGEM = By.xpath("//body/div[@id='container']/form[@id='form']/div[@id='mailbox']/div[@id='pastas']/ul[1]/li[4]/a[1]/img[1]");
	public static final By DESTINATARIO = By.xpath("//input[@id='form:usuarioAuto']");
	public static final By ADD_DESTINATARIO = By.xpath("//tbody/tr[1]/td[2]/a[1]/img[1]");
	public static final By INPUT_TEXT_ASSUNTO = By.xpath("//input[@id='form:assunto']");
	public static final By INPUT_DESCRICAO = By.xpath("//input[@id='form:nome']");
	public static final By BOTAO_ENVIAR_SPAM = By.xpath("//input[@id='form:btnBotaoCancelar']");
}
