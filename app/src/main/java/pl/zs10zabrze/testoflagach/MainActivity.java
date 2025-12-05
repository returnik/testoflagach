package pl.zs10zabrze.testoflagach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int licznikprzyciskow;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.polecenia);
    }

    public void ukryj(View view) {
        view.setVisibility(View.INVISIBLE);
        licznikprzyciskow++;
        if(licznikprzyciskow == 4){
            Toast.makeText(this, "Brawo to flaga POLSKI", Toast.LENGTH_SHORT).show();
            TextView.setText("Brawo to jest flaga polski");
        }
    }

    public void ok(View view) {
        Toast.makeText(this, "Ten kolor musi zostać w fladze POLSKI", Toast.LENGTH_SHORT).show();
    }

}