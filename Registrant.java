/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignproject;

/**
 *
 * @author Dell
 */
public class Registrant implements MyObserver{
    @Override
    public void update(Source observable) {
        System.out.println("live result: " + 
                ((Reporter)observable).getScoreLine());
    }
}
