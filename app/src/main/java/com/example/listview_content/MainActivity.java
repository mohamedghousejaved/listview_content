package com.example.listview_content;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//     declaration
    ListView listView;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialization
        listView =findViewById(R.id.liist);


//        method calling
        arrayList=new ArrayList();

        arrayList.add("jafar");
        arrayList.add("syed");
        arrayList.add("sheik");

//        method calling
        arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(MainActivity.this, "jafar", Toast.LENGTH_SHORT).show();
                }
                if(i==1){
                    Toast.makeText(MainActivity.this, "SYED", Toast.LENGTH_SHORT).show();
                }
                if(i==2){
                    Toast.makeText(MainActivity.this, "sheik", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}