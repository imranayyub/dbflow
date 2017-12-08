package com.example.im.dbflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        name=(EditText)findViewById(R.id.name);
b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.b1:
            {
                TestModel testModel=new TestModel();
                testModel.setName(name.getText().toString());

                testModel.save();
//                testModel.insert();
                String na=testModel.getName();
                Toast.makeText(getApplicationContext(),na,Toast.LENGTH_SHORT).show();
                name.setText("");
                name.requestFocus();
            }
        }
    }
}
