package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrincipalPage;

public class Steps {
	@Given("eu acesso a pagina principal") 
	   public void goToMainPage(DataTable data) { 
		PrincipalPage.homePage(data);
	   } 
		
	@When("preencho os campos necessarios para fazer matricula") 
	public void preencheCampoMatricula (){
		PrincipalPage.preencheDadosBasicosMatricula();
	} 
//	@And("clico no icone de busca") 
//	public void clicarIconeBusca() {
//		PrincipalPage.clicarIconeBusca();
//	} 
//	
//	@Then("valido se o produto buscado \"([^\"]*)\" esta correto$")
//	public void validaBuscaProduto(String produtoValidado) {
//	   PrincipalPage.validarProduto(produtoValidado);
//	}
	   
   
}
