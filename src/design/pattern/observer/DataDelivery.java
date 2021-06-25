package design.pattern.observer;

//DataDelivery is obserbable here
public interface DataDelivery {
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyAllObserver();
	public void setLocation(String location);
}
