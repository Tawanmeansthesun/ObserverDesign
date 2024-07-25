/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignproject;

/**
 *
 * @author Dell
 */
public class Reporter extends Source {
    String scoreLine;
    public void setScoreLine(String scoreStr) {
        scoreLine = scoreStr;
        notifyObservers();
    }
    public String getScoreLine() {
        return scoreLine;
    }
}
