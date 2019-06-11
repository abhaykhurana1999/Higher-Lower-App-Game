package com.example.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    int RandomNumber;
    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }

    public void Onclick(View view)
    {

        EditText no=(EditText)findViewById(R.id.Number);
        int B=Integer.parseInt(no.getText().toString());
        if(B==RandomNumber)
        {
            makeToast("You got it Right Try Again!");
            Random rand=new Random();
            RandomNumber=rand.nextInt(11);

        }
        else if(B>RandomNumber)
        {
            Toast.makeText(MainActivity.this,"Actual no is lower!",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Actual no is Higher!",Toast.LENGTH_SHORT).show();
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        RandomNumber=rand.nextInt(11);
    }
}
