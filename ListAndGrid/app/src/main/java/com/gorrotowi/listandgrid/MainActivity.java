package com.gorrotowi.listandgrid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView listView;
    GridView gridView;
    EditText edtxSearch;
    ItemListAdapter adapter;
    ItemGridAdapter adapterGrid;
    ArrayList<ItemList> item, itemBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.customList);
        gridView = (GridView) findViewById(R.id.customGrid);
        edtxSearch = (EditText) findViewById(R.id.edtxSearch);

        itemBack = new ArrayList<>();

        adapter = new ItemListAdapter(this, R.layout.item_list, getData());
        adapterGrid = new ItemGridAdapter(this, R.layout.item_grid, getDataGrid());

        listView.setAdapter(adapter);
        gridView.setAdapter(adapterGrid);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView txtTitle = (TextView) view.findViewById(R.id.txtItemListTitle);
                Toast.makeText(MainActivity.this, txtTitle.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        edtxSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                itemBack.clear();
                for (int i = 0; i < item.size(); i++) {
                    if (item.get(i).getTitle().toLowerCase().contains(s.toString().toLowerCase())) {
                        itemBack.add(item.get(i));
                    }
                }
                if (itemBack.size() != 0) {
                    adapter = new ItemListAdapter(MainActivity.this, R.layout.item_list, itemBack);
                    listView.setAdapter(adapter);
                } else {
                    Toast.makeText(MainActivity.this, "No hay resultados con esta busqueda", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    private ArrayList<ItemGrid> getDataGrid() {
        ArrayList<ItemGrid> itemdatagrid = new ArrayList<>();
        itemdatagrid.add(new ItemGrid("Titulo 1", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 2", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 3", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 4", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 5", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 6", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 7", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 8", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 9", R.drawable.ic_launcher));
        itemdatagrid.add(new ItemGrid("Titulo 10", R.drawable.ic_launcher));
        return itemdatagrid;
    }

    private ArrayList<ItemList> getData() {
        item = new ArrayList<>();
        item.add(new ItemList("Titulo 1", "Subtitulo 1", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 2", "Subtitulo 2", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 3", "Subtitulo 3", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 4", "Subtitulo 4", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 5", "Subtitulo 5", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 6", "Subtitulo 6", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 7", "Subtitulo 7", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 8", "Subtitulo 8", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 9", "Subtitulo 9", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 10", "Subtitulo 10", R.drawable.ic_launcher));
        return item;
    }

}
