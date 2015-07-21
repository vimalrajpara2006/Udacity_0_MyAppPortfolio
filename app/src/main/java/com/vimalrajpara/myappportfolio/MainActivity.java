package com.vimalrajpara.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnBuildItBigger).setOnClickListener(this);
        findViewById(R.id.btnCapstoneMyOwnApp).setOnClickListener(this);
        findViewById(R.id.btnLibraryApp).setOnClickListener(this);
        findViewById(R.id.btnScoresApp).setOnClickListener(this);
        findViewById(R.id.btnXyzReader).setOnClickListener(this);
        findViewById(R.id.btnSpotifyStreamer).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, getString(R.string.msgMainAppBtnClick, ((Button) view).getText()), Toast.LENGTH_SHORT).show();
    }
}
