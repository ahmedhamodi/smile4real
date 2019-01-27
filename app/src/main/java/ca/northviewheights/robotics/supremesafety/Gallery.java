package ca.northviewheights.robotics.supremesafety;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Gallery extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.q1, R.drawable.q2, R.drawable.q3, R.drawable.q4

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        viewPager = (ViewPager)findViewById(R.id.mvieww);
        adapter = new ImageAdapter(Gallery.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
