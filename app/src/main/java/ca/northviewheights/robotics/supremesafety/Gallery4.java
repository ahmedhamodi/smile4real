package ca.northviewheights.robotics.supremesafety;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Gallery4 extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.quote1, R.drawable.quote2, R.drawable.quote3, R.drawable.quote4, R.drawable.quote5,
            R.drawable.quote6, R.drawable.quote7, R.drawable.quote8, R.drawable.quote9, R.drawable.quote10,
            R.drawable.quote11, R.drawable.quote12, R.drawable.quote13, R.drawable.quote14, R.drawable.quote15,
            R.drawable.quote1, R.drawable.quote2, R.drawable.quote3, R.drawable.quote4, R.drawable.quote5,
            R.drawable.quote6, R.drawable.quote7, R.drawable.quote8, R.drawable.quote9, R.drawable.quote10,
            R.drawable.quote11, R.drawable.quote12, R.drawable.quote13, R.drawable.quote14, R.drawable.quote15,
            R.drawable.quote1, R.drawable.quote2, R.drawable.quote3, R.drawable.quote4, R.drawable.quote5,
            R.drawable.quote6, R.drawable.quote7, R.drawable.quote8, R.drawable.quote9, R.drawable.quote10,
            R.drawable.quote11, R.drawable.quote12, R.drawable.quote13, R.drawable.quote14, R.drawable.quote15,
            R.drawable.quote1, R.drawable.quote2, R.drawable.quote3, R.drawable.quote4, R.drawable.quote5,
            R.drawable.quote6, R.drawable.quote7, R.drawable.quote8, R.drawable.quote9, R.drawable.quote10,
            R.drawable.quote11, R.drawable.quote12, R.drawable.quote13, R.drawable.quote14, R.drawable.quote15,

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
        setContentView(R.layout.activity_gallery4);

        viewPager = (ViewPager)findViewById(R.id.mvieww4);
        adapter = new ImageAdapter(Gallery4.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
