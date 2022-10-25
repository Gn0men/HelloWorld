package jp.ac.ecc.se.sys1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    final int CAMERA_RESULT = 100;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CAMERA_RESULT && resultCode == RESULT_OK){
            ImageView cameraImage = findViewById(R.id.cameraImage);
            /*
            Bitmap bitmap = data.getParcelableExtra("data");
            cameraImage.setImageBitmap(bitmap);
             */
            cameraImage.setImageURI(imageUri);
        }
    }
}