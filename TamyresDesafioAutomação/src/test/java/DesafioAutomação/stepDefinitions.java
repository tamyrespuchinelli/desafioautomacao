package DesafioAutomação;

import Pages.preencherFormulárioPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitions {

    private static WebDriver driver = null;
    private Pages.preencherFormulárioPage preencherFormulárioPage;

    @Before
    private static void inicializar() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Given("^Acesso a url (.*)$")
    public void Acesso_a_url(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        preencherFormulárioPage = new preencherFormulárioPage(driver);
        preencherFormulárioPage.openUrl(url);
    }

    @When("^Preencho meu nome (.*)$")
    public void Preencho_meu_nome(String txtNome) throws Throwable {
        preencherFormulárioPage.setTxtNome(txtNome);
    }

    @When("^Preencho meu email (.*)$")
    public void Preencho_meu_email(String txtEmail) throws Throwable {
        preencherFormulárioPage.setTxtEmail(txtEmail);
    }



    @When("^Prencho minha cor favorita$")
    public void prencho_minha_cor_favorita() throws Throwable {
        preencherFormulárioPage.setCor();
    }

    @When("^Preencho minha comida favorita$")
    public void preencho_minha_comida_favorita() throws Throwable {
        preencherFormulárioPage.setComidaFavorita();

    }


    @When("^Preencho minha sobremesa favorita$")
    public void preencho_minha_sobremesa_favorita() throws Throwable {
        preencherFormulárioPage.setSobremesa();
    }

    @When("^Preencho mais de uma sobremesa favorita$")
    public void preencho_mais_de_uma_sobremesa_favorita() throws Throwable {
        preencherFormulárioPage.setSobremesa();
        preencherFormulárioPage.setSobremesaDois();
    }

    @When("^Respondo o quanto gosto de animais$")
    public void respondo_o_quanto_gosto_de_animais() throws Throwable {
        preencherFormulárioPage.setAnimais();
    }

    @When("^Respondo o quanto considero o eSport$")
    public void respondo_o_quanto_considero_o_eSport() throws Throwable {
        preencherFormulárioPage.seteSport();
    }

    @When("^Respondo o quanto considero o Baseball$")
    public void respondo_o_quanto_considero_o_Baseball() throws Throwable {
        preencherFormulárioPage.setBaseball();
    }

    @When("^Respondo o quanto considero o Futebol$")
    public void respondo_o_quanto_considero_o_Futebol() throws Throwable {
        preencherFormulárioPage.setFutebol();
    }

    @When("^Respondo o quanto considero o Rugby$")
    public void respondo_o_quanto_considero_o_Rugby() throws Throwable {
        preencherFormulárioPage.setRugby();
    }


    @When("^Preencho os ingredientes Pão Carne Queijo Ovo Salada do sandwich EggXburguer$")
    public void preencho_os_ingredientes_do_sandwich_EggXburguer() throws Throwable {
        preencherFormulárioPage.setEggXburguerPao();
        preencherFormulárioPage.setEggXburguerCarne();
        preencherFormulárioPage.setEggXburguerQueijo();
        preencherFormulárioPage.setEggXburguerOvo();
        preencherFormulárioPage.setEggXburguerSalada();
    }


    @When("^Preencho os ingredientes Pão Queijo Ovo Salada do sandwich Vegetariano$")
    public void preencho_os_ingredientes_do_sandwich_VegetarianoPao() throws Throwable {
        preencherFormulárioPage.setVegetarianoPao();
        preencherFormulárioPage.setVegetarianoQueijo();
        preencherFormulárioPage.setVegetarianoOvo();
        preencherFormulárioPage.setVegetarianoSalada();
    }

    @When("^Preencho os ingredientes Pão Carne Queijo Salada do sandwich Xburguer$")
    public void preencho_os_ingredientes_do_sandwich_XburguerPao() throws Throwable {
        preencherFormulárioPage.setXburguerPao();
        preencherFormulárioPage.setXburguerCarne();
        preencherFormulárioPage.setXburguerQueijo();
        preencherFormulárioPage.setXburguerSalada();
    }


    @When("^Preencho os ingredientes Pão Carne do sandwich Hamburguer$")
    public void preencho_os_ingredientes_do_sandwich_HamburguerPao() throws Throwable {
        preencherFormulárioPage.setHamburguerPao();
        preencherFormulárioPage.setHamburguerCarne();
    }


    @When("^Respondo que o dia hoje é$")
    public void respondo_que_o_dia_hoje_é() throws Throwable {
        preencherFormulárioPage.dataDeHoje();
    }

    @When("^Preencho uma data inválida(.*)$")
    public void preencho_uma_data_inválida(String Data) throws Throwable {
        preencherFormulárioPage.setDataInvalida(Data);
    }
    @When("^Prencho a hora$")
    public void prencho_a_hora() throws Throwable {
        preencherFormulárioPage.setHora();
        preencherFormulárioPage.setMinuto();
    }


    @When("^Prencho a hora inválida(.*)$")
    public void prencho_a_hora_inválida(String Hora) throws Throwable {
          preencherFormulárioPage.setHoraInvalida(Hora);
    }

    @When("^Clico em enviar$")
    public void clico_em_enviar() throws Throwable {
        preencherFormulárioPage.setButtonEnviar();
    }

    @When("^Verifico a mensagem (.*)$")
    public void verifico_o_envio_do_formulário(String msg) throws Throwable {
        preencherFormulárioPage.setTxtValidaEnvio(msg);
    }


}
