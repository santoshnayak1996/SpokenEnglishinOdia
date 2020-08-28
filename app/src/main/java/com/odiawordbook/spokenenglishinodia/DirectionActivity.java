package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class DirectionActivity extends AppCompatActivity {
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


        words.add(new word("East","ପୂର୍ବ"));
        words.add(new word("West","ପଶ୍ଚିମ"));
        words.add(new word("North","ଉତ୍ତର "));
        words.add(new word("South","ଦକ୍ଷିଣ"));
        words.add(new word("South-East","ଆଗ୍ନେୟ"));
        words.add(new word("North-east","ଐଶାନ୍ୟ"));
        words.add(new word("North-west","ବାୟବ"));
        words.add(new word("South-West","ନୈରତ"));
        words.add(new word("Upward","ଉର୍ଦ୍ଧ"));
        words.add(new word("Beneath"," ଅଧଃ"));






        WordAdapter adapter = new WordAdapter(this, words, R.color.category_direction);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}
