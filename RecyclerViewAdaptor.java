package com.example.idealtextbook;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.MyViewHolder>
{
    private Context mContext;
    private List<Book> mData;

    public RecyclerViewAdaptor(Context mContext, List<Book> mData)
    {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view;
        LayoutInflater mInflator = LayoutInflater.from(mContext);
        view = mInflator.inflate(R.layout.cardview_item_book,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdaptor.MyViewHolder myViewHolder, final int i)
    {
        myViewHolder.tv_book_title.setText(mData.get(i).getTitle());
        myViewHolder.img_book_thumbnail.setImageResource(mData.get(i).getThumbnail());

        myViewHolder.cardView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent popUp = new Intent(mContext,Book_Popup.class);
                popUp.putExtra("Title",mData.get(i).getTitle());
                popUp.putExtra("Description",mData.get(i).getDescription());
                popUp.putExtra("Thumbnail",mData.get(i).getThumbnail());
                mContext.startActivity(popUp);

            }

        });

        //Set click listener
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;


        public MyViewHolder(View itemView)
        {
            super(itemView);

            tv_book_title = (TextView) itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.book_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
