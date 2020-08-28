package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;



import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);




        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one","ଏକ", R.drawable.number_one));
        words.add(new word("two","ଦୁଇ", R.drawable.number_two));
        words.add(new word("three","ତିନି ", R.drawable.number_three));
        words.add(new word("four","ଚାରି", R.drawable.number_four));
        words.add(new word("five","ପାଞ୍ଚ", R.drawable.number_five));
        words.add(new word("six","ଛଅ", R.drawable.number_six));
        words.add(new word("seven","ସାତ", R.drawable.number_seven));
        words.add(new word("eight","ଆଠ", R.drawable.number_eight));
        words.add(new word("nine","ନଅ", R.drawable.number_nine));
        words.add(new word("ten","ଦଶ", R.drawable.number_ten));





        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
}

}
