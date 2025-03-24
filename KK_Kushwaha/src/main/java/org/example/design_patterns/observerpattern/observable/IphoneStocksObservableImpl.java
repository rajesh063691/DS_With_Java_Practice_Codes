package org.example.design_patterns.observerpattern.observable;

import org.example.design_patterns.observerpattern.observer.NotificationObserverAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservableImpl implements StocksObservable {

    public List<NotificationObserverAlert> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationObserverAlert observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserverAlert observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (NotificationObserverAlert observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0) {
            notifyObserver();
        }

        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
