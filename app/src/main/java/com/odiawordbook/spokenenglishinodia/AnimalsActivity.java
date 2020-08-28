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

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();


        words.add(new word("Insect","କିଟ ପତଙ୍ଗ"));
        words.add(new word("Animal","ପ୍ରାଣୀ "));
        words.add(new word("Beast","ପଶୁ "));
        words.add(new word("Bird","ପକ୍ଷୀ"));
        words.add(new word("Worm","କୀଟ "));
        words.add(new word("Animalcule","କିଟାଣୁ"));
        words.add(new word("aquatic Animal","ଜଳଚର ପ୍ରାଣୀ"));
        words.add(new word("Land animal","ସ୍ଥଳଚର ପ୍ରାଣୀ"));
        words.add(new word("Reptile","ସରୀସୃପ"));
        words.add(new word("amphibians","ଉଭୟଚର"));


        words.add(new word("Vertebreta","ମେରୁ ଦଣ୍ଡୀ"));
        words.add(new word("InVertebreta","ଅମେରୁ ଦଣ୍ଡୀ"));
        words.add(new word("Wild animal","ବନ୍ୟ ଜନ୍ତୁ"));
        words.add(new word("Domestic animal","ଗୃହପାଳିତ ପଶୁ"));
        words.add(new word("Quadrupeds","ଚତୁଷ୍ପଦ"));
        words.add(new word("Quadramana","ଚତୁଷ୍କର୍ "));
        words.add(new word("Biped","ଦ୍ଵିପଦ ପ୍ରାଣୀା "));
        words.add(new word("Best of Prey","ସ୍ୱାପଦ"));



        words.add(new word("Herbivorous","ତୃଣଭୋଜି"));
        words.add(new word("Carnivorous","ମାଂସାଶି"));
        words.add(new word("Graminivorous","ଶସ୍ୟା ହାରି"));
        words.add(new word("Viviporous","ଜରୟୁଜ"));
        words.add(new word("Polypod","ବହୁପଦ"));
        words.add(new word("Man","ମଣିଷ"));
        words.add(new word("Pendolous ears","ଝୁଲା କାନ"));
        words.add(new word("Erect ears","ଠିଆ କାନ"));



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_animals);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
