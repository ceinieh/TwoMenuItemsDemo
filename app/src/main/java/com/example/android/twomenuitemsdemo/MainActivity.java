package com.example.android.twomenuitemsdemo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.m_capture:
            case R.id.m_capture2:
                Toast.makeText(this,"Trying to capture a picture",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m_contacts:
            case R.id.m_contacts2:
                Toast.makeText(this,"Accessing Contacts",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}
