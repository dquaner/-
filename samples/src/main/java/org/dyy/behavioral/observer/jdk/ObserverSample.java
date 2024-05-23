package org.dyy.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ObserverSample {

    public static void main(String[] args) {
        // Subject
        Observable observable = new Observable();

        //Observer
        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        /**
         * @see java.util.concurrent.Flow
         */
    }

}
