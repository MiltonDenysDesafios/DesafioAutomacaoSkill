package pages;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
import io.cucumber.datatable.DataTable;

public class PrincipalPage extends BasePage{
	private String retornoProduto;
	protected static List<Map<String, String>> massa;
	
	//metodo para abrir home page utilizando datatable
	public static void homePage(DataTable data) {
		massa = data.asMaps(String.class, String.class);
		try {			
			openHomePage("http://www.skill.com.br/quero-04-aulas");
		} catch (Exception e) {
			
		}
	}
	//metodo para preencher todos os dados basicos da matricula
	public static void preencheDadosBasicosMatricula(){
		try{
			write(By.xpath("//*[@id='formQueroDesconto1']/div[1]/input"), (massa.get(0).get("nome")));
			write(By.xpath("//*[@id='formQueroDesconto1']/div[2]/input"), (massa.get(0).get("email")));
			write(By.xpath("//*[@id='formQueroDesconto1']/div[3]/input"), (massa.get(0).get("cel")));
			click(By.xpath("//*[@id='formQueroDesconto1']/div[4]/input"));
			write(By.xpath("//*[@id='formQueroDesconto1']/div[4]/input"), (massa.get(0).get("end")));

		}catch(Exception e){
			System.err.print("Elemento não encontrado");
		}
		}
//	public static void clicarIconeBusca() {
//		try {
//			click(By.xpath("//button[@class='search-bar__submit-button']"));
//		} catch (Exception e) {
//			System.err.print("Elemento não encontrado");
//		}
//	}
//	public static void validarProduto(String retornoProduto) {
//		try {
//			String produtoRetornado = obterTexto(By.xpath("//h1[@class='SearchHeader_title__2hI7I']"));
//			Assert.assertEquals(retornoProduto, produtoRetornado);
//		} catch (Exception e) {
//			System.err.print("Elemento não encontrado");
//		}
//	}
	
}
