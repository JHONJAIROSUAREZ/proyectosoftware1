package com.example.jj.proyectosoftware1.Categorias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jj.proyectosoftware1.R;

public class Dulceria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dulceria);

        ListView mListView = (ListView) findViewById (R.id.clientList);

        mListView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                //Cliente client = recipeList.elementAt(i);
                //client.id


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
// 1
        //final ArrayList <CLient> recipeList = Recipe.getRecipesFromFile ( " recipes.json " , this );
// 2
        String [] listItems = new String [3];
// 3
        for ( int i = 0 ; i < 3; i++) {
            //Receta receta = recetaLista.get (i);
            listItems [i] = ("prueba" + i);
        }
// 4
        ArrayAdapter adapter = new ArrayAdapter ( this , android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter (adapter);


    }
}
