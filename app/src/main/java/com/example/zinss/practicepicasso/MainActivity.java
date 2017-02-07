package com.example.zinss.practicepicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Information infor;
    private ArrayList<Product> products;
    private ListView productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infor = new Information();
        products = new ArrayList<>();
        productList = (ListView) findViewById(R.id.productList);

        for (int i = 0;i<infor.getImageURLs().length;i++){
            Product product = new Product();
            String x = infor.getImageURLs()[i];
            product.setImageURL(infor.getImageURLs()[i]);
            product.setTitle(infor.getTitles()[i]);
            product.setDescription(infor.getDescriptions()[i]);
            products.add(product);
        }
        CustumedAdapter adapter = new CustumedAdapter(getApplicationContext(),R.layout.product_list,products);
        productList.setAdapter(adapter);
    }
}
