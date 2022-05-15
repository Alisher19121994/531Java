package com.example.a531java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Adapter_View extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Chats> list;
    int HEADER = 0;
    int YES = 1;

    public Adapter_View(Context context, ArrayList<Chats> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == HEADER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header, parent, false);
            return new MyViews(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter, parent, false);
        return new MyViews1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chats chats = list.get(position);
        if (holder instanceof MyViews1) {
            ((MyViews1) holder).shapeableImageView.setImageResource(chats.profile);
            ((MyViews1) holder).textView1.setText(chats.fullname);
            ((MyViews1) holder).textView2.setText(chats.messages);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (isHeader(position)) return HEADER;
        Chats chats = list.get(position);
        if (chats.available) return YES;
        return YES;
    }

    public boolean isHeader(int positions) {
        return positions == 0;
    }

    public class MyViews extends RecyclerView.ViewHolder {

        public MyViews(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class MyViews1 extends RecyclerView.ViewHolder {
        ShapeableImageView shapeableImageView;
        TextView textView1;
        TextView textView2;

        public MyViews1(@NonNull View itemView) {
            super(itemView);
            shapeableImageView = itemView.findViewById(R.id.image_v);
            textView1 = itemView.findViewById(R.id.fullname);
            textView2 = itemView.findViewById(R.id.seen);
        }
    }
}
