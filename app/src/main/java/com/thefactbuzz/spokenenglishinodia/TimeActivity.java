package com.thefactbuzz.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TimeActivity extends AppCompatActivity {
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

        words.add(new word("Forenoon","ପୂର୍ବାହ୍ନ"));
        words.add(new word("Noon","ଦ୍ୱିପହର"));
        words.add(new word("Mid-day","ମଧ୍ୟାହ୍ନ "));
        words.add(new word("Morning","ସକାଳ"));
        words.add(new word("Evening","ସନ୍ଧ୍ୟା"));
        words.add(new word("Afternoon","ଅପରାହ୍ନ"));
        words.add(new word("dawn","ଉଷା"));
        words.add(new word("Today","ଆଜି"));
        words.add(new word("Tonight","ଆଜିରାତି "));
        words.add(new word("Dusk","ଗୋଧୂଳି ସମୟ"));
        words.add(new word("Yesterday","ଗତକାଲି"));
        words.add(new word("Tomorrow","ଆସନ୍ତାକାଲି"));

        words.add(new word("Eternity","ଅନନ୍ତକାଳ"));
        words.add(new word("Century","ଶତାବ୍ଦୀ"));
        words.add(new word("Decade","ଦଶନ୍ଧି "));
        words.add(new word("Millenium","ସହସ୍ରାବ୍ଦୀ"));
        words.add(new word("Evil day","ଦୁର୍ଦ୍ଦିନ"));
        words.add(new word("moonlit night","ଚାନ୍ଦିନୀ ରାତି"));
        words.add(new word("Monthly","ମାସିକ"));
        words.add(new word("Bi-Monthly","ଦ୍ଵୀମାସିକ"));
        words.add(new word("Quarterly","ତ୍ରୈମାସିକ "));
        words.add(new word("half-yearly","ସାନ୍ମାସିକ"));
        words.add(new word("Yearly","ବାର୍ଷିକ"));
        words.add(new word("Fortnight","ପକ୍ଷ"));


        words.add(new word("Leap Year","ଅଧିବର୍ଷ"));
        words.add(new word("Intercalary month","ମଳମାସ"));
        words.add(new word("Dark fortnight","କୃଷ୍ଣ ପକ୍ଷ "));
        words.add(new word("Bright fortnight","ଅମାବାସ୍ୟା"));
        words.add(new word("Full moon","ପୂର୍ଣ୍ଣିମା"));
        words.add(new word("in broad day","ଦିନ ଦ୍ବିପହରେ"));
        words.add(new word("by day","ଦିନବେଳେ"));
        words.add(new word("Equinox","ସମଦିବାରାତ୍ର"));






        WordAdapter adapter = new WordAdapter(this, words, R.color.category_time);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}
