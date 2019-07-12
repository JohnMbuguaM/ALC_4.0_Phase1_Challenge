package mbugamuthoni.com;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        We are going to make the buttons and the image view local
        Button buttonAbout =  findViewById(R.id.button_about);
        Button buttonProfile =  findViewById(R.id.button_profile);
        ImageView imageViewExit =  findViewById(R.id.imageExit);

//        setting the onclick listeners

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "welcome to ALC community", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/ "));
                startActivity(intent);
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, My_ProfileActivity.class);
                startActivity(intent);
            }
        });

        imageViewExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
