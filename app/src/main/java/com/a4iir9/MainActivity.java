package com.a4iir9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static final String TAGNAME = MainActivity.class.getSimpleName();
    private static final String HTTP_URL ="https://belatar.name/rest/profile.php?login=test&passwd=test&id=9998" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAGNAME,"on est dans onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAGNAME,"on est dans onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAGNAME,"on est dans onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAGNAME,"on est dans onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAGNAME,"on est dans onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAGNAME,"on est dans onResume");

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, HTTP_URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
               // TAGNAME = (MainActivity.class.getSimpleName())
                Log.d(TAGNAME,response.toString());
            }
            },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAGNAME,error.toString());
            }
        });
        VolleySingleton.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectRequest);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAGNAME,"on est dans onRestart");
    }

    public void clickHander(View view) {
        Toast.makeText(this, "Boutton clické", Toast.LENGTH_SHORT).show();
    }
}