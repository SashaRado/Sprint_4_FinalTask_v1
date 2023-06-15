package ru.praktikum.selenium.page_object;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class MainPage {

    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    //Верхняя кнопка "Заказать".
    private By orderTopButton = By.className("Button_Button__ra12g");
    //Блок с нижней кнопкой "Заказать".
    private By blockOrder = By.className("Home_RoadMap__2tal_");
    //Нижняя кнопка "Заказать".
    private By orderBottomButton = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[contains(text(), 'Заказать')]");
    //Блок с разделом "Вопросы о важном".

    private By blockFaq = By.className("Home_FourPart__1uthg");
    //Кнопка с вопросом "Сколько это стоит? И как оплатить?"
    private By textQuestionCoast = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Сколько это стоит? И как оплатить?')]");
    //Текст ответа на вопрос о стоимости.
    private By textAnswerCoast = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");

    //Кнопка с вопросом "Хочу сразу несколько самокатов! Так можно?"
    private By textQuestionFewScooters = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Хочу сразу несколько самокатов! Так можно?')]");
    //Текст ответа на вопрос о количестве самокатов.
    private By textAnswerFewScooters = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");

    //Кнопка с вопросом "Как рассчитывается время аренды?"
    private By textQuestionTimeRent = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Как рассчитывается время аренды?')]");
    //Текст ответа на вопрос о времени аренды.
    private By textAnswerTimeRent = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");

    //Кнопка с вопросом "Можно ли заказать самокат прямо на сегодня?"
    private By textQuestionRentToday = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли заказать самокат прямо на сегодня?')]");
    //Текст ответа на вопрос об аренде сегодня.
    private By textAnswerRentToday = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");

    //Кнопка с вопросом "Можно ли продлить заказ или вернуть самокат раньше?"
    private By textQuestionExtendAndReturn = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли продлить заказ или вернуть самокат раньше?')]");
    //Текст ответа на вопрос о продлении и возврате.
    private By textAnswerExtendAndReturn = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");

    //Кнопка с вопросом "Вы привозите зарядку вместе с самокатом?"
    private By textQuestionAboutCharger = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Вы привозите зарядку вместе с самокатом?')]");
    //Текст ответа на вопрос о зарядке.
    private By textAnswerAboutCharger = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");

    //Кнопка с вопросом "Можно ли отменить заказ?"
    private By textQuestionDenyOrder = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли отменить заказ?')]");
    //Текст ответа на вопрос об отмене заказа.
    private By textAnswerDenyOrder = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");

    //Кнопка с вопросом "Я живу за МКАДом, привезёте?"
    private By textQuestionDeliveryFurtherMKAD = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Я жизу за МКАДом, привезёте?')]");
    //Текст ответа на вопрос о доставка за МКАД.
    private By textAnswerDeliveryFurtherMKAD = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    public void clickOrderTopButton() {
        webDriver.findElement(orderTopButton).click();
    }

    public void scrollBlockOrder() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(blockOrder));
    }

    public void clickOrderBottomButton() {
        webDriver.findElement(orderBottomButton).click();
    }

    public void scrollDown() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(blockFaq));
    }

    public void clickTextQuestionCoast() {
        webDriver.findElement(textQuestionCoast).click();
    }

    public void checkTextAnswerCoast(String expectedText) {
        String actualText = webDriver.findElement(textAnswerCoast).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionFewScooters() {
        webDriver.findElement(textQuestionFewScooters).click();
    }

    public void checkTextAnswerFewScooters(String expectedText) {
        String actualText = webDriver.findElement(textAnswerFewScooters).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionTimeRent() {
        webDriver.findElement(textQuestionTimeRent).click();
    }

    public void checkTextAnswerTimeRent(String expectedText) {
        String actualText = webDriver.findElement(textAnswerTimeRent).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionRentToday() {
        webDriver.findElement(textQuestionRentToday).click();
    }

    public void checkTextAnswerRentToday(String expectedText) {
        String actualText = webDriver.findElement(textAnswerRentToday).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionExtendAndReturn() {
        webDriver.findElement(textQuestionExtendAndReturn).click();
    }

    public void checkTextAnswerExtendAndReturn(String expectedText) {
        String actualText = webDriver.findElement(textAnswerExtendAndReturn).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionAboutCharger() {
        webDriver.findElement(textQuestionAboutCharger).click();
    }

    public void checkTextAnswerAboutCharger(String expectedText) {
        String actualText = webDriver.findElement(textAnswerAboutCharger).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionDenyOrder() {
        webDriver.findElement(textQuestionDenyOrder).click();
    }

    public void checkTextAnswerDenyOrder(String expectedText) {
        String actualText = webDriver.findElement(textAnswerDenyOrder).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionDeliveryFurtherMKAD() {
        webDriver.findElement(textQuestionDeliveryFurtherMKAD).click();
    }

    public void checkTextAnswerDeliveryFurtherMKAD(String expectedText) {
        String actualText = webDriver.findElement(textAnswerDeliveryFurtherMKAD).getText();
        Assert.assertEquals(expectedText, actualText);
    }
}