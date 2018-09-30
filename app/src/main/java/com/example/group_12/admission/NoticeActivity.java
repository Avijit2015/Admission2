package com.example.group_12.admission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoticeActivity extends AppCompatActivity {

    Button btnMedicalCollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        btnMedicalCollege=findViewById(R.id.medical_college);

        btnMedicalCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NoticeActivity.this,MedicalActivity.class);
                startActivity(intent);
                ///finish();
            }
        });
    }
}
