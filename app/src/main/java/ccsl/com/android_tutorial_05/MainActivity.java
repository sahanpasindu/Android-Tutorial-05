package ccsl.com.android_tutorial_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Create button object
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link java button with xml button
        button = findViewById(R.id.btnOne);

        // Set listener to the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent
                Intent i = new Intent(getApplicationContext(),ActivityTwo.class);
                // Launch the activity two
                startActivity(i);
            }
        });

    }

//    public void onClick(View view) {
//        Intent i = new Intent(this,ActivityTwo.class);
//        startActivity(i);
//    }
}
