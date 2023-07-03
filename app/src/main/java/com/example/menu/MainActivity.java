package com.example.menu;

import static com.example.menu.R.id.item1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item 1 has been selected",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.item2:
                Toast.makeText(getApplicationContext(),"Item 2 has been selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Item 3 has been selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                Toast.makeText(getApplicationContext(),"INVALID!!!!!!!!!!!!!!",Toast.LENGTH_LONG).show();
                return false;

        }
    }
}