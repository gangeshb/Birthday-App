package com.example.ajay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class secret extends AppCompatActivity {
    ListView listView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_secret);
        this.listView = (ListView) findViewById(R.id.listView);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person(R.drawable.gangesh, "Good thing🤩", "Word from Gangesh"));
        arrayList.add(new Person(R.drawable.gangesh, "Future😎", "Word from Gangesh"));
        this.listView.setAdapter(new PersonAdapter(this, R.layout.list_row, arrayList));
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    secret.this.startActivity(new Intent(secret.this, kalim_good.class));
                }
                if (i == 1) {
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                    secret.this.startActivity(new Intent(secret.this, kalim_advice.class));
                }
                if (i == 2) {
                    secret.this.startActivity(new Intent(secret.this, aqib_good.class));
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                }
                if (i == 3) {
                    secret.this.startActivity(new Intent(secret.this, aqib_advice.class));
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                }
                if (i == 4) {
                    secret.this.startActivity(new Intent(secret.this, sohail_good.class));
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                }
                if (i == 5) {
                    secret.this.startActivity(new Intent(secret.this, sohail_advice.class));
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                }
                if (i == 6) {
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                    secret.this.startActivity(new Intent(secret.this, gangesh_good.class));
                }
                if (i == 7) {
                    Intent intent = new Intent(secret.this, gangesh_advice.class);
                    Toast.makeText(secret.this, "Plz.. Tap on Screen", Toast.LENGTH_SHORT).show();
                    secret.this.startActivity(intent);
                }
            }
        });
    }
}
