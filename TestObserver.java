/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignproject;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TestObserver {
    public static void main(String[] args) {
	Reporter obj = new Reporter();
	Registrant obj1 = new Registrant();
	Registrant obj2 = new Registrant();              
	obj.register(obj1);              
	obj.register(obj2);              
	Scanner sc = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score ");
        scoreLine = sc.nextLine();
        while (!scoreLine.equals("")) {
            obj.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = sc.nextLine();
        }
        sc.close();
    }
}
