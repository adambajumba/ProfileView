package com.ericgithinji.profilesview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_profile);
        ImageView imageView = (ImageView) findViewById(R.id.full_bleed);
        TextView phoneNumberView = (TextView) findViewById(R.id.phone);
        TextView nameView = (TextView) findViewById(R.id.name);
        TextView bioView = (TextView) findViewById(R.id.bio);
        // Get intent

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("name");
        String phone = extras.getString("phone");
        String bio = extras.getString("bio");
//        Uri myUri = Uri.parse(extras.getString("url"));
        Log.w("phone is", phone);
        phoneNumberView.setText(phone);
        nameView.setText(name);
        bioView.setText(bio);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

}
