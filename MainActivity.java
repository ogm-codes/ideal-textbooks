package com.example.idealtextbook;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import static android.support.design.widget.BottomNavigationView.*;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Queen of Hearts","Novel","203",R.drawable.queen));
        lstBook.add(new Book("Before I die","Novel","203",R.drawable.death));
        lstBook.add(new Book("Wonder","Novel","203",R.drawable.wonder));
        lstBook.add(new Book("You can run But you can't Hide","Novel","203",R.drawable.runhide));
        lstBook.add(new Book("Hold Still","Novel","203",R.drawable.hold));
        lstBook.add(new Book("Out of the Box","Novel","203",R.drawable.box));
        lstBook.add(new Book("Two Million Dollar Intern","Novel","203",R.drawable.money));
        lstBook.add(new Book("The Grow Girl","Novel","203",R.drawable.growgirl));
        lstBook.add(new Book("Cherry","Novel","203",R.drawable.cherry));
        lstBook.add(new Book("The Martian","Novel","203",R.drawable.martian));
        lstBook.add(new Book("The Night Gardener","Novel","203",R.drawable.nightgarden));
        lstBook.add(new Book("Tess of the Road","Novel","203",R.drawable.road));
        lstBook.add(new Book("Fox 8","Novel","203",R.drawable.fox));
        lstBook.add(new Book("Very Nice","Novel","203",R.drawable.nice));
        lstBook.add(new Book("The Monk Who Sold his Ferrari","Novel","203",R.drawable.lambo));


        RecyclerView myview = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdaptor myAdaptor = new RecyclerViewAdaptor(this,lstBook);
        myview.setLayoutManager(new GridLayoutManager(this,3));
        myview.setAdapter(myAdaptor);


    }


}
