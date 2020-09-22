package com.example.cloud_lock;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobObject;

public class Lock_Room extends BmobObject {
    private Integer Room_Person;
    private List<String> Person_Name;

    private Integer Hour;
    private Integer Minute;

    public void setRoom_Person(Integer num){
        this.Room_Person=num;
    }

    public void setHour(Integer hour) {
        Hour = hour;
    }

    public void setMinute(Integer minute) {
        Minute = minute;
    }

    public Integer getHour() {
        return Hour;
    }

    public Integer getMinute() {
        return Minute;
    }

    public Integer getRoom_Person() {
        return Room_Person;
    }

    public List<String> getPerson_Name() {
        return Person_Name;
    }
}
