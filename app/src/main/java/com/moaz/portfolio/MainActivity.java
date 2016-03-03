package com.moaz.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSpotifyStreamer, btnScoreApp, btnLibraryApp, btnBuildItBigger, btnXYZReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer);
        btnScoreApp = (Button) findViewById(R.id.btn_scores_app);
        btnLibraryApp = (Button) findViewById(R.id.btn_library_app);
        btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        btnXYZReader = (Button) findViewById(R.id.btn_xyz_reader);
        btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoreApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "This button will lunch my " + ((Button) view).getText() + "!", Toast.LENGTH_SHORT).show();
    }
}
