package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    String enteredName;
    String enteredNationality;
    String enteredEmail;
    String enteredPhone;
    String entereddob;
    String enteredGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.NameView);
        enteredName=getIntent().getExtras().getString("Value");
        tv.setText(enteredName);

        tv2=findViewById(R.id.NationalityView);
        enteredNationality=getIntent().getExtras().getString("Value2");
        tv2.setText(enteredNationality);

        tv3=findViewById(R.id.EmailView);
        enteredEmail=getIntent().getExtras().getString("Value3");
        tv3.setText(enteredEmail);

        tv4=findViewById(R.id.PhoneView);
        enteredPhone=getIntent().getExtras().getString("Value4");
        tv4.setText(enteredPhone);

        tv5=findViewById(R.id.dobView);
        entereddob=getIntent().getExtras().getString("Value5");
        tv5.setText(entereddob);

        tv6=findViewById(R.id.GenderView);
        enteredGender=getIntent().getExtras().getString("Value6");
        tv6.setText(enteredGender);
    }
}