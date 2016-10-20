package edu.tecii.andrioid.p8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Pies, Met;
    private TextView Pulgada, Yardas, Metros, Millas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pies=(EditText)findViewById(R.id.pies);
        Met=(EditText)findViewById(R.id.met);
        Pulgada=(TextView)findViewById(R.id.pulgada);
        Yardas=(TextView)findViewById(R.id.yardas);
        Metros=(TextView)findViewById(R.id.metros);
        Millas=(TextView)findViewById(R.id.millas);

    }

    public void convertir (View view){

        String num= Pies.getText().toString();
        String num2=Met.getText().toString();
        float pulgada, yardas, metros, millas;
        float a=Float.parseFloat(num);
        float b=Float.parseFloat(num2);





        pulgada= (float) ((a*12)+ (b/0.0254));
        yardas= (float) ((a/3)+ (b*1.09361));
        metros= (float) ((a*0.3045)+ (b));
        millas= (float) ((a*0.00019)+ (b/0.0254));


        String res="";
        String res1="";
        String res2="";
        String res3="";

        res="Suma en pulgadas es"+pulgada+"\n";
        res1="Suma en yardas es"+yardas+"\n";
        res2="Suma en metros es"+metros+"\n";
        res3="Suma en millas es"+millas+"\n";






        Pulgada.setText(res);
        Yardas.setText(res1);
        Metros.setText(res2);
        Millas.setText(res3);













    }
}
