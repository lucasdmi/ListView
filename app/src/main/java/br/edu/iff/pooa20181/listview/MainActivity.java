package br.edu.iff.pooa20181.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.LvEquipes);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.equipes, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapter);
    }
}
