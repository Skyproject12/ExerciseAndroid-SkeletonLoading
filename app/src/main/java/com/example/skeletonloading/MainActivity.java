package com.example.skeletonloading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView= findViewById(R.id.recycler_post);
        final ArrayList<Notes> list= new ArrayList<>();
        final NotesAdapter notesAdapter= new NotesAdapter(list, this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                list.add(new Notes("title","deskripsi", R.mipmap.ic_launcher));
                list.add(new Notes("title","deskripsi", R.mipmap.ic_launcher));
                list.add(new Notes("title","deskripsi", R.mipmap.ic_launcher));
                list.add(new Notes("title","deskripsi", R.mipmap.ic_launcher));
                list.add(new Notes("title","deskripsi", R.mipmap.ic_launcher));
                list.add(new Notes("title","deskripsi", R.mipmap.ic_launcher));
                notesAdapter.showShummer=false;// ubah status showsummer menjadi false
                notesAdapter.notifyDataSetChanged(); // request perubahan adapter
            }
        },5000);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(notesAdapter);

    }
}
