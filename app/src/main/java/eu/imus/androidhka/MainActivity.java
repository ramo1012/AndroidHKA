package eu.imus.androidhka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
        Log.i ("TAG", "Hello World!");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
        Log.i ("TAG", "Hello World!");
    }
}