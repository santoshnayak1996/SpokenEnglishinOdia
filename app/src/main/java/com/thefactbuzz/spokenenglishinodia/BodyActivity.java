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

public class BodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Limbs","ଅଙ୍ଗ ପ୍ରତ୍ୟଙ୍ଗ"));
        words.add(new word("Head","ମୁଣ୍ଡ "));
        words.add(new word("Brain","ମସ୍ତିସ୍କ "));
        words.add(new word("Fore head","କପାଳ"));
        words.add(new word("Skull","ଖପୁରି "));
        words.add(new word("Palate","ତାଳୁ"));
        words.add(new word("Face","ମୁଂହ"));
        words.add(new word("Eye","ଆଖି"));
        words.add(new word("Ear","କାନ"));
        words.add(new word("Moustache","ନିଶ"));
        words.add(new word("Nose","ନାକ"));
        words.add(new word("Eye Lid","ଆଖି ପତା"));
        words.add(new word("Eye Ball","ଆଖି ଡୋଳା"));
        words.add(new word("Pupil","ଆଖି ପିତୁଳା"));
        words.add(new word("Lips","ଓଠ"));
        words.add(new word("Cheek","ଗାଲ "));
        words.add(new word("Nostrils","ନାକ ପୁଡା "));
        words.add(new word("Mouth","ପାଟି"));

        words.add(new word("Teeth","ଦାନ୍ତ"));
        words.add(new word("Tounge","ଜିଭ"));
        words.add(new word("Throat","ତଣ୍ଟି"));
        words.add(new word("Neck","ବେକ"));
        words.add(new word("Ear drum","କର୍ଣ୍ଣ ପାଟହ"));
        words.add(new word("Tympanum","କାନ ଗିରି"));
        words.add(new word("Back bone","ମେରୁ ଦଣ୍ଡ"));
        words.add(new word("Armpit","କାଖ"));
        words.add(new word("Breast","ସ୍ତନ "));

        words.add(new word("Sternum","ଛାତି ହାଡ"));
        words.add(new word("skeleton","କଙ୍କାଳ "));
        words.add(new word("Rib","ପିଞ୍ଜରା "));
        words.add(new word("Heart","ହୃତପିଣ୍ଡ"));
        words.add(new word("Belly","ପେଟ "));
        words.add(new word("Abdomen","ତଳି ପେଟ"));
        words.add(new word("Fur","ଲୋମ"));
        words.add(new word("vein","ଶିରା"));
        words.add(new word("Artery","ଧମନୀ "));
        words.add(new word("Liver","ଯକୃତ "));
        words.add(new word("stomach","ପାକସ୍ଥଳୀ"));
        words.add(new word("Lap","କୋଳ"));
        words.add(new word("Navel","ନାଭି"));
        words.add(new word("Elbow","କହୁଣୀ"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_body);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
