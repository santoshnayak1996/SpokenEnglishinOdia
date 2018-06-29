package com.thefactbuzz.spokenenglishinodia;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.thefactbuzz.spokenenglishinodia.BeastActivity;

import java.util.Set;

public class MainActivity extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this,
                "ca-app-pub-7962001766479415~2911390601");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7962001766479415/1327680345");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        AdRequest adRequest = new AdRequest.Builder()
                .build();


        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });







    // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });


        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);


        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);



            }
        });



        TextView seasons = (TextView) findViewById(R.id.seasons);
        seasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seasonIntent = new Intent(MainActivity.this, SeasonsActivity.class);
                startActivity(seasonIntent);

            }
        });


        TextView body = (TextView) findViewById(R.id.body);
        body.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent bodyIntent = new Intent(MainActivity.this, BodyActivity.class);
                                        startActivity(bodyIntent);
                                    }
                                });




        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });


        // Find the View that shows the colors category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });



        // Find the View that shows the colors category
        TextView time = (TextView) findViewById(R.id.time);
        // Set a click listener on that View
        time.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent timeIntent = new Intent(MainActivity.this, TimeActivity.class);
                startActivity(timeIntent);
            }
        });




        TextView direction = (TextView) findViewById(R.id.direction);
        // Set a click listener on that View
        direction.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent directionIntent = new Intent(MainActivity.this, DirectionActivity.class);
                startActivity(directionIntent);
            }
        });


        TextView animals = (TextView) findViewById(R.id.animals);
        // Set a click listener on that View
        animals.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });


        TextView beast = (TextView) findViewById(R.id.beast);
        // Set a click listener on that View
        beast.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent beastIntent = new Intent(MainActivity.this, BeastActivity.class);
                startActivity(beastIntent);
            }
        });

        TextView birds = (TextView) findViewById(R.id.birds);
        // Set a click listener on that View
        birds.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent birdsIntent = new Intent(MainActivity.this, BirdsActivity.class);
                startActivity(birdsIntent);
            }
        });
    }

    //menu by santosh


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

//menu created successfully
    //below code makes  menu item to jump to other activity

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.Aboutappp){

            Intent aboutIntent = new Intent(MainActivity.this, about_me.class);
            startActivity(aboutIntent);
        }


        //rate us btn code
        if (item.getItemId()==R.id.rate){

            try{
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=com.thefactbuzz.spokenenglishinodia")));
        } catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.thefactbuzz.spokenenglishinodia")));
            }

            }


        return super.onOptionsItemSelected(item);
    }
    //menu end here


    //if you want to close dialog box by santosh

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog= builder.create();
        alertDialog.show();

    }

    //dialog box code ended
    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }



}
