package com.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Declaramos el widget de tipo ListView
    ListView listView;
    // Creamos un ArrayList con nombres para utilizarlo como datos estaticos
    List<String> names = new ArrayList<String>() {{
        add("Maria");
        add("Daniela");
        add("Alexandra");
        add("Maria");
        add("Daniela");
        add("Alexandra");
        add("Maria");
        add("Daniela");
        add("Alexandra");
        add("Maria");
        add("Daniela");
        add("Alexandra");
        add("Maria");
        add("Daniela");
        add("Alexandra");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instanciamos el widget ListView desde la vista
        listView = findViewById(R.id.listView);
        /*
         * Instanciamos el adaptador,
         * este necesita el contexto, un layout y la data.
         * Se puede utilizar un layout personalizado pero en este caso,
         * Utilizaremos un layout predeterminado del sistema Android que incluye scroll
         *
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        // La siguiente función se encarga de establecer los componente en el widget ListView
        listView.setAdapter(adapter);
        /*
         * El siguiente método nos permite integrar lógica al momento de hacer click en algun item,
         * Este método recibira el adaptador, la vista, la posición y el id del item
         * Con ayuda de lambda podemos escribir esté método de forma más limpia
         */
        listView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(MainActivity.this, names.get(position) + " pronto tendrá más información", Toast.LENGTH_SHORT).show());
    }
}