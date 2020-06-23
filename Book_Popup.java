package com.example.idealtextbook;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Popup extends AppCompatActivity {

    private TextView tvTitle,tvDescription;
    private ImageView picture;
    private  Button btnbuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book__popup);

        tvTitle = (TextView) findViewById(R.id.txtTitle);
        tvDescription = (TextView) findViewById(R.id.txtdesc);
        btnbuy = (Button) findViewById(R.id.btnBuY_id);
        picture = (ImageView) findViewById(R.id.bookthumbnail);


        //Get the type of book being viewed
        Intent intent =  getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        //Match things
        tvTitle.setText(Title);
        tvDescription.setText(Description);
        picture.setImageResource(image);

        //Use Button
        btnbuy.setClickable(true);
        btnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent startIntent = new Intent(getApplicationContext(),CartView.class);
                startActivity(startIntent);


            }
        });


    }
}
