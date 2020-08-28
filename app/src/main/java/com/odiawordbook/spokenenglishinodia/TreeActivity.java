package com.odiawordbook.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();










        words.add(new word("Tree","ଗଛ"));









        words.add(new word("Vine tree","ଅଙ୍ଗୁର ଗଛ"));
        words.add(new word("Peepal","ଅଶ୍ୱତ୍ଥ ଗଛ"));
        words.add(new word("Calatropis","ଅରଖ ଗଛ"));
        words.add(new word("Emblic myrebalam","ଅଁଳା ଗଛ"));
        words.add(new word("Musselshell creeper","ଅପରାଜିତା ଗଛ"));
        words.add(new word("Sugarcane plant","ଆଖୁ ଗଛ"));
        words.add(new word("Apple tree","ଆତ ଗଛ"));
        words.add(new word("Mango tree","ଆମ୍ବ ଗଛ"));
        words.add(new word("Soapnut plant","ଇଠା ଗଛ"));
        words.add(new word("Cotton plant","କପା ଗଛ"));
        words.add(new word("Thorn plant","କଣ୍ଟା ଗଛ"));
        words.add(new word("Pagoda tree","କାଠ ଚମ୍ପା ଗଛ"));
        words.add(new word("Log of wood","କାଠ ଗଣ୍ଡି"));
        words.add(new word("Splinter","କାଠି"));


        words.add(new word( "Jungle roots","କନ୍ଦ"));
        words.add(new word("Banana tree","କଦଳୀ ଗଛ"));
        words.add(new word("Grove","କୁଞ୍ଜ ବନ"));

        words.add(new word("Orange tree","କମଳା ଗଛ"));
        words.add(new word("Date palm","ଖଜୁରୀ ଗଛ"));
        words.add(new word("Wattle","ଖଡ଼ିକା"));
        words.add(new word("Castor plant","ଗବ ଗଛ"));
        words.add(new word("Cedar tree","ଗମ୍ହରି ଗଛ"));
        words.add(new word("Shrub","ଗୁଳ୍ମ"));

        words.add(new word("Rose plant","ଗୋଲାପ ଗଛ"));
        words.add(new word("Grass","ଘାସ"));
        words.add(new word("Holy grass","କୁଶ ଘାସ"));

        words.add(new word("Lawn grass","ଦୁବ ଘାସ"));
        words.add(new word("Doob grass","ଦୁବ ଘାସ"));


        words.add(new word("Sandle tree","ଚନ୍ଦନ ଗଛ"));

        words.add(new word("Tea plant","ଚା ଗଛ "));
        words.add(new word("Flax plant","ଛଣ ପଟ"));
        words.add(new word("Mushroom","ଛତୁ"));
        words.add(new word("Fire wood","ଜାଳେଣି କାଠ"));


        words.add(new word("Holy basil","ତୁଳସୀ ଗଛ "));
        words.add(new word(" Palm tree","ତାଳ ଗଛ"));
        words.add(new word("Deodar","ଦେବଦରୁ ଗଛ"));
        words.add(new word("Neem tree","ନିମ ଗଛ"));
        words.add(new word("Cactus","ନାଗ ଫେଣିଆ"));
        words.add(new word("Cocount tree","ନଡ଼ିଆ ଗଛ"));
        words.add(new word("Jute plant","ନଳିତା ଗଛ"));
        words.add(new word("Indigo plant","ନୀଳ ଗଛ"));


        words.add(new word("Jack tree","ପଣସ ଗଛ"));
        words.add(new word("Banyan tree","ବର ଗଛ"));
        words.add(new word("Bel tree","ବେଲ ଗଛ"));
        words.add(new word("Bamboo tree","ବାଉଁଶ ଗଛ"));
        words.add(new word("Sal tree","ଶାଳ ଗଛ"));

        words.add(new word("Silk cotton tree","ସିମିଲି ଗଛ"));

        words.add(new word("Drum stick tree","ସଜନା ଗଛ"));
        words.add(new word("Seedlings","ଚାରା ବା ତଳି"));

        words.add(new word("Plant","ଛୋଟ ଗଛ"));
        words.add(new word("Pollard","ଥୁଣ୍ଟା ଗଛ"));
        words.add(new word("Indigenous tree","ଦେଶୀ ଗଛ"));
        words.add(new word("Exotic tree","ବିଦେଶୀ ଗଛ"));

        words.add(new word("Fruit bearing tree","ଫଳନ୍ତି ଗଛ"));
        words.add(new word("Garden","ବଗିଚା"));
        words.add(new word("Orchard","ଫଳ ବଗିଚା"));
        words.add(new word("Creeper","ଲତା"));


        words.add(new word("Branching tree","ଶାଖା ବହୁଳ ଗଛ"));
        words.add(new word("Root","ଚେର"));

        words.add(new word("Trunk","ଗଣ୍ଡି"));
        words.add(new word("Branch","ଶାଖା"));
        words.add(new word("Steam","କାଣ୍ଡ"));
        words.add(new word("Bark","ଛେଲି"));
        words.add(new word("Descending root","ଗଛ ର ଓହଳ"));
        words.add(new word("Twig","ଛୋଟ ଡାଳ"));

        words.add(new word("Tender leaf","କଂଳିଆ ପତ୍ର"));
        words.add(new word("Thorn","ଫୁଲ"));

        words.add(new word("Fruit","କଣ୍ଟା"));
        words.add(new word("Crushed straw","ପାଳ ନଡ଼ା"));
        words.add(new word("Touch me not","ଲାଜକୁଳୀ"));

        words.add(new word("Juice","ରସ"));
        words.add(new word("Stone","ଟାକୁଆ"));
        words.add(new word("Cane","ବେତ"));
        words.add(new word("Shrub","ଗୁଳ୍ମ"));
        words.add(new word("Skin","ଚୋପା"));
        words.add(new word("Bud","କଢ"));
        words.add(new word("Filament","କେଶର"));
        words.add(new word("Fresh fruit","ତଟକା ଫଳ"));
        words.add(new word("Guava tree","ପିଜୁଳି ଗଛ"));
        words.add(new word("Roseberry tree","ଜାମୁକୋଳି ଗଛ"));
        words.add(new word("Plum tree","ବରକୋଳି ଗଛ"));
        words.add(new word("Lemon tree","ଲେମ୍ବୁ ଗଛ"));
        words.add(new word("Sugarcane","ଆଖୁ ଗଛ"));


        words.add(new word("Palyal tree","ଅଶୋକ ଗଛ"));
        words.add(new word("Fig tree","ଦୀମିରି ଗଛ"));
        words.add(new word("Bettlenut tree","ଗୁଆ ଗଛ"));
        words.add(new word("Promegranate tree","ଡାଳିମ୍ବ ଗଛ"));
        words.add(new word("Lichi tree","ଲିଚୁ ଗଛ"));
        words.add(new word("Tarmarind tree","ତେନ୍ତୁଳି ଗଛ"));
        words.add(new word("Dhak tree","ପଳାଶ ଗଛ"));
        words.add(new word("Rice plant","ଧାନ ଗଛ"));
        words.add(new word("Champak tree","ଚମ୍ପା ଗଛ"));
        words.add(new word("Opium tree","ଅଫିମ ଗଛ"));
        words.add(new word("Papaya tree","ଅମୃତଭଣ୍ଡା ଗଛ"));




        WordAdapter adapter = new WordAdapter(this, words, R.color.category_tree);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
