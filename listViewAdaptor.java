package com.example.idealtextbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class listViewAdaptor extends BaseAdapter
{
    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] description;

    public listViewAdaptor(Context c, String[] i, String[] p, String[] d)
    {
        items = i;
        prices = p;
        description = d;
        mInflater =(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = mInflater.inflate(R.layout.activity_cart_view,null);
        TextView nameTextView = (TextView) v.findViewById(R.id.name_id);
        TextView descView = (TextView) v.findViewById(R.id.descr_id);
        TextView priceView = (TextView) v.findViewById(R.id.price_id);

        String name = items[position];
        String desc = description[position];
        String cost = prices[position];

        nameTextView.setText(name);
        descView.setText(desc);
        priceView.setText(cost);

        return v;
    }
}
