package com.meditrack.sos;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static Context context;

    DisplayMetrics displaymetrics;
    public static  int displayWidth = 0;
    public static  int displayHeight = 0;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Tab1Fragment tab1Fragment = new Tab1Fragment();
                    getFragmentManager().beginTransaction().replace(R.id.main_fragment,tab1Fragment,tab1Fragment.getTag()).commit();
                    return true;

                case R.id.navigation_dashboard:
                    Tab2Fragment tab2Fragment = new Tab2Fragment();
                    getFragmentManager().beginTransaction().replace(R.id.main_fragment,tab2Fragment,tab2Fragment.getTag()).commit();
                    return true;

                case R.id.navigation_notifications:
                    Tab3Fragment tab3Fragment = new Tab3Fragment();
                    getFragmentManager().beginTransaction().replace(R.id.main_fragment,tab3Fragment,tab3Fragment.getTag()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getBaseContext();
        displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        displayWidth = displaymetrics.widthPixels;
        displayHeight = displaymetrics.heightPixels;

        Tab1Fragment tab1Fragment = new Tab1Fragment();
        getFragmentManager().beginTransaction().replace(R.id.main_fragment, tab1Fragment, tab1Fragment.getTag()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
}





