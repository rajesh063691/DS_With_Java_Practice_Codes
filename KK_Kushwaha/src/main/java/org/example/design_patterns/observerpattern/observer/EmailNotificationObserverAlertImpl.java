package org.example.design_patterns.observerpattern.observer;

import org.example.design_patterns.observerpattern.observable.StocksObservable;

public class EmailNotificationObserverAlertImpl implements NotificationObserverAlert {

    String emailId;
    StocksObservable stocksObservable;

    public EmailNotificationObserverAlertImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock, hurry up!!!");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("message :: " + message + " sent to email :: " + emailId);
    }
}
