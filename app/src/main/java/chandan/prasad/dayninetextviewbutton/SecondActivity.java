package chandan.prasad.dayninetextviewbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);


        //define all the Buutons
        Button go_back = findViewById(R.id.go_bck_buuton);
        final Button start_show = findViewById(R.id.start_show_btn);

        //get the text from our edit text


        //add on click methond on the go back button
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(SecondActivity.this,MainActivity.class);
              startActivity(intent);
            }
        });

        // add on clcik on the start buuton to open newactivity
        start_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText message = findViewById(R.id.text);
                final String text_message = message.getText().toString();

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("text",text_message);
                startActivity(intent);

            }
        });

    }
}
