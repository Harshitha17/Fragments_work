package com.example.harshitha.fragments_work;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText Edttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =  (Button)findViewById(R.id.button1);
        Edttext = (EditText)findViewById(R.id.Edttxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if  button is clicked then
                    String data = Edttext.getText().toString();
                    FragmentManager manager = getFragmentManager();  //create object for fragment manager
                    Fragment firstFragment = (Fragment) manager.findFragmentById(R.id.frag);
                    //and change the text of the fragment as the data that we got from edit text.
                    Fragment.changeText(data);

                }
        });

    }


}
