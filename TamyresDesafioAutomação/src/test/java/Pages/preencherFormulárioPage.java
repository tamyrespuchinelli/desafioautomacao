package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class preencherFormulárioPage extends basePage {

    //mapeamento dos elementos da tela//

    By txtNome = By.xpath("//input[@aria-label='Qual seu nome completo?']");
    By txtEmail = By.xpath("//input[@aria-label='Qual seu e-mail?']");
    By Cor = By.xpath("//div[@aria-label='Azul']");
    By Comida = By.cssSelector("[class='quantumWizMenuPaperselectOption appsMaterialWizMenuPaperselectOption freebirdThemedSelectOptionDarkerDisabled exportOption isSelected isPlaceholder']");
    By ComidaFavorita = By.cssSelector("[class='exportSelectPopup quantumWizMenuPaperselectPopup appsMaterialWizMenuPaperselectPopup'] [data-value='Massas']");
    By Sobremesa = By.cssSelector("[aria-label='Sorvete']");
    By SobremesaDois = By.cssSelector("[aria-label='Sorvete']") ;
    By Animais = By.cssSelector("[aria-label='10']");
    By ESport = By.cssSelector("[aria-label='Ruim, resposta para eSport']");
    By Baseball = By.cssSelector("[aria-label='Mediano, resposta para Baseball']");
    By Futebol = By.cssSelector("[aria-label='Bom, resposta para Futebol']");
    By Rugby = By.cssSelector("[aria-label='Ótimo, resposta para Rugby']");
    By EggXburguerPao = By.cssSelector("[aria-label='Pão, resposta para EggXburger']");
    By EggXburguerCarne = By.cssSelector("[aria-label='Carne, resposta para EggXburger']");
    By EggXburguerQueijo = By.cssSelector("[aria-label='Queijo, resposta para EggXburger']");
    By EggXburguerOvo = By.cssSelector("[aria-label='Ovo, resposta para EggXburger']");
    By EggXburguerSalada = By.cssSelector("[aria-label='Salada, resposta para EggXburger']");
    By VegetarianoPao = By.cssSelector("[aria-label='Pão, resposta para Vegetariano']");
    By VegetarianoQueijo = By.cssSelector("[aria-label='Queijo, resposta para Vegetariano']");
    By VegetarianoOvo = By.cssSelector("[aria-label='Ovo, resposta para Vegetariano']");
    By VegetarianoSalada = By.cssSelector("[aria-label='Salada, resposta para Vegetariano']");
    By XburguerPao = By.cssSelector("[aria-label='Pão, resposta para Xburguer']");
    By XburguerCarne = By.cssSelector("[aria-label='Carne, resposta para Xburguer']");
    By XburguerQueijo = By.cssSelector("[aria-label='Queijo, resposta para Xburguer']");
    By XburguerSalada = By.cssSelector("[aria-label='Salada, resposta para Xburguer']");
    By HamburguerPao = By.cssSelector("[aria-label='Pão, resposta para Hamburguer']");
    By HamburguerCarne = By.cssSelector("[aria-label='Carne, resposta para Hamburguer']");
    By dataDeHoje = By.xpath("//input[@type='date']");
    By DataInvalida = By.xpath("//input[@type='date']");
    By addHora = By.cssSelector("[aria-label='Hora']");
    By minuto = By.cssSelector("[aria-label='Minuto']");


    By horaInvalida =By.cssSelector("[aria-label='Hora']");

    By buttonEnviar = By.cssSelector("[class='appsMaterialWizButtonPaperbuttonLabel quantumWizButtonPaperbuttonLabel exportLabel']");

    public preencherFormulárioPage(WebDriver driver) {
        super(driver);
    }

    public void setTxtNome(String nome) {
        driver.findElement(txtNome).sendKeys(nome);

    }

    public void setTxtEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);

    }

    public void setCor() {
        driver.findElement(Cor).click();

    }

    public void setComidaFavorita() throws InterruptedException {
        driver.findElement(Comida).click();
        Thread.sleep(1400);
        driver.findElement(ComidaFavorita).click();

    }

    public void setSobremesa() {
        driver.findElement(Sobremesa).click();

    }
    public void setSobremesaDois() {
        driver.findElement(SobremesaDois).click();

    }

    public void setAnimais() {
        driver.findElement(Animais).click();
    }

    public void seteSport() {
        driver.findElement(ESport).click();
    }

    public void setBaseball() {
        driver.findElement(Baseball).click();
    }

    public void setFutebol() {
        driver.findElement(Futebol).click();
    }

    public void setRugby() {
        driver.findElement(Rugby).click();

    }

    public void setEggXburguerPao() {
        driver.findElement(EggXburguerPao).click();
    }

    public void setEggXburguerCarne() {
        driver.findElement(EggXburguerCarne).click();
    }

    public void setEggXburguerQueijo() {
        driver.findElement(EggXburguerQueijo).click();
    }

    public void setEggXburguerOvo() {
        driver.findElement(EggXburguerOvo).click();
    }

    public void setEggXburguerSalada() {
        driver.findElement(EggXburguerSalada).click();
    }

    public void setVegetarianoPao() {
        driver.findElement(VegetarianoPao).click();
    }

    public void setVegetarianoQueijo() {
        driver.findElement(VegetarianoQueijo).click();
    }

    public void setVegetarianoOvo() {
        driver.findElement(VegetarianoOvo).click();
    }

    public void setVegetarianoSalada() {
        driver.findElement(VegetarianoSalada).click();
    }

    public void setXburguerPao() {
        driver.findElement(XburguerPao).click();
    }

    public void setXburguerCarne() {
        driver.findElement(XburguerCarne).click();
    }

    public void setXburguerQueijo() {
        driver.findElement(XburguerQueijo).click();
    }

    public void setXburguerSalada() {
        driver.findElement(XburguerSalada).click();
    }

    public void setHamburguerPao() {
        driver.findElement(HamburguerPao).click();
    }

    public void setHamburguerCarne() {
        driver.findElement(HamburguerCarne).click();
    }

    public void dataDeHoje() {


        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        driver.findElement(dataDeHoje).sendKeys(date);
    }


    public void setDataInvalida(String Data) {

        driver.findElement(DataInvalida).sendKeys(Data);
    }
    public void setHoraInvalida(String Hora) {
        driver.findElement(horaInvalida).sendKeys(Hora);
    }


    public void setHora() {
        String pattern = "HH";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);


        GregorianCalendar gc = new GregorianCalendar();
        gc.add(gc.HOUR, 1);
        Date hora = gc.getTime();

        String date = simpleDateFormat.format(hora);
        System.out.println(date);

        driver.findElement(addHora).sendKeys(date);
    }


    public void setMinuto() {
        String pattern = "mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        driver.findElement(minuto).sendKeys(date);
    }

    public void setButtonEnviar() {
        driver.findElement(buttonEnviar).click();

    }

    public void setTxtValidaEnvio(String msgValidation) throws InterruptedException {
        {
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".freebirdFormviewerViewFormContentWrapper")).click();

            By txtValidaEnvio = By.xpath("//div[contains(text(), '" + msgValidation + "')]");
            Assert.assertTrue(driver.findElement(txtValidaEnvio).isDisplayed());

        }
    }
}