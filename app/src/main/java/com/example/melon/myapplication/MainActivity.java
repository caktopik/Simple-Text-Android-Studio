package com.example.melon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_submitOnClick(View v)
    {
        //((TextView)findViewById(R.id.fullscreen_content)).setText("Your Text");
        TextView output_txt = (TextView) findViewById(R.id.txt_output);
        TextView input_txt = (TextView) findViewById(R.id.txt_input);
        output_txt.setText(input_txt.getText());
    }

    public void btn_clearOnClick(View v)
    {
        TextView output_txt = (TextView) findViewById(R.id.txt_output);
        TextView input_txt = (TextView) findViewById(R.id.txt_input);
        output_txt.setText("");
        input_txt.setText("");
    }

    public void btn_transferOnClick(View v)
    {
        //TextView output_txt = (TextView) findViewById(R.id.txt_output);
        TextView input_txt = (TextView) findViewById(R.id.txt_input);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        String message = input_txt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
