package com.example.cloud_lock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    private List<Local_Room> mData = null;
    private Context mContext;
    private Room_Adapter mAdapter = null;
    private ListView list_room;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this, "e01dc61baeb809789bfb422d9e1ca30c");
//        Lock_Room lock_room=new Lock_Room();
//        lock_room.setRoom_Person(0);
//        for(int i=0;i<5;i++){
//            lock_room.save(new SaveListener<String>() {
//                @Override
//                public void done(String objectId,BmobException e) {
//                    if(e==null){
//                       Toast.makeText(MainActivity.this,"添加数据成功，返回objectId为："+objectId,Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this,"添加数据失败，返回objectId为："+objectId,Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
        

    }
}