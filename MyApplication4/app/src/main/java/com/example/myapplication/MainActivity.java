package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    CheckBox[] chk = new CheckBox[4];
    EditText[] num = new EditText[4];


    float[] price = new float[4];
    int n =4;

    public void onCacl(View v)
    {


        num[0] = findViewById(R.id.editApp);
        num[1] = findViewById(R.id.editStaw);
        num[2] = findViewById(R.id.editBlue);
        num[3] = findViewById(R.id.editPota);

        chk[0] = findViewById(R.id.checkApp);
        chk[1] = findViewById(R.id.checkStaw);
        chk[2] = findViewById(R.id.checkBlue);
        chk[3] = findViewById(R.id.checkPota);

        price[0] = 10.25f;
        price[1] = 20.25f;
        price[2] = 5.99f;
        price[3] = 17.22f;

        float sum = 0.0f;


        for (int i = 0; i < n; i++)
        {
            if ((chk[i].isChecked())&& !(num[i].getText().toString().equals("")))
            {
                int q = Integer.parseInt(num[i].getText().toString());
                float val = q * price[i];
                sum += val;
            }
        }
        Toast toast = Toast.makeText(getApplicationContext(),Float.toString(sum),Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }


}