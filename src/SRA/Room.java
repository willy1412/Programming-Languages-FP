/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRA;

/**
 *
 * @author Willy1412
 */
public class Room {
    String roomName;
    boolean roomBooked;

    public Room(String roomName, boolean roomBooked) {
        this.roomName = roomName;
        this.roomBooked = roomBooked;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isRoomBooked() {
        return roomBooked;
    }

    public void setRoomBooked(boolean roomBooked) {
        this.roomBooked = roomBooked;
    }
    
    
}
