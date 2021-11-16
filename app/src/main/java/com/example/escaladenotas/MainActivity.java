package com.example.escaladenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Asignacion
    Button btn_generar = (Button) this.findViewById(R.id.btn_generar);
    TextView editTextNumber= (TextView) this.findViewById(R.id.editTextNumber);
    TextView editTextNumber2= (TextView) this.findViewById(R.id.editTextNumber2);
    TextView editTextNumber3= (TextView) this.findViewById(R.id.editTextNumber3);
    TextView editTextNumber4= (TextView) this.findViewById(R.id.editTextNumber4);
    TextView resiclerView= (TextView) this.findViewById(R.id.resiclerView);

    private Object fileList(int resiclerView) {
        return null;
    }
}
