package com.example.sheyla.wellnessapp_cosc341;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResourceInfo extends AppCompatActivity {
    TextView title;
    TextView text;
    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String setTitle = bundle.getString("resourceName");
        String setDescr = bundle.getString("description");
        //display the score
        title = (TextView) findViewById(R.id.textView5);
        text = (TextView) findViewById(R.id.textView4);
        call = (Button) findViewById(R.id.button7);
        title.setText(setTitle);
        text.setText(setDescr);

    }

    public void call(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Calling";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
