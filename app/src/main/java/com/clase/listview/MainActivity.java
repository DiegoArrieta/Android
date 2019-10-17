package com.clase.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txt_n1, txt_n2, txt_n3, txt_n4;

    private ListView lv_asignaturas;

    static final String[] ASIGNATURAS = new String[] { "CALCULO", "PROGRAMACION", "BD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_n1 = (EditText)findViewById(R.id.edt_n1);
        txt_n2 = (EditText)findViewById(R.id.edt_n2);
        txt_n3 = (EditText)findViewById(R.id.edt_n3);
        txt_n4 = (EditText)findViewById(R.id.edt_n4);
        lv_asignaturas = (ListView)findViewById(R.id.lv_asignaturas);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ASIGNATURAS);
        lv_asignaturas.setAdapter(adapter);



        lv_asignaturas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < lv_asignaturas.getChildCount(); i++) {
                    if(position == i ){
                        lv_asignaturas.getChildAt(i).setBackgroundColor(Color.LTGRAY);
                    }else{
                        lv_asignaturas.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                    }
                }
                float n1, n2, n3, n4, prom;
                String situacion, opc;
                opc = adapter.getItem(position);
                n1 = Float.parseFloat(txt_n1.getText().toString());
                n2 = Float.parseFloat(txt_n2.getText().toString());
                n3 = Float.parseFloat(txt_n3.getText().toString());
                n4 = Float.parseFloat(txt_n4.getText().toString());
                Situacion s=new Situacion();
                prom = s.promedio(opc,n1,n2,n3,n4);
                s.setAsignatura(opc);
                s.setN1(n1);
                s.setN2(n2);
                s.setN3(n3);
                s.setN4(n4);
                s.setPromedio(prom);
                s.setSituacion(s.situacion(opc,prom));
                Intent i=new Intent(getApplicationContext(), MostrarActivity.class);
                i.putExtra("situacion", s);
                startActivity(i);


                Toast.makeText(MainActivity.this, opc, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
