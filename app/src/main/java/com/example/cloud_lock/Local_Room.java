package com.example.cloud_lock;

public class Local_Room {
    private int person_num;
    private String room_id;
    private int room_num;

    public Local_Room(int room_num,String room_id,int person_num){
        this.room_id=room_id;
        this.person_num=person_num;
        this.room_num=room_num;
    }

    public int getPerson_num() {
        return person_num;
    }

    public String getRoom_id() {
        return room_id;
    }

    public int getRoom_num() {
        return room_num;
    }
}
