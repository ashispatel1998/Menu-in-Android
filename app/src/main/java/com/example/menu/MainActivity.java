package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Show menu item
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Menu item clickable

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();

        switch (id){
            case R.id.id1:
                Toast.makeText(getApplicationContext(),"Item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.id2:
                Toast.makeText(getApplicationContext(),"Item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.id3:
                Toast.makeText(getApplicationContext(),"Item3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.id4:
                Toast.makeText(getApplicationContext(),"Item4",Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);

    }

}