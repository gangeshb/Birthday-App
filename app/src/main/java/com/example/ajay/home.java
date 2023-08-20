package com.example.ajay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class home extends AppCompatActivity {
    ListView listView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);
        this.listView = (ListView) findViewById(R.id.listView);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person(R.drawable.advice, "Introduction 😎", "The Man.. The Myth.. The Legend"));
        arrayList.add(new Person(R.drawable.supreme, "Supremacy 🤭", "Something nonchalant"));
        arrayList.add(new Person(R.drawable.advice, "Advice 😬", "Seeking in something important"));
        arrayList.add(new Person(R.drawable.secret, "Secret Message 🤫", "Birthday Message"));
      //  arrayList.add(new Person(R.drawable.open_letter, "Open Letter 😉", "This one gonna be hectic"));
        arrayList.add(new Person(R.drawable.quotes, "Quotes ❤", "Lets bring in cheerful vibes"));
        arrayList.add(new Person(R.drawable.meticulous, "Amazing Ajay \uD83D\uDC68\uD83C\uDFFC", "Best things about Ajay"));
     //   arrayList.add(new Person(R.drawable.dream, "Dream come true 🙆", "Predicting Future"));
        arrayList.add(new Person(R.drawable.word, "Words of wisdom 😍", "Something to ponder upon"));
        arrayList.add(new Person(R.drawable.apology, "Apology 🙇‍♂️", "Uh oh, Sorry.."));
        this.listView.setAdapter(new PersonAdapter(this, R.layout.list_row, arrayList));
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    home.this.startActivity(new Intent(home.this, intro.class));
                }
                if (i == 1) {
                    home.this.startActivity(new Intent(home.this, supremacy.class));
                }
                if (i == 2) {
                    home.this.startActivity(new Intent(home.this, advice.class));
                }
                if (i == 3) {
                    home.this.startActivity(new Intent(home.this, secret.class));
                }
                if (i == 4) {
                    home.this.startActivity(new Intent(home.this, open_letter.class));
                }
                if (i == 5) {
                    home.this.startActivity(new Intent(home.this, quotes.class));
                }
                if (i == 6) {
                    Intent intent = new Intent(home.this, meticulous.class);
                    Toast.makeText(home.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                    home.this.startActivity(intent);
                }
                if (i == 7) {
                    home.this.startActivity(new Intent(home.this, dream.class));
                }
                if (i == 8) {
                    home.this.startActivity(new Intent(home.this, word.class));
                }
                if (i == 9) {
                    home.this.startActivity(new Intent(home.this, apology.class));
                }
            }
        });
    }
}
