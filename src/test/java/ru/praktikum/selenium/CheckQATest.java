package ru.praktikum.selenium;

import org.junit.Test;
import ru.praktikum.selenium.page_object.MainPage;

public class CheckQATest extends Base {

    MainPage mainPage;

    String answerPayText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    String answerFewScootersText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    String answerTimeRentText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    String answerRentTodayText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    String answerExtendAndReturnText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    String answerAboutChargerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    String answerDenyOrderText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    String answerDeliveryFurtherMKADText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test
    public void checkHowMuchAndHowPay() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionCoast();
        mainPage.checkTextAnswerCoast(answerPayText);
    }
    @Test
    public void checkCoupleOfScooters() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionFewScooters();
        mainPage.checkTextAnswerFewScooters(answerFewScootersText);
    }
    @Test
    public void checkRentalTime() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionTimeRent();
        mainPage.checkTextAnswerTimeRent(answerTimeRentText);
    }
    @Test
    public void checkScooterToday() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionRentToday();
        mainPage.checkTextAnswerRentToday(answerRentTodayText);
    }
    @Test
    public void checkRentalPeriod() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionExtendAndReturn();
        mainPage.checkTextAnswerExtendAndReturn(answerExtendAndReturnText);
    }
    @Test
    public void checkChargeForScooter() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionAboutCharger();
        mainPage.checkTextAnswerAboutCharger(answerAboutChargerText);
    }
    @Test
    public void checkCancellations() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionDenyOrder();
        mainPage.checkTextAnswerDenyOrder(answerDenyOrderText);
    }
    @Test
    public void checkRentOutsideMoscow() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollDown();
        mainPage.clickTextQuestionDeliveryFurtherMKAD();
        mainPage.checkTextAnswerDeliveryFurtherMKAD(answerDeliveryFurtherMKADText);
    }
}