package ru.praktikum.selenium.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class OrderPageTwo {

    WebDriver webDriver;

    public OrderPageTwo(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    // Поле даты доставки.
    private By FieldCalendarDate = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    // Стрелка выпадающего списка продолжительности аренды.
    private By DropdownArrowRentalPeriod = By.xpath(".//span[@class='Dropdown-arrow']");
    // Значение списка продолжительности аренды - "Сутки".
    private By RentalPeriodOneDay = By.xpath(".//div[@role='option' and text()='сутки']");
    // Значение чек-бокса цвета самоката - "Черный".
    private By ScooterColourBlack = By.id("black");
    // Поле комментария.
    private By FieldComments = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    // Кнопка "Заказать".
    private By OrderButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    // Текст всплывающего уведомления - "Хотите оформить заказ?".
    private By WindowQuestionNewOrder = By.xpath(".//div[text()='Хотите оформить заказ?']");
    // Кнопка "Да" во всплывающем уведомлении.
    private By OrderButtonFinal = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // Текст всплывающего подтверждения - "Заказ оформлен".
    private By WindowСonfirmationNewOrder = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public void typeFieldCalendarDate(String calendarDate){
        webDriver.findElement(FieldCalendarDate).sendKeys(calendarDate);
    }
    public void clickDropdownArrowRentalPeriod(){
        webDriver.findElement(DropdownArrowRentalPeriod).click();
    }
    public void pickRentalPeriodOneDay(){
        webDriver.findElement(RentalPeriodOneDay).click();
    }
    public void pickScooterColourBlack(){
        webDriver.findElement(ScooterColourBlack).click();
    }
    public void typeFieldComments(String comments){
        webDriver.findElement(FieldComments).sendKeys(comments);
    }
    public void clickOrderButtonNext(){
        webDriver.findElement(OrderButtonNext).click();
    }
    public void checkWindowQuestionNewOrder(){
        boolean isDisplayed = webDriver.findElement(WindowQuestionNewOrder).isDisplayed();
        assertTrue(isDisplayed);
    }
    public void clickOrderButtonFinal(){
        webDriver.findElement(OrderButtonFinal).click();
    }
    public void checkWindowСonfirmationNewOrder(){
        boolean isDisplayed = webDriver.findElement(WindowСonfirmationNewOrder).isDisplayed();
        assertTrue(isDisplayed);
    }
}