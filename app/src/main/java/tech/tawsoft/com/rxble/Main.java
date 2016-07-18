package tech.tawsoft.com.rxble;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import tech.tawsoft.com.rxble.WebApi.GetApi;
import tech.tawsoft.com.rxble.WebApi.SubmitResponse;

/**
 * Created by server 2 on 7/15/2016.
 */
public class Main extends AppCompatActivity {

    private static final String TAG = "Result";
    Retrofit retrofit;
    TextView total1;

    Button btnAdd, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = (Button) findViewById(R.id.bttnadd);
        btnSubmit = (Button) findViewById(R.id.bttnsubmit);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Home.class);
                startActivity(intent);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                List<ScaleData> data = ScaleData.findWithQuery(ScaleData.class, "SELECT * FROM DATA");

                if(data.size()>0)
                {
                    ScaleData c=data.get(0);


                }
                else{

                }
            }
        });

    }
}