package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_sub); // コメントアウト
        setContentView(R.layout.activity_const); // 作成したレイアウトを適用
        // setContentView(R.layout.activity_const2);

        // setTitle("Sub Activity"); // 追加する

        // 画面上のパーツの宣言部
        TextView nameLabel = findViewById(R.id.nameLabel);
        EditText nameText１ = findViewById(R.id.nameText１);
        Button clearButton = findViewById(R.id.clearButton);
        Button confirmButton = findViewById(R.id.confirmButton);
        Button sendButton = findViewById(R.id.sendButton);

        nameLabel.setText("Name");

        sendButton.setOnClickListener(this);
        confirmButton.setOnClickListener(this);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               nameText１.setText("");
            }
        });
    }

    @Override
    public void onClick(View view) {
        setTitle("Button Clicked");

        switch (view.getId())
        {
            case R.id.confirmButton:
                setTitle("確認 Button Clicked");
                Toast.makeText(this,"確認クリック",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sendButton:
                setTitle("送信 Button Clicked");
                Toast.makeText(this,"送信クリック",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}