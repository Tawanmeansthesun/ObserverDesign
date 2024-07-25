/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignproject;


import java.util.ArrayList;
/**
 *
 * @author Dell
 */
//put the method here in Source
public class Source {
    ArrayList<MyObserver> observers; 
    public Source() {
        observers = new ArrayList<>();
    }
    public void register(MyObserver obj) {
        observers.add(obj);
    }
    public void notifyObservers() {
        for (MyObserver observer: observers) {
            observer.update(this);
	}
    }
}
