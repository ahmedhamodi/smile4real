package ca.northviewheights.robotics.supremesafety;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Gallery5 extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.indoor1, R.drawable.indoor2, R.drawable.indoor3, R.drawable.indoor4, R.drawable.indoor5,
            R.drawable.indoor6, R.drawable.indoor7, R.drawable.indoor8, R.drawable.indoor9, R.drawable.indoor10,
            R.drawable.indoor11, R.drawable.indoor12, R.drawable.indoor13,
            R.drawable.indoor1, R.drawable.indoor2, R.drawable.indoor3, R.drawable.indoor4, R.drawable.indoor5,
            R.drawable.indoor6, R.drawable.indoor7, R.drawable.indoor8, R.drawable.indoor9, R.drawable.indoor10,
            R.drawable.indoor11, R.drawable.indoor12, R.drawable.indoor13,
            R.drawable.indoor1, R.drawable.indoor2, R.drawable.indoor3, R.drawable.indoor4, R.drawable.indoor5,
            R.drawable.indoor6, R.drawable.indoor7, R.drawable.indoor8, R.drawable.indoor9, R.drawable.indoor10,
            R.drawable.indoor11, R.drawable.indoor12, R.drawable.indoor13,
            R.drawable.indoor1, R.drawable.indoor2, R.drawable.indoor3, R.drawable.indoor4, R.drawable.indoor5,
            R.drawable.indoor6, R.drawable.indoor7, R.drawable.indoor8, R.drawable.indoor9, R.drawable.indoor10,
            R.drawable.indoor11, R.drawable.indoor12, R.drawable.indoor13

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
        setContentView(R.layout.activity_gallery5);

        viewPager = (ViewPager)findViewById(R.id.mvieww5);
        adapter = new ImageAdapter(Gallery5.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
