package com.example.imo_1_j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Chat> items;

    public ChatAdapter(Context context, ArrayList<Chat> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_view, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chat chat = items.get(position);

        if (holder instanceof MessageViewHolder){
            ShapeableImageView shapeableImageView= ((MessageViewHolder)holder).iv_profile;
            TextView tv_fullname = ((MessageViewHolder)holder).tv_fullname;
            TextView tv_count = ((MessageViewHolder)holder).tv_count;

            Glide.with(context).load(chat.profile).into(shapeableImageView);
             ((MessageViewHolder) holder).tv_count.setText(""+chat.count);
            tv_fullname.setText(chat.fullname);

            if (chat.count > 0){
                tv_count.setVisibility(View.VISIBLE);
            }else {
                tv_count.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        TextView tv_count;
        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_profile = itemView.findViewById(R.id.iv_profile);
            tv_fullname = itemView.findViewById(R.id.tv_fullname);
            tv_count = itemView.findViewById(R.id.tv_count);

        }
    }
}
