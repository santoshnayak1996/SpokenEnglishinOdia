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

public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();


        words.add(new word("Grunt","ଓଟ,ଘୁଷୁରୀ ,ବିରହ ଶବ୍ଦ"));
        words.add(new word("Laugh","କଲରାପତରିଆ ବାଘ ର ଡାକ "));
        words.add(new word("Bark","କୁକୁର ର ଭୁକା "));
        words.add(new word("Yelp","ବିଲୁଆ ର ହୁକେହୋ"));
        words.add(new word("Bray","ଗଧ ର ଭେଁ ଭେଁ "));
        words.add(new word("Howl","ଗଧିଆ ର ଖେଙ୍କର୍"));
        words.add(new word("Low","ଗାଈ ର ହମ୍ବଳିବା"));
        words.add(new word("Grunt","ଘୋଡା ର ଘାଁ ଘଂ ଶବ୍ଦ"));
        words.add(new word("Bleat","ଛେଳି ର ମେଁ ମେଁ"));
        words.add(new word("Squeak","ଠେକୁଆ ମୂଷା ର ଚେଁ ଚେଁ"));
        words.add(new word("Howl","ବିଲୁଆ ର ରଡ଼ି"));
        words.add(new word("Mew","ବିରାଡ଼ି ର ମ୍ୟାଉଁ"));
        words.add(new word("Purr","ବିଲେଇ ର ଘୁଡୁ ଘୁଡୂ ଶବ୍ଦ"));
        words.add(new word("Gibber","ବଣ ମଣିଷ ର ଡାକ"));
        words.add(new word("Growl","ବାଘ,ଭାଲୁ ର ଗର୍ଜନ"));
        words.add(new word("Bellow","ଷଣ୍ଢ ରଡ଼ି"));
        words.add(new word("Croak","ବେଙ୍ଗ ର କେଁ କଟର"));
        words.add(new word("Chatter","ମାଙ୍କଡ ର ଖେଁ ଖେଂ"));
        words.add(new word("Bell","ମୃଗ ର ଡାକ"));
        words.add(new word("Squeak","ମୂଷା ର ଚିଁ ଚିଂ"));
        words.add(new word("Roar","ସିଂହ ର ଗର୍ଜନ"));
        words.add(new word("Bell","ହରିଣ ବୋବାଇବ"));
        words.add(new word("Scream","ଇଗଲ, ଛଞ୍ଚାଳ ଚିନଂ ଚି"));
        words.add(new word("Whistle","ଚିଲ ର ଚୀଂ ଚିଙ୍ଗ"));
        words.add(new word("Caw","କାଉ ର କା କା"));
        words.add(new word("Sing,coo","କୋଇଲି ର କୁହୁ ତାନ"));
        words.add(new word("Cackle","କୁକ୍କୁଡି ର ଡାକ "));
        words.add(new word("Warble","ଗୋବରା ଡାକ"));
        words.add(new word("Chirp","ଘରଚଟିଆ ପକ୍ଷୀ ର ରାବ "));
        words.add(new word("Twitter","ଚାତକ ର ଡାକ "));
        words.add(new word("Croak","ଡାମାର କାଉ ର ଶବ୍ଦ"));
        words.add(new word("Quack","ପାତି ହଂସ ବୋବାଇବା "));
        words.add(new word("Coo","ପାରା/କପୋତ ର ଡାକ "));
        words.add(new word("Hoot","ପେଚା ର ଡାକ "));
        words.add(new word("Frawning","ସାପ ର ଫଁ ଫଁ "));
        words.add(new word("Low","ମଇଁଷି ର ଡାକ"));
        words.add(new word("Grunt","ଓଟ ର ଡାକ"));
        words.add(new word("Growl","ଭାଲୁ ର ଗେଁ ଗେଂ"));
        words.add(new word("Trumpet","ହାତୀ ଗର୍ଜନ"));
        words.add(new word("Hum","ମହୁମାଛି ର ଗୁଣ ଗୁଣୁ"));
        words.add(new word("Scream","ମୟୂର କେକା"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_sound);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
