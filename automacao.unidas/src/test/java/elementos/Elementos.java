package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By btnCookie = By.xpath("//a[@class='cookieBarButton cookieBarConsentButton']");
	public By criarconta= By.xpath("//*[@id=\"navbarSupportedContent\"]/div/ul/li[2]/a[2]/span");
	public By nomeCompleto = By.xpath ("//input[@formcontrolname='Name']");
    public By Email = By.xpath("//input[@formcontrolname='Email']");
    public By Cpf = By.xpath("//input[@formcontrolname='Document']");
    public By nomedaMae=By.xpath("//input[@formcontrolname='MotherName']");
    public By Celular=By.xpath("//input[@formcontrolname='Cellphone']");
    public By Nascimento=By.xpath("//input[@formcontrolname='Birthday']");
    public By cookie =By.xpath("//a[@class='cookieBarButton cookieBarConsentButton']");
    public By btnEntrar=By.xpath("//a[@class='mr-1']");
    public By login =By.xpath("//input[@placeholder='E-mail, CPF ou CNPJ']");
    public By password=By.xpath("//input[@type='password']");
    public By Entrar=By.xpath("//button[@id='sendLogin']");
   
    

}
