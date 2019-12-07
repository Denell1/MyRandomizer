package org.mentorschools.myrandomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        }
    public void onButtonTap(android.view.View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "Random Number below",
                Toast.LENGTH_LONG);
        myToast.show();

            }

            public int getRandomNumberFor() {
        Random random ;
        random = new Random();
        return random.nextInt(0xFF);


            }
}
