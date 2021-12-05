package model;

import view.ConversionAreaObserver;

public interface Subject {
	
    public void register(ConversionAreaObserver o);
    public void unregister(ConversionAreaObserver o);
    public void notifyObserver();

}
