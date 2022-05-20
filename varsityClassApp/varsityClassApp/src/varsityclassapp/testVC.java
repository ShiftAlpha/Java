/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varsityclassapp;

/**
 *
 * @author 16012775
 */
public class testVC {
    
    public static void main(String[] args){
        
        employees emp = new employees(101, "Blue", "Sipho", "Ball", "in your back yard");
        lecturer lec = new lecturer("IT", 2, "Info", 12000, 101, "Dhirav", "Rana", "IT", "94 Northway");
        
        studentAd stuAd[] = new studentAd[10];
        
        System.out.println(lec);
        System.out.println(lecturer.calcSalary(25));
        
    }
    
    }
