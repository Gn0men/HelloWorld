package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        // 呼び画面から
        Intent intent = getIntent();
        int age = intent.getIntExtra("age",25);

        // 確認
        Toast.makeText(this,"年齢" + age, Toast.LENGTH_SHORT).show();

        // 画面のパーツを登録
        TextView profielText = findViewById(R.id.profielText);
        EditText nameText4 = findViewById(R.id.nameText4);
        EditText password = findViewById(R.id.passText);
        Button clearN = findViewById(R.id.clearN);
        Button clearP = findViewById(R.id.clearP);
        CheckBox check10 = findViewById(R.id.check10);
        CheckBox check20 = findViewById(R.id.check20);
        CheckBox check30 = findViewById(R.id.check30);
        RadioButton man_rb2 = findViewById(R.id.man_rb2);
        RadioButton woman_rb2 = findViewById(R.id.woman_rb2);
        Button kakuninButton = findViewById(R.id.kakuninButton);

        clearN.setOnClickListener(this);
        clearP.setOnClickListener(this);
        kakuninButton.setOnClickListener(this);

//        clearN.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                setTitle(password.getText());
//                return false;
//            }
//        });

        clearP.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                setTitle(password.getText());
                return false;
            }
        });
        kakuninButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (man_rb2.isChecked() == true) {
                    Toast.makeText(getApplicationContext(), R.string.man, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), R.string.woman, Toast.LENGTH_SHORT).show();
                }
                finish(); // 画面を変える

                return false;
            }
        });
    }

        @Override
        public void onClick(View view){
            EditText nameText4 = findViewById(R.id.nameText4);
            EditText password = findViewById(R.id.passText);
           switch (view.getId()){
               case R.id.clearN:
                   nameText4.setText("");
                   break;
               case R.id.clearP:
                   password.setText("");
                   setTitle(R.string.app_name);
                   break;
               case R.id.kakuninButton:
                   Toast.makeText(this,nameText4.getText(),Toast.LENGTH_SHORT).show();
                   break;
               }
            }
        }