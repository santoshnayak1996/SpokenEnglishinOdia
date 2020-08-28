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

public class FlowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();







        words.add(new word("Flower","ଫୁଲ"));


        words.add(new word("Hair","ଆଁସୁ "));
        words.add(new word("Amranth","ଅପରାଜିତା "));
        words.add(new word("Cock's comb","ଇଶ୍ଵର ଜଟ"));
        words.add(new word("Lily","କଇଁ"));
        words.add(new word("Chinese box","କାମିନୀ"));
        words.add(new word("Screw pine","କେତକୀ"));
        words.add(new word("Oleander flower", "କରବିର"));
        words.add(new word("Goldmohar","କୃଷ୍ଣଚୂଡ଼ା"));
        words.add(new word("Yellow oleander","କନିଅର୍"));
        words.add(new word("Jasmine","କୁଣ୍ଡଜୁଏ"));
        words.add(new word("Pandanus","କିଆ"));
        words.add(new word("Champak","ଚମ୍ପା"));
        words.add(new word("Foal foot","ଟଗର"));
        words.add(new word("Queen of the night","ହେନା"));
        words.add(new word("Bastard teak","ପଳାଶ"));
        words.add(new word("Lotus","ପଦ୍ମ"));
        words.add(new word("Rer china rose","ରକ୍ତଜବା"));
        words.add(new word("Tulip","ମଲ୍ଲି"));
        words.add(new word("Zinnia","ଜିନିଆ"));
        words.add(new word("Jasmine","ଜୁଇ"));
        words.add(new word("Tube rose","ରଜନୀଗନ୍ଧା"));
        words.add(new word("Sunflower","ସୂର୍ଯ୍ୟ ମୁଖି"));
        words.add(new word("Daffodils","ସ୍ଥଳ ପଦ୍ମ"));
        words.add(new word("Teacoma","ତରାଟ"));
        words.add(new word("Night Jasmine","ଶେଫାଳୀ"));
        words.add(new word("Stramoni flower/Throm-apple Flower","ଦୁଦୁରା ଫୁଲ"));
        words.add(new word("Jasmine","ମାଳତୀ "));
        words.add(new word("Passion flower","ରାଧା ତମାଳ"));
        words.add(new word("Passiflora","ସଦବିହରି"));
        words.add(new word("Canna","ସର୍ବ ଜୟା"));
        words.add(new word("Balsam ","ହରଗୌର"));
        words.add(new word("Rose","ଗୋଲାପ "));
        words.add(new word("Marigold","ଗେଣ୍ଡୁ"));
        words.add(new word("Bud","କଢ"));
        words.add(new word("Flower bed","ଫୁଲ କୁଣ୍ଡ"));
        words.add(new word("Nosegay","ଫୁଲତୋଡ଼ା"));
        words.add(new word("Petal","ପାଖୁଡ଼ା"));
        words.add(new word("Blossom","ବଉଳ"));
        words.add(new word("Stem","ଡେମ୍ଫ "));
        words.add(new word("Seedling","ଚାରା ଗଛ"));
        words.add(new word("Pollen","ପୁଷ୍ପ ରେଣୁ"));
        words.add(new word("Bunch","ପେନ୍ଥା "));

         words.add(new word("Dalhia","ଡାଲିଆ"));
        words.add(new word("Cape jasmine","ସୁଗନ୍ଧ ରାଜ"));
        words.add(new word("Kadamba","କଦମ୍ବ"));
        words.add(new word("Cherry santhemun","ସେବତୀ "));
        words.add(new word("Withered flower","ବାସି ଫୁଲ "));









        WordAdapter adapter = new WordAdapter(this, words, R.color.category_birds);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
