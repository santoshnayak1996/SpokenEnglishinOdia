package com.thefactbuzz.spokenenglishinodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);





        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Father","ବାପା",R.drawable.family_father));
        words.add(new word("Mother","ମାଆ",R.drawable.family_mother));
        words.add(new word("Grand Father","ଅଜା ",R.drawable.family_grandfather));
        words.add(new word("Grand Mother","ଆଇ",R.drawable.family_grandmother));
        words.add(new word("Daughter","ଝିଅ",R.drawable.family_daughter));
        words.add(new word("Son","ପୁଅ",R.drawable.family_son));
        words.add(new word("Elder Brother","ବଡ ଭାଇ",R.drawable.family_older_brother));
        words.add(new word("Elder Sister","ବଡ ଭଉଣୀ",R.drawable.family_older_sister));
        words.add(new word("Younger Brother","ସାନ ଭାଇ",R.drawable.family_younger_brother));
        words.add(new word("Younger Sister","ସାନ ଭଉଣୀ ",R.drawable.family_younger_sister));
        words.add(new word("Uncle","ପିଉସା/ମଉସା ",R.drawable.family_father));
        words.add(new word("Aunt","ପିଉସୀ/ମାଉସୀ ",R.drawable.family_mother));
        words.add(new word("Nephew","ପୁତୁରା/ଭଣଜା",R.drawable.family_younger_brother));
        words.add(new word("Niece","ଝିଆରୀ/ଭାଣିଜୀ ",R.drawable.family_older_sister));
        words.add(new word("Maternal Uncle","ମାମୁଁ",R.drawable.family_father));
        words.add(new word("Maternal aunt","ମାଇଁ",R.drawable.family_mother));
        words.add(new word("Grand son","ନାତି",R.drawable.family_younger_brother));
        words.add(new word("Grand daughter","ନାତୁଣୀ",R.drawable.family_younger_sister));
        words.add(new word("Brother-in-Law","ଶଳା/ଭିଣେଇ /ସଢୁ/ଦିଅର/ଦେଧୁସୁର",R.drawable.family_older_brother));
        words.add(new word("Sister-in-Law","ଯା/ଶାଳୀ/ଭାଉଜ/ନଣନ୍ଦ",R.drawable.family_mother));
        words.add(new word("Father-in-Law","ସମୁଦୀ /ଶଶୁର",R.drawable.family_grandfather));
        words.add(new word("Mother-in-Law","ଶାଶୁ /ସମୁଦୁଣୀ ",R.drawable.family_grandmother));
        words.add(new word("Son-in-Law","ଜ୍ୱାଇଁ",R.drawable.family_father));
        words.add(new word("Daughter-in-Law","ବୋହୁ ",R.drawable.family_mother));
        words.add(new word("Step Son","ସଉତୁଣୀ ପୁଅ",R.drawable.family_older_brother));
        words.add(new word("CoWifw","ସଉତୁଣୀ",R.drawable.family_mother));
        words.add(new word("Step Brother","ସାବତ ଭାଇ",R.drawable.family_son));
        words.add(new word("God father","ଧରମ ବାପା",R.drawable.family_older_brother));
        words.add(new word("God mother","ଧରମ ମାଆ",R.drawable.family_mother));
        words.add(new word("Adopted Son","ପୋଷ୍ୟ ପୁତ୍ର",R.drawable.family_younger_brother));
        words.add(new word("Concubine","ରକ୍ଷିତା",R.drawable.family_mother));





        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);




        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
