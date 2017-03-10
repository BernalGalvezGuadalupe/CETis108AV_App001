package mx.edu.cetis108.cetis108av_app0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static mx.edu.cetis108.cetis108av_app0001.R.id.text1;
import static mx.edu.cetis108.cetis108av_app0001.R.id.text2;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MostrarTexto(View v){
        text1 = (EditText)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);

        String a = text1.getText().toString();
        text2.setText(a);
        Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();

    }

}

