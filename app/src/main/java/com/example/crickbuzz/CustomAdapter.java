package com.example.crickbuzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    OtherActivity otherActivity;
    String[] name;
    String[] num;
    String[] born;
    String[] place;
    String[] nc;
    String[] batting;
    String[] bolling;
    String[] role;
    int[] imgArr;

    public CustomAdapter(OtherActivity otherActivity, String[] name, String[] num, int[] imgArr, String[] born, String[] place, String[] nc, String[] role, String[] batting, String[] bolling) {
        this.otherActivity = otherActivity;
        this.name = name;
        this.num = num;
        this.imgArr = imgArr;
        this.born = this.born;
        this.nc = this.nc;
        this.role = this.role;
        this.batting = this.batting;
        this.bolling = this.bolling;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(otherActivity).inflate(R.layout.activity_other_item,parent,false);
        ImageView imageView=view.findViewById(R.id.activity_other_item_img);
        TextView txtName=view.findViewById(R.id.activity_other_item_name);
        TextView txtNum=view.findViewById(R.id.activity_other_item_num);


        imageView.setImageResource(imgArr[position]);
        txtName.setText(""+name[position]);
        txtNum.setText(""+num[position]);


        return view;
    }
}