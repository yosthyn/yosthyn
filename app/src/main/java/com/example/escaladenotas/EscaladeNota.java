package com.example.escaladenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

class EscaladeNotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escaladenotas_main);
    // Asignacion
        ImageButton btn_retroceder = (ImageButton) this.findViewById(R.id.btn_retroceder);
        TextView getAutoCompleteTextView= (TextView) this.findViewById(R.id.autoCompleteTextView);
        TextView getAutoCompleteTextView2= (TextView) this.findViewById(R.id.autoCompleteTextView2);
        TextView getAutoCompleteTextView3= (TextView) this.findViewById(R.id.autoCompleteTextView3);
        TextView getAutoCompleteTextView4= (TextView) this.findViewById(R.id.autoCompleteTextView4);
        TextView getAutoCompleteTextView5= (TextView) this.findViewById(R.id.autoCompleteTextView5);
        TextView getAutoCompleteTextView6= (TextView) this.findViewById(R.id.autoCompleteTextView6);
        TextView getAutoCompleteTextView7= (TextView) this.findViewById(R.id.autoCompleteTextView7);
        TextView getAutoCompleteTextView8= (TextView) this.findViewById(R.id.autoCompleteTextView8);
        TextView getAutoCompleteTextView9= (TextView) this.findViewById(R.id.autoCompleteTextView9_display);
        TextView getAutoCompleteTextView10= (TextView) this.findViewById(R.id.autoCompleteTextView10_display);
        TextView autoCompleteTextView9_display = (TextView) this.findViewById(R.id.autoCompleteTextView9_display);
        TextView autoCompleteTextView10_display = (TextView) this.findViewById(R.id.autoCompleteTextView10_display);
    }
}
