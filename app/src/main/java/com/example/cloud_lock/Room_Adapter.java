package com.example.cloud_lock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class Room_Adapter extends BaseAdapter {
    private LinkedList<Local_Room> mData;
    private Context mContext;

    public Room_Adapter(LinkedList<Local_Room> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.room_list_item,parent,false);

        TextView room_num = (TextView) convertView.findViewById(R.id.room_num);
        TextView person_num = (TextView) convertView.findViewById(R.id.person_num);
        room_num.setText(mData.get(position).getRoom_num());
        person_num.setText(mData.get(position).getPerson_num()+"/4");
        return convertView;
    }
}

