package com.clase.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MostrarActivity extends AppCompatActivity {
    private TextView txt_mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        txt_mostrar = (TextView)findViewById(R.id.tv_mostrar);
        Situacion s= (Situacion) getIntent().getSerializableExtra("situacion");
        txt_mostrar.setText("ASIGNATURA: "+s.getAsignatura()+"\nN1: " +s.getN1() + "\nN2: " +s.getN2() + "\nN3: " +s.getN3() + "\nN4: " +s.getN4() + "\nPromedio: " +s.getPromedio()+ "\nSituacion: " +s.getSituacion() );
    }
}
