package ca.northviewheights.robotics.supremesafety;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.method.LinkMovementMethod;
import android.text.Html;
import ca.northviewheights.robotics.supremesafety.BuildConfig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Futura.ttf");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setTypeface(typeface);
        TextView qNumber = (TextView) findViewById(R.id.textView2);
        TextView qNumber1 = (TextView) findViewById(R.id.author);
//        qNumber.setText( HttpUtils.getQuote());
        HttpUtils.getQuote(qNumber,qNumber1);
//        TextView textView2 = (TextView) findViewById(R.id.textView4);
//        textView2.setTypeface(typeface);
//        TextView textView3 = (TextView) findViewById(R.id.textView5);
//        textView3.setTypeface(typeface);
//        Button buttonA = (Button) findViewById(R.id.button);
//        buttonA.setTypeface(typeface);
//        TextView version = (TextView) findViewById(R.id.textView9);
//        version.setText("Version: " + BuildConfig.VERSION_NAME);
//        TextView website =(TextView)findViewById(R.id.textView13);
//        website.setClickable(true);
//        website.setMovementMethod(LinkMovementMethod.getInstance());
//        String link = "<a href='https://rebrand.ly/supreme'> Website </a>";
//        website.setText(Html.fromHtml(link));
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
    }
    public void goToActivity1 (View view){
        Intent intent = new Intent (this, Gallery4.class);
        startActivity(intent);
    }

    public void goToActivity2 (View view){
        Intent intent = new Intent (this, Gallery3.class);
        startActivity(intent);
    }

    private void CopyReadAssets(String name)
    {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(), name);
        try
        {
            in = assetManager.open(name);
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/" + name),
                "application/pdf");

        startActivity(intent);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }

    public void goToActivity4 (View view){
        Intent intent = new Intent (this, Gallery5.class);
        startActivity(intent);
    }

    public void goToActivity3 (View view){
        Intent intent = new Intent (this, Gallery6.class);
        startActivity(intent);
    }

    public void goToActivity5 (View view){
        Intent intent = new Intent (this, Gallery.class);
        startActivity(intent);
    }

    public void goToActivity6 (View view){
        Intent intent = new Intent (this, Gallery2.class);
        startActivity(intent);
    }


}
