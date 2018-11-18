package me.firdaus1453.homeworkintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindahHalaman = findViewById(R.id.btnPindahHalaman);
        Button btnShare = findViewById(R.id.btnShare);

        btnPindahHalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Implicit untuk share ke sosmed
                Intent intent = new Intent(Intent.ACTION_SEND);
                // Mengisi pesan yang ingin di share
                intent.putExtra(intent.EXTRA_TEXT,"Hallo i can share to Social Media");
                intent.setType("text/plain");

                // Menjalankan perintah Intent Implicit
                startActivity(Intent.createChooser(intent,"Share to : "));
            }
        });
    }
}
