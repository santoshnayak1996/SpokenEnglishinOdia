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

public class BirdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();







        words.add(new word("Bird","ପକ୍ଷୀ"));
        words.add(new word("Feather","ପର "));
        words.add(new word("Beak","ଥନ୍ଟ "));
        words.add(new word("Eagle","ଇଗଲ"));
        words.add(new word("Emu","ଏମୁ "));
        words.add(new word("Ostrich","ଓଟ ପକ୍ଷୀ"));
        words.add(new word("Dove","କପୋତ"));
        words.add(new word("Wood pecker","କାଠ ହଣା"));
        words.add(new word("Pond heron","କାଂଟି ବଗ"));
        words.add(new word("Crow","କାଉ"));
        words.add(new word("Cuckatoo","କାକ ତୁଆ"));


        words.add(new word("Cock","କୁକୁଡ଼ା"));
        words.add(new word("Cuckoo","କୋଇଲି"));
        words.add(new word("Hornbill","କୋଚିଳା ଖାଇ"));
        words.add(new word("Hen","ମାଇ କୁକୁଡ଼ା"));
        words.add(new word("Black drong","କଜଳ ପାତି "));
        words.add(new word("Strix","କଳା ପେଚା "));
        words.add(new word("Curlew","କ୍ରୋଉଁଚ"));



        words.add(new word("Wagtail","ଖଞ୍ଜନ୍"));
        words.add(new word("Grey Crane","ଗେଣ୍ଡଳିଆ"));
        words.add(new word("Nightinagle","ବୁଲବୁଲ"));
        words.add(new word("sparrow","ଘର ଚଟିଆ"));
        words.add(new word("Ruddy","ଚକ୍ରବାକ"));
        words.add(new word("Lark","ଚାତକ"));
        words.add(new word("Kite","ଚିଲ"));
        words.add(new word("white kite","ଶଙ୍ଖ ଚିଲ"));
        words.add(new word("Bird","ଚଡେଇ "));


        words.add(new word("Falcon","ଛଞ୍ଚାଣ"));
        words.add(new word("Water fowl","ଜଳଚର ପକ୍ଷୀ "));
        words.add(new word("Lorikeet","ଟିଆ "));
        words.add(new word("Tatler","ଟେନ୍ତେଲ୍"));
        words.add(new word("Rook/Raven","ଡ଼ାମରା କାଉ "));
        words.add(new word("Water hen","ଡାହୁକ"));
        words.add(new word("Partridage","ତିତିରି"));
        words.add(new word("magpie robin","ଦୟାଳୁ ଚଡେଇ"));
        words.add(new word("Little Cormorant","ପାଣି କୁଆ "));
        words.add(new word("Drake","ପାତି ହଂସ "));
        words.add(new word("Pigeon","ପାରା"));
        words.add(new word("Duck","ପାତୀ ହଂସି"));
        words.add(new word("Owl","ପେଚା"));
        words.add(new word("Stork","ସାରସ"));





        words.add(new word("Heron","ବଗ"));
        words.add(new word("Bat","ବାଦୁଡ଼ି "));
        words.add(new word("Weaver bird","ବାୟା ଚଡେଇ "));
        words.add(new word("Myna/mina","ବଣୀ"));
        words.add(new word("Hawk","ବାଜ "));
        words.add(new word("Sand piper","ବାଲି ଟେନ୍ତର"));
        words.add(new word("Dabchick","ବାଲି ହଂସ"));
        words.add(new word("Large erget","ବଗୁଲା"));
        words.add(new word("Lark","ଭରତିଆ "));
        words.add(new word("Peacock","ମୟୂର "));
        words.add(new word("Peahen","ମୟୁରି"));
        words.add(new word("king-fisher","ମାଛରଙ୍କା"));
        words.add(new word("Macow","ତୋତା"));
        words.add(new word("Gander","ରାଜ ହଂସ"));





        words.add(new word("Goose","ରାଜ ହଂଶୀ"));
        words.add(new word("Tumbler","ଲୋଟଣି ପାରା "));
        words.add(new word("Vulture","ଶାଗୁଣା "));
        words.add(new word("Parrot","ଶୁଆ"));
        words.add(new word("Blue jay","ଭଦ ଭଦଳିଆ "));
        words.add(new word("Crane","ସାରସ"));
        words.add(new word("Mango bird","ହଳଦୀ ବସନ୍ତ"));
        words.add(new word("Nest","ଚଡେଇ ଛୁଆ"));
        words.add(new word("Pengine","ପେଂଗୁଇନ "));
        words.add(new word("Horn bill","କୋଇଲି ଖାଇ "));
        words.add(new word("Eagle","ଗରୁଡ଼"));
        words.add(new word("duck","ବତକ"));
        words.add(new word("Adjutant","ହାତ ଗିଲା"));



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_birds);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
