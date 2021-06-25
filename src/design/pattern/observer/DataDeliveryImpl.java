package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DataDeliveryImpl implements DataDelivery {

	List<Observer> list = new ArrayList<>();
	String location;

	@Override
	public void addObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void notifyAllObserver() {
		for (Observer obs : this.list) {
			obs.update(location);
		}
	}
}
