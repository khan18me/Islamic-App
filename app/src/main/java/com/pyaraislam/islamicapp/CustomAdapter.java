package com.pyaraislam.islamicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.islamicapp.R;

public class CustomAdapter extends BaseAdapter {
    String listname[];
    int images[];
    LayoutInflater inflater;
    public CustomAdapter(Context context, String listname[], int images[])
    {
        this.listname=listname;
        this.images=images;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return listname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.list_items,viewGroup,false);
        ImageView image=view.findViewById(R.id.img_list);
        TextView txtName=view.findViewById(R.id.txt_name);

        image.setImageResource(images[position]);
        txtName.setText(listname[position]);

        return view;
    }
}
