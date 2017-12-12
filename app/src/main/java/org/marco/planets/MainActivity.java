package org.marco.planets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import org.marco.planets.model.Planet;

import java.util.ArrayList;
import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    ListView mListViewPlanets;
    ArrayList<Planet> mListaPlanets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListViewPlanets = findViewById(R.id.list_view_planets);

        final ArrayAdapter<Planet> adapter = new ArrayAdapter<Planet>(
                this,
                R.layout.list_item_planet,
                R.id.text_view_planets,
                mListaPlanets

        );

        mListViewPlanets.setAdapter(adapter);

        mListViewPlanets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("planet", mListaPlanets.get(position));
                startActivity(detailIntent);
            }
        });

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://sheltered-earth-72241.herokuapp.com/api/planets", new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.e("MainActivity","Fallo al conectarse a la API " + responseString);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.d("MainActivity", "OK->Response:" + responseString);
                Gson gson = new GsonBuilder().create();
                Planet[] planets = gson.fromJson(responseString, Planet[].class);
                adapter.clear();
                for(Planet planet: planets){
                    adapter.add(planet);
                }
            }
        });

    }
}
