package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class FruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();











        words.add(new word("Fruit","ଫଳ"));
        words.add(new word("Green fruit","କଞ୍ଚା ଆମ୍ବ"));
        words.add(new word("Grape","ଅଙ୍ଗୁର"));
        words.add(new word("Papaya","ଅମୃତଭଣ୍ଡା"));
        words.add(new word("Mango","ଆମ୍ବ"));
        words.add(new word("Apple","ଅାତ"));
        words.add(new word("Walnut","ଆଖରୁ"));
        words.add(new word(" Hogplum","ଆମ୍ବଡା"));
        words.add(new word("Sugarcane","ଆଖୁ"));
        words.add(new word("Orange","କମଳା"));
        words.add(new word("Wood apple","କଇଁଥ"));
        words.add(new word("Plantain","କଦଳୀ"));
        words.add(new word("Banana","ପାଚିଲା କଦଳୀ"));
        words.add(new word("Carambala","କରମଙ୍ଗା"));
        words.add(new word("Cucumber","କାକୁଡି"));
        words.add(new word("Cherkin","କଷି କାକୁଡି"));
        words.add(new word("Raisin","କିସମିସ"));
        words.add(new word("Plum","କୋଳି"));
        words.add(new word("Orange","କମଳା ଲେମ୍ବୁ"));
        words.add(new word("Pumpkin","କଖାରୁ"));
        words.add(new word("Sweet potato","କନ୍ଦ ମୂଳ"));
        words.add(new word("Lemon","କାଗେଜି ଲେମ୍ବୁ"));
        words.add(new word("Bitter gourd","କଲରା"));
        words.add(new word("Date","ଖଜୁରୀ"));
        words.add(new word("Spinage","ଖଡା"));
        words.add(new word("Musk melon","ତରଭୁଜ"));
        words.add(new word("Carrot","ଗାଜର "));
        words.add(new word("Betelnut","ଗୁଆ"));
        words.add(new word("Roseberry","ଗୋଲାପ ଜାମୁ"));
        words.add(new word("Potato","ଗୋଲ୍ ଆଳୁ "));
        words.add(new word("Olive","ଜଳପାଇ"));
        words.add(new word("Berry","ଜାମୁ"));
        words.add(new word("Black berry","ଜାମୁ କୋଳି"));
        words.add(new word("Star apple","ଜାମୁ ରୋଳ"));
        words.add(new word("Runner bean","ଝୁଡୁଙ୍ଗ"));
        words.add(new word("Pomegranatet","ଡାଳିମ୍ବ"));
        words.add(new word("Palm fruit","ତାଳ"));
        words.add(new word("Tamarin","ତରଭୁଜ"));
        words.add(new word("Yam","ଦେଶୀ ଆଳୁ"));
        words.add(new word("Coriander leaf","ଧନିଆ ପତ୍ର"));
        words.add(new word("Tobacco","ଧୂଆଁ ପତ୍ର"));
        words.add(new word("Clearing nut","ନିର୍ମଳା ଫଳ"));
        words.add(new word("Cocount","ନଡ଼ିଆ "));
        words.add(new word("Jackfruit","ପଣସ"));
        words.add(new word("Green coconut","ପଇଡ଼"));
        words.add(new word("Guava","ପିଜୁଳି"));
        words.add(new word("Peach","ପିଚ୍ ଫଳ"));
        words.add(new word("Pistachio","ପେସ୍ତ।"));
        words.add(new word("Melon","ଫୁଟି"));
        words.add(new word("Betel","ପାନ"));
        words.add(new word("Ash-ground","ପାଣି କଖାରୁ"));
        words.add(new word("Onion","ପିଆଜ"));
        words.add(new word("Melon","ଫୁଟି କାକୁଡି"));
        words.add(new word("Mint leaf","ପୋଦିନା ପତ୍ର"));
        words.add(new word("Parbal","ପୋଟଳ"));
        words.add(new word("Jujube","ବରକୋଳି"));
        words.add(new word("Almond","ବାଦାମ"));
        words.add(new word("Shaddock","ବାତାପି "));
        words.add(new word("Brinjal","ବାଇଗଣ"));
        words.add(new word("Tomato","ବିଲାତି ବାଇଗଣ"));
        words.add(new word("Lady's finger","ଭେଣ୍ଡି"));
        words.add(new word("Pea","ମଟର"));
        words.add(new word("Radish","ମୂଳା"));
        words.add(new word("Garlic","ରସୁଣ"));
        words.add(new word("Plantain flower","ଭଣ୍ଡା"));
        words.add(new word("Amaranth tender","ଲେଉଟିଆ"));
        words.add(new word("Chilli","ଲଙ୍କା ମରିଚ"));
        words.add(new word("Gourd","ଲାଉ"));
        words.add(new word("Lichi","ଲିଚୁ"));
        words.add(new word("Lemon","ଲେମ୍ବୁ"));
        words.add(new word("Pineapple","ସପୁରୀ"));
        words.add(new word("Turnip","ସଲଗାମ୍"));
        words.add(new word("Greens","ଶାଗ"));
        words.add(new word("Bean","ବିମ୍"));
        words.add(new word("Fibre","ଆସୁଂ"));
        words.add(new word("Husk","ଚକ୍ଷୁ"));
        words.add(new word("Seed","ମଞ୍ଜି "));
        words.add(new word("Mushroom","ଛତୁ"));
        words.add(new word("Ridgeal-ground","ଜହ୍ନି"));
        words.add(new word("Vegetable","ପନି ପରିବା"));
        words.add(new word("Hondappa","ଓଉ"));
        words.add(new word("Barley","ଯଅ"));
        words.add(new word("Arum","ସାରୁ"));
        words.add(new word("Cabbage","ବନ୍ଧା କୋବି"));
        words.add(new word("Cauliflower","ଫୁଲ କୋବି"));
        words.add(new word("Turnip","ଓଲ କୋବି"));
        words.add(new word("Snake ground","ଛଚିନ୍ଦ୍ର"));
        words.add(new word("Ripe fruit","ପାଚିଲା ଫଳ"));
        words.add(new word("Fresh fruit","ତଟକା ଫଳ"));
        words.add(new word("Cashew nut","କାଜୁ"));




        WordAdapter adapter = new WordAdapter(this, words, R.color.category_fruits);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
