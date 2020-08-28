package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<word> words = new ArrayList<word>();


        words.add(new word("Black","କଳା",R.drawable.color_black));
        words.add(new word("Brown","ମାଟିଆ ",R.drawable.color_brown));
        words.add(new word("gray","ଧୂସର",R.drawable.color_gray));
        words.add(new word("Dust yellow","ବାଦାମୀ ",R.drawable.color_dusty_yellow));
        words.add(new word("Green","ସବୁଜ",R.drawable.color_green));
        words.add(new word("Yellow","ହଳଦିଆ ",R.drawable.color_mustard_yellow));
        words.add(new word("Red","ନାଲି",R.drawable.color_red));
        words.add(new word("white","ଧଳା",R.drawable.color_white));






       /* words.add(new word("Blue","ନୀଳ ",R.drawable.color_red));


        words.add(new word("Violet","ବାଇଗଣୀ",R.drawable.color_red));
        words.add(new word("Pink","ଗୋଲାପୀ",R.drawable.color_red));




       words.add(new word("Crimson","ଗାଢ଼ ଲାଲ",R.drawable.color_red));
       words.add(new word("Saffron","ଗାଢ଼ ପିତ",R.drawable.color_red));
        words.add(new word("Black","କଳା",R.drawable.color_red));

        words.add(new word("Orange","ନାରଙ୍ଗୀ ",R.drawable.color_red));
        words.add(new word("Golden","ସୁନେଲି ",R.drawable.color_red));
        words.add(new word("Silvery","ରୂପେଲି ",R.drawable.color_red));
        words.add(new word("Indigo","ଘନ ନୀଳ ",R.drawable.color_red));
        words.add(new word("Vermillion","ସିନ୍ଧୁର ବର୍ଣ୍ଣ",R.drawable.color_red));
        words.add(new word("Tawny","ପିଙ୍ଗଳ ବର୍ଣ୍ଣ  ")); */

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
