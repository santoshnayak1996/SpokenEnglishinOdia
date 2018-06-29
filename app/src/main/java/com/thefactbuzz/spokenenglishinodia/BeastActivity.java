package com.thefactbuzz.spokenenglishinodia;

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

public class BeastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();


        words.add(new word("Cow","ଗାଈ"));
        words.add(new word("Bull/Bullock","ବଳଦ "));
        words.add(new word("Ox/Bull","ଷଣ୍ଢ "));
        words.add(new word("Tiger","ବାଘ"));
        words.add(new word("Tigress","ବାଘୁଣୀ "));
        words.add(new word("Caamel","ଓଟ"));
        words.add(new word("Otter","ଓଧ"));
        words.add(new word("Reindeer","ବଲଗା ହରିଣ"));
        words.add(new word("Panther","କଲରା ପତ୍ରିଆ"));
        words.add(new word("Musk deer","କସ୍ତୁରୀ ମୃଗ"));
        words.add(new word("Wild cat","କଟାସ"));
        words.add(new word("Kangaroo","କଙ୍ଗାରୁ"));




        words.add(new word("Dog","କୁକୁର"));
        words.add(new word("Fox","କୋକି ଶିଆଳି"));
        words.add(new word("Antelope","କୃଷ୍ଣସାର "));
        words.add(new word("Mule","ଖଚର "));
        words.add(new word("Ass","ଗଧ"));




        words.add(new word("Puppy","କୁକୁର ଛୁଆ"));
        words.add(new word("Wolf","ଗଧିଆ"));
        words.add(new word("Bison","ଗୟଳ"));
        words.add(new word("Rhinocer","ଗଣ୍ଡା"));
        words.add(new word("Squirrel","ଗୁଣ୍ଡୁଚି ମୂଷା"));
        words.add(new word("Horse","ଘୋଡ଼ା"));
        words.add(new word("Mare","ଘୋଡି"));
        words.add(new word("Hog","ଘୁଷୁରୀ"));
        words.add(new word("Leopard","ଚିତା ବାଘ "));


        words.add(new word("Mole","ଚୁଚୁନ୍ଦ୍ରା"));
        words.add(new word("Spotted deer","ଚିତା ମୃଗ "));
        words.add(new word("Mouse","ଚୁଟିଆ ମୂଷା "));
        words.add(new word("goat","ଛେଳି"));
        words.add(new word("she goat","ମାଇ ଛେଳି"));
        words.add(new word("Sow","ମାଇ ଘୁଷୁରୀ"));
        words.add(new word("zebra","ଜେବ୍ରା"));
        words.add(new word("Giraffe","ଜିରାଫ୍"));


        words.add(new word("Porcupine","ଝିଙ୍କ "));
        words.add(new word("Hare/Rabbit","ଠେକୁଆ "));
        words.add(new word("Pony","ତଟୁ ଘୋଡ଼ା"));
        words.add(new word("Dry cow","ଦୁଧ ଦେଉନଥିବା ଗାଈ"));
        words.add(new word("Milchy cow","ଦୁଂହ|ଲୀଆ ଗାଈ"));
        words.add(new word("Tusker","ଦନ୍ତା ହାତୀ"));



        words.add(new word("Mangoose","ନେଉଳ"));
        words.add(new word("Chimpanzee","ବଣ ମଣିଷ "));
        words.add(new word("Royal Bengal Tiger","ମହାବଳ ବାଘ "));
        words.add(new word("She calf","ମାଇ ବାଛୁରୀ"));
        words.add(new word("Calf","ଅଣ୍ଡିରା ବାଛୁରୀ "));
        words.add(new word("rat","ବଡ଼ ମୂଷା"));
        words.add(new word("Jackle","ବିଲୁଆ"));
        words.add(new word("Cat","ବିଲେଇ"));
        words.add(new word("Orang-Outang","ବଣ ମଣିଷ "));
        words.add(new word("Bear","ଭାଲୁ "));
        words.add(new word("Buffalo","ମଇଁଷି"));
        words.add(new word("Sheep","ମେଣ୍ଢା"));
        words.add(new word("Ewe","ମେଣ୍ଢା"));















        words.add(new word("Hind","ହରିଣୀ"));
        words.add(new word("Deer","ମୃଗ ହରିଣ "));
        words.add(new word("Lion","ସିଂହ "));
        words.add(new word("Elk","ସିଂହୀ"));
        words.add(new word("Sea cow","ସମୁଦ୍ର ଗାଈ "));
        words.add(new word("Sea Horse","ସମୁଦ୍ର ଘୋଟକ"));
        words.add(new word("Civet cat","ଶାଳିଆ ପତାନୀ"));
        words.add(new word("Elephant","ହାତୀ"));
        words.add(new word("Yak","ଚମରୀ ଗାଈ "));
        words.add(new word("Lamb","ମେଣ୍ଢା ଛୁଆ "));
        words.add(new word("Kid","ଛେଳି ଛୁଆ"));
        words.add(new word("Black face monkey","ହନୁ ମାଙ୍କଡ"));
        words.add(new word("Kitten","ବିରାଡ଼ି ଛୁଆ"));
        words.add(new word("Heifer","ଛଡା"));



        words.add(new word("Muskrat","ଗନ୍ଧ ମୂଷା"));
        words.add(new word("Hound","ଶିକାରୀ କୁକୁର "));
        words.add(new word("Stray dog","ବୁଲା  କୁକୁର "));
        words.add(new word("Red faced monkey","ପାତି ମାଙ୍କଡ"));
        words.add(new word("Hyena","ହେଟା ବାଘ"));




        WordAdapter adapter = new WordAdapter(this, words, R.color.category_beast);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
