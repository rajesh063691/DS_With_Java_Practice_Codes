package org.example.design_patterns.observerpattern.observable;

import org.example.design_patterns.observerpattern.observer.NotificationObserverAlert;

public interface StocksObservable {
    public void add(NotificationObserverAlert observer);

    public void remove(NotificationObserverAlert observer);

    public void notifyObserver();

    public void setStockCount(int newStockCount);

    public int getStockCount();
}
