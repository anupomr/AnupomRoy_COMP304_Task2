package com.example.anupo.anupomroy_comp304_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May18, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 1
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Send(View view)
    {
        if(view.getId()==R.id.btnId)
        {
            Intent intent=new Intent(MainActivity.this,ResultActivity.class);
            startActivity(intent);
        }
    }
}
