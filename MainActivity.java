package com.example.fondn.listviewcustomwithbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;

    String[] nameArray= {"Sagor","khan","sabuj","Dhaka","Bangladesh"};
    int[] imageArray = {R.drawable.stumbleupon,R.drawable.tumblr,R.drawable.twitter,R.drawable.vine,R.drawable.whatspp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listID);
        customAdapter = new CustomAdapter(getApplicationContext(),nameArray,imageArray);
        listView.setAdapter(customAdapter);
    }
}
