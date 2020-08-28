package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class WormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);





        ArrayList<word> words = new ArrayList<word>();




        words.add(new word("worm","କିଟ"));
        words.add(new word("Insect","ପତଙ୍ଗ "));
        words.add(new word("Cockroach","ଅସରପା "));
        words.add(new word("Oviparous","ଅଣ୍ଡଯ"));
        words.add(new word("Louse","ଉକୁଣୀ "));
        words.add(new word("White ant","ଉଈ"));
        words.add(new word("Ersilk worm ","ଏଣ୍ଡି ପୋକ"));
        words.add(new word("Dragon fly","କଙ୍କି"));
        words.add(new word("MOle Cricket","କୋଲକାତାର"));
        words.add(new word("Tree ant","କାଇ"));
        words.add(new word("Black Bee","କଳା ଭ୍ରମର"));
        words.add(new word("Miliped","ଗୌଡୁଣୀ ପୋକ"));
        words.add(new word("Beettle","ଗୋବର ପୋକ"));
        words.add(new word("Silk Worm","ଗୋଟି ପୋକ"));
        words.add(new word("Bug"," ଛାର ପୋକ"));
        words.add(new word("Winged ant","ଝଡି ପୋକ "));
        words.add(new word("Glow worm","ଜୁଳୁ ଯୁଳିଆ ପୋକ"));
        words.add(new word("Cricket","ଝିଙ୍କାରି"));
        words.add(new word("GrassHopper","ଝିନ୍ତିକା"));
        words.add(new word("Epizoon","ଝିଙ୍କ"));
        words.add(new word("Gnat","ଡାଂଶ"));
        words.add(new word("Nit"," ନିଖ"));
        words.add(new word("Locust"," ପଂଗ ପାଳ"));
        words.add(new word("Butterfly","ପ୍ରଜାପତି"));
        words.add(new word("Ant","ପିମ୍ପୁଡ଼ି"));
        words.add(new word("Mango fly","ପୋତକ"));
        words.add(new word("Spider","ବୁଢିଆଣୀ "));
        words.add(new word("Chameleon","ବହୁରୂପୀ"));
        words.add(new word("Weevil","ବମା ପୋକ "));
        words.add(new word("Spider web","ବୁଢିଆଣୀ ଜାଲ "));
        words.add(new word("Bee","ଭ୍ରମର"));
        words.add(new word("Wasp","ବିରୁଡି"));
        words.add(new word("Hornet","ଭଂର"));
        words.add(new word("Fly","ମଶା"));
        words.add(new word("Spider","ମାଙ୍କଡସା"));
        words.add(new word("Silk Worm","ରେଶମ ପୋକ"));
        words.add(new word("Slug","ଶାଗ ପୋକ"));
        words.add(new word("Caterpillar","ସଂବଳୁଆ"));
        words.add(new word("Anthill","ହୁଙ୍କା"));
        words.add(new word("Ladybug","ସାଧବ ବୋହୂ"));
        words.add(new word("Garden Lizard","ଏଣ୍ଡୁଅ"));





        WordAdapter adapter = new WordAdapter(this, words, R.color.category_worm);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
