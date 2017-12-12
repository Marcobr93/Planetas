package org.marco.planets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.marco.planets.model.Planet;

public class DetailActivity extends AppCompatActivity {

    ImageView mImagenImageView;
    ImageView mSimboloImageView;
    TextView mNombreTextView;
    TextView mdistanciaSolTextView;
    TextView mRelacionTierraTextView;
    TextView mVolumenTextView;
    TextView mMasaTextView;
    TextView mSatelitesTextView;
    TextView mVelocidadEscapeTextView;
    Planet mPlanet = new Planet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mImagenImageView = findViewById(R.id.planet_imagen_image_view);
        mSimboloImageView = findViewById(R.id.planet_simbolo_image_view);
        mNombreTextView = findViewById(R.id.planet_nombre_text_view);
        mdistanciaSolTextView = findViewById(R.id.planet_distancia_sol_text_view);
        mRelacionTierraTextView = findViewById(R.id.planet_relacion_tierra_text_view);
        mVolumenTextView = findViewById(R.id.planet_volumen_text_view);
        mMasaTextView = findViewById(R.id.planet_masa_text_view);
        mSatelitesTextView = findViewById(R.id.planet_satelites_naturales_text_view);
        mVelocidadEscapeTextView = findViewById(R.id.planet_velocidad_escape_text_view);

        Intent detailIntent = DetailActivity.this.getIntent();

        if (detailIntent.hasExtra("planet")){
            mPlanet = (Planet) detailIntent.getSerializableExtra("planet");
        }

        Picasso.with(this).load(mPlanet.getImagen()).into(mImagenImageView);
        Picasso.with(this).load(mPlanet.getSimbolo()).into(mSimboloImageView);
        mNombreTextView.setText(mPlanet.getNombrePlaneta());
        mdistanciaSolTextView.setText(String.valueOf(mPlanet.getDistanciaSol()));
        mRelacionTierraTextView.setText(String.valueOf(mPlanet.getRelacionSuperficieTierra()));
        mVolumenTextView.setText(mPlanet.getVolumen());
        mMasaTextView.setText(mPlanet.getMasa());
        mSatelitesTextView.setText(String.valueOf(mPlanet.getSatelitesNaturales()));
        mVelocidadEscapeTextView.setText(String.valueOf(mPlanet.getVelocidadEscape()));
    }

}
