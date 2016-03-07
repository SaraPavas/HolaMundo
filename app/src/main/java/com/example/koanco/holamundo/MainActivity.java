package com.example.koanco.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo;
    EditText eSubject;
    EditText eMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String to, Subject, message;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.aplicacion);

     eTo=(EditText)findViewById(R.id.eTo);
    eSubject=(EditText)(findViewById(R.id.eSubject));
        eMessage=(EditText)(findViewById(R.id.eMessage));
        Button bSend=(Button)findViewById(R.id.bSend);
        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to,subject,message;
                to=String.valueOf(eTo.getText());
                subject=String.valueOf(eSubject.getText());
                message=to+"y"+subject;
                eMessage.setText(message);


            }
        });
     }
}
