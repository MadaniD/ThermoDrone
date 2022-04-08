package com.example.thermodrone;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity3 extends AppCompatActivity  {

    Button saveimage;


    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity4();
            }
        });
    }

    public void openMainActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
//        VideoView videoView = findViewById(R.id.videoView);
//        Uri vidUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video2);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        ImageView imageView = (ImageView) findViewById(R.id.imageView);

//        saveimage = (Button) findViewById(R.id.btn3);
//        ActivityCompat.requestPermissions(MainActivity3.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
//        ActivityCompat.requestPermissions(MainActivity3.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);


//        saveimage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                saveToGallery();
//            }


//        private void saveToGallery () {
//            BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
//            Bitmap bitmap = bitmapDrawable.getBitmap();
//            FileOutputStream outputStream = null;
//            File file = Environment.getExternalStorageDirectory();
//            File dir = new File(file.getAbsolutePath() + "/Mypics");
//            dir.mkdir();
//
//
//            String filename = String.format("%d.png", System.currentTimeMillis());
//            File outFile = new File(dir, filename);
//            try {
//                outputStream = new FileOutputStream(outFile);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
//
//            try {
//                outputStream.flush();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            try {
//                outputStream.close();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//
//            //videoView.setVideoURI(vidUri);
//
//        }
//        });
}


