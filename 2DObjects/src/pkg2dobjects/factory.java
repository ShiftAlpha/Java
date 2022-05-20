/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dobjects;

/**
 *
 * @author 16012775
 */
public class factory {
    
    private static double rate;
    private static int room;
    private static boolean occupied;

    public factory(double rate, int room, boolean occupied) {
        this.rate = rate;
        this.room = room;
        this.occupied = occupied;
    }
    public static double getRate() {
        return rate;
    }

    public static int getRoom() {
        return room;
    }

    public static boolean isOccupied() {
        return occupied;
    }

    public static void setRate(double rate) {
        factory.rate = rate;
    }

    public static void setRoom(int room) {
        factory.room = room;
    }

    public static void setOccupied(boolean occupied) {
        factory.occupied = occupied;
    }

    

    
    
    
    
}
