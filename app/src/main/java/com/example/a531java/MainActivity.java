package com.example.a531java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.main_rec_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        refreshAdapter(allData());
    }

    public void refreshAdapter(ArrayList<Chats> chats) {
        Adapter_View adapter_view = new Adapter_View(this, chats);
        recyclerView.setAdapter(adapter_view);
    }

    public ArrayList<Chats> allData() {
        ArrayList<Chats> lists = new ArrayList<>();
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        lists.add(new Chats(R.drawable.alisher, "Alisher Daminov", "last seen recently", false));
        return lists;
    }
}