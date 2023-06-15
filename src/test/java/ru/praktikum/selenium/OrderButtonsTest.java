package ru.praktikum.selenium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.selenium.page_object.MainPage;
import ru.praktikum.selenium.page_object.OrderPageOne;
import ru.praktikum.selenium.page_object.OrderPageTwo;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderButtonsTest extends Base {

    MainPage mainPage;
    OrderPageOne orderPageOne;
    OrderPageTwo orderPageTwo;

    String name;
    String surname;
    String address;
    String phoneNumber;
    String calendarDate;
    String comments;

    public OrderButtonsTest(String name, String surname, String address, String phoneNumber, String calendarDate, String comments) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.calendarDate = calendarDate;
        this.comments = comments;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> getCredentials() {
        return Arrays.asList(new Object[][]{
                {"Самокат", "Самокатов", "Ленинский 1", "89887771166", "05.05.2022", "Ура!"},
                {"Яндекс", "Практикум", "Вернадского 5", "89886661122", "01.01.2023", ""},
        });
    }

    @Test
    public void checkTopButton() {
        mainPage = new MainPage(webDriver);
        orderPageOne = new OrderPageOne(webDriver);
        orderPageTwo = new OrderPageTwo(webDriver);

        mainPage.clickOrderTopButton();

        orderPageOne.typeFieldName(name);
        orderPageOne.typeFieldSurname(surname);
        orderPageOne.typeFieldAddress(address);
        orderPageOne.clickDropdownArrowMetro();
        orderPageOne.pickListMetro();
        orderPageOne.typeFieldPhone(phoneNumber);
        orderPageOne.clickOrderButtonNext();

        orderPageTwo.typeFieldCalendarDate(calendarDate);
        orderPageTwo.clickDropdownArrowRentalPeriod();
        orderPageTwo.pickRentalPeriodOneDay();
        orderPageTwo.pickScooterColourBlack();
        orderPageTwo.typeFieldComments(comments);
        orderPageTwo.clickOrderButtonNext();
        orderPageTwo.checkWindowQuestionNewOrder();
        orderPageTwo.clickOrderButtonFinal();
        orderPageTwo.checkWindowСonfirmationNewOrder();
    }
    @Test
    public void checkDounButton() {
        mainPage = new MainPage(webDriver);
        orderPageOne = new OrderPageOne(webDriver);
        orderPageTwo = new OrderPageTwo(webDriver);

        mainPage.scrollBlockOrder();
        mainPage.clickOrderBottomButton();

        orderPageOne.typeFieldName(name);
        orderPageOne.typeFieldSurname(surname);
        orderPageOne.typeFieldAddress(address);
        orderPageOne.clickDropdownArrowMetro();
        orderPageOne.pickListMetro();
        orderPageOne.typeFieldPhone(phoneNumber);
        orderPageOne.clickOrderButtonNext();

        orderPageTwo.typeFieldCalendarDate(calendarDate);
        orderPageTwo.clickDropdownArrowRentalPeriod();
        orderPageTwo.pickRentalPeriodOneDay();
        orderPageTwo.pickScooterColourBlack();
        orderPageTwo.typeFieldComments(comments);
        orderPageTwo.clickOrderButtonNext();
        orderPageTwo.checkWindowQuestionNewOrder();
        orderPageTwo.clickOrderButtonFinal();
        orderPageTwo.checkWindowСonfirmationNewOrder();
    }
}