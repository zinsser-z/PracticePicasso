package com.example.zinss.practicepicasso;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustumedAdapter extends ArrayAdapter {
    private int resource;
    private ArrayList<Product> objects;
    private Context context;
    public CustumedAdapter(Context context, int resource, ArrayList<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            //如果为空需要填充，否则会报错
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.product_list,null,true);
        }
        Product product = (Product) getItem(position);

        ImageView productImg = (ImageView) convertView.findViewById(R.id.productImg);
        TextView productTitle = (TextView) convertView.findViewById(R.id.productTitle);
        TextView productDescription = (TextView) convertView.findViewById(R.id.productDescription);
        Picasso.with(context).load(product.getImageURL()).into(productImg);
        productTitle.setText(product.getTitle());
        productDescription.setText(product.getDescription());

        return convertView;
    }
}
