package ca.northviewheights.robotics.supremesafety;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Gallery6 extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.outdoor1, R.drawable.outdoor2, R.drawable.outdoor3, R.drawable.outdoor4, R.drawable.outdoor5,
            R.drawable.outdoor6, R.drawable.outdoor7, R.drawable.outdoor8, R.drawable.outdoor9, R.drawable.outdoor10,
            R.drawable.outdoor11, R.drawable.outdoor12, R.drawable.outdoor13,
            R.drawable.outdoor1, R.drawable.outdoor2, R.drawable.outdoor3, R.drawable.outdoor4, R.drawable.outdoor5,
            R.drawable.outdoor6, R.drawable.outdoor7, R.drawable.outdoor8, R.drawable.outdoor9, R.drawable.outdoor10,
            R.drawable.outdoor11, R.drawable.outdoor12, R.drawable.outdoor13,
            R.drawable.outdoor1, R.drawable.outdoor2, R.drawable.outdoor3, R.drawable.outdoor4, R.drawable.outdoor5,
            R.drawable.outdoor6, R.drawable.outdoor7, R.drawable.outdoor8, R.drawable.outdoor9, R.drawable.outdoor10,
            R.drawable.outdoor11, R.drawable.outdoor12, R.drawable.outdoor13,
            R.drawable.outdoor1, R.drawable.outdoor2, R.drawable.outdoor3, R.drawable.outdoor4, R.drawable.outdoor5,
            R.drawable.outdoor6, R.drawable.outdoor7, R.drawable.outdoor8, R.drawable.outdoor9, R.drawable.outdoor10,
            R.drawable.outdoor11, R.drawable.outdoor12, R.drawable.outdoor13

    };
    private String[] images = {

            "http://androidwalls.net/wp-content/uploads/2016/04/Blue%20Diamond%20Rhombus%20Pattern%20Android%20Wallpaper.jpg",
            "https://wallpaperscraft.com/image/surface_pattern_background_black_diamonds_50748_1080x1920.jpg",
            "https://wallpaperscraft.com/image/patterns_background_dark_spots_50633_1080x1920.jpg",
            "http://www.1080x1920wallpapers.com/1080x1920-backgrounds/1080x1920-wallpapers-1/1080x1920-HD-wallpapers-samsung-htc-android-smartphone-1069sjm9-1080P.jpg"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery6);

        viewPager = (ViewPager)findViewById(R.id.mvieww6);
        adapter = new ImageAdapter(Gallery6.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
