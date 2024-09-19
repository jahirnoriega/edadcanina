package com.example.jahir_doggy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edadedit = findViewById(R.id.edad_id);
        TextView resultexto = findViewById(R.id.resultado);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = edadedit.getText().toString();
                if(!edad.isEmpty()){
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadostring = "La edad de tu perro es: " + resultado + " años.";
                    resultexto.setText(resultadostring);
                }
            }
        });
    }
}