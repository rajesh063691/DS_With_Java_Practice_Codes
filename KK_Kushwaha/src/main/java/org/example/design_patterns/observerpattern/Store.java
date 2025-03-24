package org.example.design_patterns.observerpattern;

import org.example.design_patterns.observerpattern.observable.IphoneStocksObservableImpl;
import org.example.design_patterns.observerpattern.observable.StocksObservable;
import org.example.design_patterns.observerpattern.observer.NotificationObserverAlert;
import org.example.design_patterns.observerpattern.observer.EmailNotificationObserverAlertImpl;
import org.example.design_patterns.observerpattern.observer.PhoneNotificationObserverAlertImpl;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneStocksObservableImpl();
        NotificationObserverAlert observer1 = new EmailNotificationObserverAlertImpl("rajesh", iphoneStocksObservable);
        NotificationObserverAlert observer2 = new EmailNotificationObserverAlertImpl("puja", iphoneStocksObservable);
        NotificationObserverAlert observer3 = new PhoneNotificationObserverAlertImpl("rajesh", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}
