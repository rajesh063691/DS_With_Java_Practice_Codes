package org.example.design_patterns.observerpattern.observer;

import org.example.design_patterns.observerpattern.observable.StocksObservable;

public class PhoneNotificationObserverAlertImpl implements NotificationObserverAlert{
    String phone;
    StocksObservable stocksObservable;

    public PhoneNotificationObserverAlertImpl(String phone, StocksObservable stocksObservable) {
        this.phone = phone;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(phone, "product is in stock, hurry up!!!");
    }

    private void sendEmail(String phone, String message) {
        System.out.println("message :: " + message + " sent to phone :: " + phone);
    }
}
