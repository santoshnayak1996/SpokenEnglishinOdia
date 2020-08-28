package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class ReptilesActivity extends AppCompatActivity {
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








        words.add(new word("Reptiles","ପୂର୍ବ"));
        words.add(new word("Python","ଅଜଗର"));
        words.add(new word("King Kobra"," ଅହିରାଜ"));
        words.add(new word("Garden lizard","ଏଣ୍ଡୁଅ"));
        words.add(new word("Tortoise","କଇଁଛ"));
        words.add(new word("Roach","କଳା ବାଇଁଶି"));
        words.add(new word("Scorpion","କଙ୍କଡ଼ା ବିଛା"));
        words.add(new word("Climbing fish","କଉ ମାଛ"));
        words.add(new word("Minnow","କେରଣ୍ଡୀ"));
        words.add(new word("Crab"," କଙ୍କଡ଼ା"));
        words.add(new word("Turtle","କୁରୁମ"));
        words.add(new word("Crocodile","କୁମ୍ଭୀର"));
        words.add(new word("Grass snake"," କଣ୍ଡନାଳ ସାପ"));
        words.add(new word("Snail","ଗେଣ୍ଡା"));
        words.add(new word("Guane","ଗୋଧି"));
        words.add(new word("Cobra","ଗୋଖର"));
        words.add(new word("Gudgeon","ଗଡ଼ିଶା"));
        words.add(new word("Bullhead fish","ଗାଗର"));
        words.add(new word("Painted snake","ଚିତି ସାପ "));
        words.add(new word("Flat fish","ଚିତ୍ତଳ ମାଛ"));
        words.add(new word("Gilt head"," ଚେଙ୍ଗ ମାଛ"));
        words.add(new word("Silver fish","ଚାନ୍ଦି ମାଛ"));
        words.add(new word("Shrimp"," ଚିଙ୍ଗୁଡ଼ି"));
        words.add(new word("Leech","ଯୋକ"));
        words.add(new word("Earth worm","ଜିଆ"));
        words.add(new word("Winged ant","ଝଡିପୋକ"));
        words.add(new word("Lizard","ଝିଟିପିଟି"));
        words.add(new word("Hybrid cobra/ rat snake","ଢମଣା"));
        words.add(new word("Cobra-de-capello","ତମ୍ପା/ନାଗ"));
        words.add(new word("Water snake"," ଧଣ୍ଡ"));
        words.add(new word("Sand viper","ଧୂଳିଆ ନାଗ"));
        words.add(new word("Rock snake","ପାହାଡିଆ ସାପ"));
        words.add(new word("Centipede","ବିଛା"));




















        words.add(new word("Rusells viper","ବୋଡା ସାପ "));
        words.add(new word("Pangolin"," ବଜ୍ର କପ୍ତା"));
        words.add(new word("Venomous snake"," ବିଷାକ୍ତ ସାପ"));
        words.add(new word("Frog","ବେଙ୍ଗ"));
        words.add(new word("Marsh frog"," ବ୍ରାହ୍ମଣୀ ବେଙ୍ଗ"));
        words.add(new word("Tadpole","ବେଙ୍ଗ ଫୁଲା"));
        words.add(new word("Boa"," ବୋଡା"));
        words.add(new word("Printed snake","ରଣା"));


















        words.add(new word("Arboreal adder","ଲାଉଦଙ୍କିଆ ସାପ"));
        words.add(new word("Horned viper","ସୃଙ୍ଗୀ ନାଗ "));
        words.add(new word("Coral"," ଶଙ୍ଖ ମୁଠିଆ"));
        words.add(new word("Slough"," ସାପ ର କାତି"));
        words.add(new word("Hood","ଫଣା "));
        words.add(new word("Snake hill","ହୁଙ୍କା"));
        words.add(new word("Fang","ବିଷ ଦାନ୍ତ"));
        words.add(new word("Sting","ଦଂଶନ"));
        words.add(new word("Black ant"," ଜନ୍ଦା "));
        words.add(new word("Locust","ପଙ୍ଗ ପାଳ"));
        words.add(new word("Mango fly","ପୋତକ" ));


























        words.add(new word("Slug"," ଶାଗ ପୋକ  "));



        words.add(new word("Spider web","ବୁଢିଆଣୀ ଜାଲ"));
        words.add(new word("Whale","ବାଳିଆ "));
        words.add(new word("Hippopotamus","ଜଳ ହସ୍ତୀ"));
        words.add(new word("Fry","ଜାଆଁଳ"));


        words.add(new word("Bilfish"," ବମି"));
        words.add(new word("Grig","  ଦଣ୍ଡିକିରି ମାଛ "));
        words.add(new word("Hisa fish","ଭାକୁର ମାଛ  "));


        words.add(new word("Gill","ମାଛ ର ଗାଲୀସି"));
        words.add(new word("Fin"," ମାଛ ଡେଣା"));
        words.add(new word("Roe"," ମାଛ ମଞ୍ଜି"));
        words.add(new word("Shark"," ମଗର "));
        words.add(new word("Sea-water-fish"," ଲୁଣି ମାଛ"));
        words.add(new word(" Dried fish"," ଶୁଖୁଆ"));













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
