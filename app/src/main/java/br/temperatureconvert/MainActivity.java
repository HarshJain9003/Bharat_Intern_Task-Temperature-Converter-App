package br.temperatureconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = findViewById(R.id.buttonConvert);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                EditText editText=findViewById(R.id.editTextCelsius);
                String temp = editText.getText().toString();
                ConvertTemp cv = new ConvertTemp();
                double f = cv.celsiusToFahrenheit(Double.parseDouble(temp));
                double k = cv.celsiusToKelvin(Double.parseDouble(temp));

                EditText fa = findViewById(R.id.editTextFahreinheit);
                fa.setText(String.valueOf(f));

                EditText ke = findViewById(R.id.editTextKelvin);
                ke.setText(String.valueOf(k));
            }
        });
    }
}