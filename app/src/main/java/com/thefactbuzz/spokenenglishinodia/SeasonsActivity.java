package com.thefactbuzz.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class SeasonsActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
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

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Summer","ଗ୍ରୀଷ୍ମ"));
        words.add(new word("Rainy","ବର୍ଷା"));
        words.add(new word("Autumn","ଶରତ "));
        words.add(new word("Dewy","ହେମନ୍ତ"));
        words.add(new word("Winter","ଶୀତ"));
        words.add(new word("Spring","ବସନ୍ତ"));





        WordAdapter adapter = new WordAdapter(this, words, R.color.category_seasons);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}
