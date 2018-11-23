package com.pierogranda.proyectointegrador12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {
CardView car1,car2,car3,car4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        CardView car1=(CardView)findViewById(R.id.Car1);
        CardView car2=(CardView)findViewById(R.id.Car2);
        CardView car3=(CardView)findViewById(R.id.Car3);
        CardView car4=(CardView)findViewById(R.id.Car4);

        car1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (v.getContext(),Pasantias.class);
                startActivityForResult(intent1, 0);
            }
        });
        car2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(),Practica.class);
                startActivityForResult(intent2, 0);
            }
        });
        car3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent (v.getContext(),Estadisticas.class);
                startActivityForResult(intent3, 0);
            }
        });
        car4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent (v.getContext(),DescripcionAlumno.class);
                startActivityForResult(intent4, 0);
            }
        });


    }
}
