package com.example.juantorres.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Juan Torres on 1/27/2015.
 */
public class LayoutActivity extends Activity {
    @Override
    public void onCreate (Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.linear_layout);
    }

}
