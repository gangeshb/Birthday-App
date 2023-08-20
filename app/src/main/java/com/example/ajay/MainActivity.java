package com.example.ajay;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    /* renamed from: bt */
    Button button;
    CharSequence charSequence;
    long delay = 200;
    Handler handler = new Handler();
    int index;
    ImageView ivBeat;
    ImageView ivBottom;
    ImageView ivHeart;
    ImageView ivTop;
    Runnable runnable = new Runnable() {
        public void run() {
            TextView textView = MainActivity.this.textView;
            CharSequence charSequence = MainActivity.this.charSequence;
            MainActivity mainActivity = MainActivity.this;
            int i = mainActivity.index;
            mainActivity.index = i + 1;
            textView.setText(charSequence.subSequence(0, i));
            if (MainActivity.this.index <= MainActivity.this.charSequence.length()) {
                MainActivity.this.handler.postDelayed(MainActivity.this.runnable, MainActivity.this.delay);
            }
        }
    };
    TextView textView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.ivTop = (ImageView) findViewById(R.id.ib_top);
        this.ivHeart = (ImageView) findViewById(R.id.iv_heart);
        this.ivBeat = (ImageView) findViewById(R.id.iv_beat);
        this.ivBottom = (ImageView) findViewById(R.id.iv_bottom);
        this.textView = (TextView) findViewById(R.id.text_view);
        AnimationDrawable animationDrawable = (AnimationDrawable) ((RelativeLayout) findViewById(R.id.layout)).getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        Button button = (Button) findViewById(R.id.button1);
        this.button = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Welcome 🙂", Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(new Intent(MainActivity.this, home.class));
            }
        });
        getWindow().setFlags(1024, 1024);
        this.ivTop.setAnimation(AnimationUtils.loadAnimation(this, R.anim.top_wave));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.ivHeart, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.2f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.2f})});
        ofPropertyValuesHolder.setDuration(500);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(ValueAnimator.REVERSE);
        ofPropertyValuesHolder.start();


        animatText("\uD83C\uDF82Happy B'day Ajay\uD83C\uDF82");

        this.ivBottom.setAnimation(AnimationUtils.loadAnimation(this, R.anim.bottom_wave));
    }

    public void animatText(CharSequence charSequence2) {
        this.charSequence = charSequence2;
        this.index = 0;
        this.textView.setText("");
        this.handler.removeCallbacks(this.runnable);
        this.handler.postDelayed(this.runnable, this.delay);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0463R.C0467menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onOptionsItemSelected(menuItem);
    }
}