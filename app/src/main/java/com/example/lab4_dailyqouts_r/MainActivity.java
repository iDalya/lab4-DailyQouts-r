package com.example.lab4_dailyqouts_r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Qoute.qoutes);
        listView.setAdapter(arrayAdapter);

       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //position[i]
                Intent storyIntent = new Intent(MainActivity.this,Story.class);
                storyIntent.putExtra("storyNum",)
                startActivity(storyIntent);

            }
        });

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(getApplicationContext(), "You've selected item " + listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

        });*/
    }
}