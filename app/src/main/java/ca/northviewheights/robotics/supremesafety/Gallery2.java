package ca.northviewheights.robotics.supremesafety;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Gallery2 extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5,
            R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9, R.drawable.cat10,
            R.drawable.cat11, R.drawable.cat12, R.drawable.cat13, R.drawable.cat14, R.drawable.cat15,
            R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5,
            R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9, R.drawable.cat10,
            R.drawable.cat11, R.drawable.cat12, R.drawable.cat13, R.drawable.cat14, R.drawable.cat15,
            R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5,
            R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9, R.drawable.cat10,
            R.drawable.cat11, R.drawable.cat12, R.drawable.cat13, R.drawable.cat14, R.drawable.cat15,
            R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5,
            R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9, R.drawable.cat10,
            R.drawable.cat11, R.drawable.cat12, R.drawable.cat13, R.drawable.cat14, R.drawable.cat15,

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
        setContentView(R.layout.activity_gallery);

        viewPager = (ViewPager)findViewById(R.id.mvieww2);
        adapter = new ImageAdapter(Gallery2.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
