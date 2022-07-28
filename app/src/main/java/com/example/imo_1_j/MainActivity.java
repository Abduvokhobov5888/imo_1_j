package com.example.imo_1_j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllChats();
    }
    void getAllChats(){
        ArrayList<Chat> chats = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        chats.add(new Chat(R.drawable.foto2,"Abbosbek Abduvoxobov",3));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev",1));
        chats.add(new Chat(R.drawable.foto4,"Yunusbek Muqumjonov",0));
        chats.add(new Chat(R.drawable.foto5,"Muslimbek Abdurashidov",8));
        chats.add(new Chat(R.drawable.foto2,"Abbosbek Abduvoxobov",5));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev",1));
        chats.add(new Chat(R.drawable.foto4,"Yunusbek Muqumjonov",0));
        chats.add(new Chat(R.drawable.foto5,"Muslimbek Abdurashidov",8));
        chats.add(new Chat(R.drawable.foto2,"Abbosbek Abduvoxobov",5));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev",1));
        chats.add(new Chat(R.drawable.foto4,"Yunusbek Muqumjonov",0));
        chats.add(new Chat(R.drawable.foto5,"Muslimbek Abdurashidov",8));
        chats.add(new Chat(R.drawable.foto2,"Abbosbek Abduvoxobov",5));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev",1));
        chats.add(new Chat(R.drawable.foto4,"Yunusbek Muqumjonov",0));
        chats.add(new Chat(R.drawable.foto5,"Muslimbek Abdurashidov",8));
        chats.add(new Chat(R.drawable.foto2,"Abbosbek Abduvoxobov",5));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev",1));
        chats.add(new Chat(R.drawable.foto4,"Yunusbek Muqumjonov",0));
        chats.add(new Chat(R.drawable.foto5,"Muslimbek Abdurashidov",8));

        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

}