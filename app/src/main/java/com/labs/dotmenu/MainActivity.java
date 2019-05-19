package com.labs.dotmenu;

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

    // to get the menu.xml in main activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    // assign action to menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch(id)
        {
            case R.id.setings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;


            case R.id.share:
                 Toast.makeText(this,"Share", Toast.LENGTH_SHORT).show();
                 break;

            case R.id.feedback:
                Toast.makeText(this,"Feedback", Toast.LENGTH_SHORT).show();
                break;

        }

        return true;
    }
}
