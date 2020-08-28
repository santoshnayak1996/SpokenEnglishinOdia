package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class SpicesActivity extends AppCompatActivity {
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



        words.add(new word("Spices","ମସଲା"));


                words.add(new word("Ginger","ଅଦା"));
        words.add(new word("Big cardamom"," ଅଳେଇଚ"));
        words.add(new word("Psyllium","ଇସ୍ ବଗୁଲି"));
        words.add(new word("Cubebs","କବାବ୍ ଚିନି"));
        words.add(new word("Black cumin"," କଳା ଜିରା"));
        words.add(new word("Musk"," କସ୍ତୁରୀ"));
        words.add(new word("Camphor","କର୍ପୁର"));
        words.add(new word("Catechu","ଖଇର"));
        words.add(new word("Linseed","ଖସା "));
        words.add(new word("Sindapsus","ଗଜ ପିପଳି"));
        words.add(new word("Hot spices","ଗରମ୍ ମସଲା"));
        words.add(new word("Cardamom"," ଗୁଜୁରାତି "));
        words.add(new word("Black pepper"," ଗୋଲ୍ ମରିଚ"));
        words.add(new word("Betelnut","ଗୁଆ "));
        words.add(new word("Mace","  ଜାଇତ୍ରୀ"));
        words.add(new word("Nutmeg","ଯାଇ ଫଳ"));
        words.add(new word("Saffron","ଯାଫ୍ରାନ୍"));
        words.add(new word("Cumin seed"," ଜିରା "));
        words.add(new word("Caraway seed","ଜୁଆଣି "));
        words.add(new word("Cinnamon"," ଡ଼ା ଲ ଚିନି "));
        words.add(new word("Curry stuff"," ତରକାରୀ ମସଲା"));
        words.add(new word("Toabcco","ତମାଖୁ"));
        words.add(new word("Coriander","ଧନିଆ"));
        words.add(new word(" Tobacco leaf","ଧୂଆଁ ପତ୍ର "));
        words.add(new word("Betel spices","ପାନ ମସଲା"));
        words.add(new word("Onion","ପିଆଜ"));
        words.add(new word("Long pepper","ପିପ୍ପଳୀ"));
        words.add(new word("Poppy seed"," ପୋସ୍ତକ ଦାନା "));
        words.add(new word("Condiment","ବଟା ମସଲା "));
        words.add(new word(" Beleric myrobalm","ବାହାଡ଼ା "));
        words.add(new word("Mustard past","ବେସର"));
        words.add(new word(" Fenugreek","ମେଥି "));
        words.add(new word("Liquorice"," ଯଷ୍ଟି ମଧୂ "));
        words.add(new word("Garlic","ରସୁଣ"));
        words.add(new word("Rape seed","ରାଇ ସୋରିଷ"));
        words.add(new word("Cloves"," ଲବଙ୍ଗ "));
        words.add(new word("Chili"," ଲଙ୍କା ମରିଚ"));
        words.add(new word("Dried ginger"," ସୁଣ୍ଠି"));
        words.add(new word("Turmeric","ହଳଦୀ"));
        words.add(new word(" Asafoetida"," ହେଙ୍ଗୁ"));



        words.add(new word("Mustard seed","ସୋରିଷ"));
        words.add(new word("Anseed","ପାନ ମଧୁରି"));



        words.add(new word("Yellow myrobalan","ହରିଡ଼ା"));
        words.add(new word("Salpetre","ଶୋଡ। "));
        words.add(new word("Hemp","ଭାଙ୍ଗ"));
        words.add(new word("Resin","ଝୁଣା"));
        words.add(new word("Sulphur","ଗନ୍ଧକ"));
        words.add(new word("Oil","ତେଲ"));
        words.add(new word("Kerosine","କିରୋସିନି"));
        words.add(new word("Mustard oil","ସୋରିଷ ତେଲ"));
        words.add(new word("Coconut oil","ନଡ଼ିଆ ତେଲ"));
        words.add(new word("Groundnut Oil","ବାଦାମ ତେଲ"));
        words.add(new word("Sesame oil","ରାଶି ତେଲ"));
        words.add(new word("Castor oil"," ଜଡ଼ା ତେଲ"));
        words.add(new word("Perfumed oil","ବାସନା ତେଲ"));
        words.add(new word("Cinamon oil","ଡାଲଚିନି ତେଲ"));
        words.add(new word(" Sunflower oil","ସୂର୍ଯ୍ୟମୁଖୀ ତେଲ"));
        words.add(new word("Trupentine oil","ତାରପିନ୍ ତେଲ"));
        words.add(new word(" Wood oil","କାଠ ତେଲ"));
        words.add(new word(" Sesame oil","ଖସା ତେଲ"));
        words.add(new word("Sandal oil","ଚନ୍ଦନ ତେଲ"));
        words.add(new word(" Lemon oil"," ଲେମ୍ବୁ ତେଲ"));




        words.add(new word(" Petrol","ପେଟ୍ରୋଲ"));
        words.add(new word("Diesel","ଡିଜେଲ"));
        words.add(new word("Otto,scent","ଅତର"));
        words.add(new word("Palm oil","ତାଳ ତେଲ"));
        words.add(new word("Olive oil","ଜଳ ପାଇ ତେଲ"));










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
