package ca.northviewheights.robotics.supremesafety;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Gallery3 extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5,
            R.drawable.meme6, R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10,
            R.drawable.meme11, R.drawable.meme12, R.drawable.meme13, R.drawable.meme14, R.drawable.meme15,
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5,
            R.drawable.meme6, R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10,
            R.drawable.meme11, R.drawable.meme12, R.drawable.meme13, R.drawable.meme14, R.drawable.meme15,
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5,
            R.drawable.meme6, R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10,
            R.drawable.meme11, R.drawable.meme12, R.drawable.meme13, R.drawable.meme14, R.drawable.meme15,
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5,
            R.drawable.meme6, R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10,
            R.drawable.meme11, R.drawable.meme12, R.drawable.meme13, R.drawable.meme14, R.drawable.meme15,

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
        setContentView(R.layout.activity_gallery3);

        viewPager = (ViewPager)findViewById(R.id.mvieww3);
        adapter = new ImageAdapter(Gallery3.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
