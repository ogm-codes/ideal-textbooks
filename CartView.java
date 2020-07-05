package com.example.idealtextbook;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;

public class CartView extends AppCompatActivity {

    ListView myList;
    String[] items;
    String[] prices;
    String[] description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_view);

        Resources res = getResources();

        items = res.getStringArray(R.array.books);
        prices= res.getStringArray(R.array.prices);
        description = res.getStringArray(R.array.descript);

        listViewAdaptor myView = new listViewAdaptor(this,items,prices,description);
        myList.setAdapter(myView);

    }
}
