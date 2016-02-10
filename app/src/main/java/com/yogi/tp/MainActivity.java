package com.yogi.tp;


import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.activeandroid.query.Select;
import mudelid.TeeObjekt;

public class MainActivity extends AppCompatActivity {
    EditText EtxtObjNimetus;
    EditText EtxtTeeNimetus;
    EditText EtxtTeeNr;
    EditText EtxtAlgusKm;
    EditText EtxtLoppKm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtxtObjNimetus = (EditText) findViewById(R.id.objekti_nimetus);
        EtxtTeeNimetus = (EditText) findViewById(R.id.tee_nimetus);
        EtxtTeeNr = (EditText) findViewById(R.id.tee_nr);
        EtxtAlgusKm = (EditText) findViewById(R.id.algus_km);
        EtxtLoppKm = (EditText) findViewById(R.id.lopp_km);
    }


    // salvesta nuppu vajutades läheb tööle
    public void save(View view) {
        String objNimetus = EtxtObjNimetus.getText().toString();
        String teeNimetus = EtxtTeeNimetus.getText().toString();
        int teeNr = Integer.parseInt(EtxtTeeNr.getText().toString());
        int algusKm = Integer.parseInt(EtxtAlgusKm.getText().toString());
        int loppKm = Integer.parseInt(EtxtLoppKm.getText().toString());

        TeeObjekt teeObjekt = new TeeObjekt(objNimetus, teeNimetus, teeNr, algusKm, loppKm);
        teeObjekt.save();
    }

    public void showAll(View view) {
        // Create an object of Select to issue a select query

        Select select = new Select();

        // Call select.all() to select all rows from our table which is
        // represented by Person.class and execute the query.

        // It returns an ArrayList of our Person objects where each object
        // contains data corresponding to a row of our database.

        List<TeeObjekt> teeObjektid = select.all().from(TeeObjekt.class).execute();

        // Iterate through the ArrayList to get all our data. We ll simply add
        // all the data to our StringBuilder to display it inside a Toast.

        StringBuilder builder = new StringBuilder();
        for (TeeObjekt teeObjekt : teeObjektid) {
            builder.append("Objekti nimetus: ")
                    .append(teeObjekt.objNimetus)
                    .append(" Tee nimetus: ")
                    .append(teeObjekt.teeNimetus)
                    .append("\n");
        }

        Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();

    }


}
