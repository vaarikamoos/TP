package com.yogi.tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EsilehtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esileht);
    }

    // kui vajutatakse "uus objekt" nupule
    public void nupuvajutusUusObjekt(View view) {
        Intent intent = new Intent(this, UusObjektActivity.class);
        startActivity(intent);
    }

    // kui vajutatakse "Vaata objekte" nupule
    public void nupuvajutusObjektideNimekiri(View view) {
        Intent intent = new Intent(this, ObjektideNimekiriActivity.class);
        startActivity(intent);
    }


}
