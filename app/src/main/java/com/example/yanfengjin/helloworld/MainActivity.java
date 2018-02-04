package com.example.yanfengjin.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    DatabaseReference test1;
    String message1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test1 = FirebaseDatabase.getInstance().getReference("test1").child("Hello World");
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message1 = test1.getKey();
                Log.i("MyApp", message1);
                Toast.makeText(getApplicationContext(),message1, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
