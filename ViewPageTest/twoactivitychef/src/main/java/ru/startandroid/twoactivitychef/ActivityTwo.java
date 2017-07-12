package ru.startandroid.twoactivitychef;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private TextView textView1;
    private TextView textView3;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3 = (TextView) findViewById(R.id.text3);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String familyName = intent.getStringExtra("time");
        String city = intent.getStringExtra("cooking");

        textView1.setText(name);
        textView2.setText(familyName);
        textView3.setText(city);
    }
}
