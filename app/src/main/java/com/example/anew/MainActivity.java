package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText Name;
    EditText Nationality;
    EditText Email;
    EditText Phone;
    EditText dob;
    EditText gender;


    String enteredEmail;
    String enteredNationality;
    String enteredName;
    String enteredPhone;
    String entereddob;
    String enteredGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        Name =findViewById(R.id.Name);
        Nationality = findViewById(R.id.Nationality);
        Email = findViewById(R.id.email);
        Phone = findViewById(R.id.Phone);
        dob = findViewById(R.id.dob);
        gender = findViewById(R.id.gender);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,SecondActivity.class);
                enteredName=Name.getText().toString();
                enteredNationality = Nationality.getText().toString();
                enteredEmail = Email.getText().toString();
                enteredPhone = Phone.getText().toString();
                entereddob = dob.getText().toString();
                enteredGender = gender.getText().toString();
                i.putExtra("Value",enteredName);
                i.putExtra("Value2",enteredNationality);
                i.putExtra("Value3",enteredEmail);
                i.putExtra("Value4",enteredPhone);
                i.putExtra("Value5",entereddob);
                i.putExtra("Value6",enteredGender);
                startActivity(i);
                finish();

            }
        });

    }
}