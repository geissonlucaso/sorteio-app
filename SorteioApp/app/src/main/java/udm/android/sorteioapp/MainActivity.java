package udm.android.sorteioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {
        Random gerador = new Random();
        int numero = gerador.nextInt(11);

        TextView resultado = findViewById(R.id.txtResultado);
        resultado.setText("Número sorteado: " + numero);
    }
}