package steps;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class Testes {
	
	Elementos elemento = new Elementos();
	Metodos metodo = new Metodos();
			
	@Before
	public void acessarFormulario() {
		Executa.abrirNavegador(true) ;

}
	@Test
	  public void acessarConta () throws InterruptedException {
		metodo.clicar(elemento.btnCookie);
		metodo.clicar(elemento.criarconta);
		Thread.sleep(3000);
	    metodo.escrever(elemento.nomeCompleto,"Valeria Carrion");
		metodo.escrever(elemento.Email,"valeriacarrion2015@hotmail.com");
	    metodo.escrever(elemento.Cpf, "42386529088");
		metodo.escrever(elemento.nomedaMae,"Mariene de Oliveira Ventura");
		metodo.escrever(elemento.Celular,"11983370774");
	    metodo.escrever(elemento.Nascimento,"02/01/1991");
	    System.out.println("Teste executado com sucesso");
}      
	
	   @Test
	    public void Login () throws InterruptedException {
    	metodo.clicar(elemento.cookie);
    	Thread.sleep(3000);
		metodo.clicar(elemento.btnEntrar);
		Thread.sleep(2000);
		metodo.escrever(elemento.login,"valeriagiovannacarrion2019@gmail.com");
		metodo.escrever(elemento.password, "Carri2019@");
		Thread.sleep(3000);
		metodo.clicar(elemento.Entrar);
		System.out.println("Teste executado com sucesso");
	}

}


