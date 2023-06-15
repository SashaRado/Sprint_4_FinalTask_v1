package ru.praktikum.selenium.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class OrderPageOne {
    WebDriver webDriver;

    public OrderPageOne(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    // Поле с именем.
    private By FieldName = By.xpath(".//input[@placeholder = '* Имя']");
    // Поле с фамилией.
    private By FieldSurname = By.xpath(".//input[@placeholder = '* Фамилия']");
    // Поле с адресом.
    private By FieldAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    // Стрелка выпадающего списка станций метро.
    private By DropdownArrowMetro = By.className("select-search__value");
    // Значение списка станций метро - "Ленинский проспект".
    private By ListMetro = By.xpath(".//div[@class='Order_Text__2broi' and text()='Сокольники']");
    // Поле с номером телефона.
    private By FieldPhone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    // Кнопка "Далее".
    private By OrderButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    public void typeFieldName(String name) {
        webDriver.findElement(FieldName).sendKeys(name);
    }
    public void typeFieldSurname(String surname) {
        webDriver.findElement(FieldSurname).sendKeys(surname);
    }
    public void typeFieldAddress(String address) {
        webDriver.findElement(FieldAddress).sendKeys(address);
    }
    public void clickDropdownArrowMetro(){
        webDriver.findElement(DropdownArrowMetro).click();
    }
    public void pickListMetro(){
        webDriver.findElement(ListMetro).click();
    }
    public void typeFieldPhone(String phoneNumber){
        webDriver.findElement(FieldPhone).sendKeys(phoneNumber);
    }
    public void clickOrderButtonNext(){
        webDriver.findElement(OrderButtonNext).click();
    }
}