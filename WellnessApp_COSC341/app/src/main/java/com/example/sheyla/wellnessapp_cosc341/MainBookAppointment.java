package com.example.sheyla.wellnessapp_cosc341;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainBookAppointment extends AppCompatActivity {

    private TextView mTextMessage;
    Intent displayInfo;
    Intent bookAppointment;
    Intent home;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    //calendar startActivity goes here
                    return true;
                case R.id.navigation_notifications:
                    startActivity(bookAppointment);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_book_appointment);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        displayInfo =  new Intent(this, ResourceInfo.class);
        bookAppointment =  new Intent(this, MainBookAppointment.class);
        home =  new Intent(this, MainMenu.class);
    }

    public void displayInfoHW(View view) {
        Bundle bundle = new Bundle();
        String resource = "Health and Wellness";
        String information = "We promote student body, mind and spirit wellness within a healthy and sustainable campus environment. Have a question? ";
        bundle.putString("resourceName", resource);
        bundle.putString("description", information);
        displayInfo.putExtras(bundle);
        startActivity(displayInfo);
    }

    public void displayInfoWR(View view) {
        Bundle bundle = new Bundle();
        String resource = "Women's Resource Centre";
        String information = "All services offered by the WRC are paraprofessional, however the WRC provides a safe place on campus for women to come to find a supportive environment and connections to other resources on and off campus.Have a question? ";
        bundle.putString("resourceName", resource);
        bundle.putString("description", information);
        displayInfo.putExtras(bundle);
        startActivity(displayInfo);
    }

    public void displayInfoDRC(View view) {
        Bundle bundle = new Bundle();
        String resource = "Disability Resource Centre";
        String information = "The purpose of an accommodation is to allow students to overcome disability-related challenges that impede their academic success. Have a question? ";
        bundle.putString("resourceName", resource);
        bundle.putString("description", information);
        displayInfo.putExtras(bundle);
        startActivity(displayInfo);
    }
}
