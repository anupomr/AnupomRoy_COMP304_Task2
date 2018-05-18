package com.example.anupo.anupomroy_comp304_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May18, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 1
 * */
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        //declaring string

        String displayName =getString(R.string.name);
        String displayQualification =getString(R.string.qualification);
        String message=getString(R.string.message);
        String displayJob =getString(R.string.job);
        String displaySecializedFld =getString(R.string.specilized);

        //seting the content of textview

        TextView textView=(TextView)findViewById(R.id.txtViewDispaly);
        textView.setText(message+"\n"+"\n Name: "+displayName+"\n Qualification: "+displayQualification+
                                        "\n Dream Job: "+displayJob+
                                        "\n Specialized Field: "+displaySecializedFld);
    }
}
