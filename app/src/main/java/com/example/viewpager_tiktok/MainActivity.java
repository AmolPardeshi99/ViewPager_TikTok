package com.example.viewpager_tiktok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    ArrayList<VideoModel> videoModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager2 = findViewById(R.id.viewpager);
        videoModels = new ArrayList<>();

        VideoModel videoModel = new VideoModel("https://www.dropbox.com/s/df2d2gf1dvnr5uj/Sample_1280x720_mp4.mp4","Title1","This is description of first video.");
        videoModels.add(videoModel);

        VideoModel videoModel2 = new VideoModel("https://www.dropbox.com/s/s1rc65usypfacde/Sample_1280x720_webm.webm","Title2","This is description of first video.");
        videoModels.add(videoModel2);

        VideoModel videoModel3 = new VideoModel("https://docjamal.xyz/wp-content/upload/2020/08/video4.mp4","Title3","This is description of first video.");
        videoModels.add(videoModel3);

        VideoModel videoModel4 = new VideoModel("https://docjamal.xyz/wp-content/upload/2020/08/video5.mp4","Title4","This is description of first video.");
        videoModels.add(videoModel4);

        VideoModel videoModel5 = new VideoModel("https://docjamal.xyz/wp-content/upload/2020/08/video6.mp4","Title5","This is description of first video.");
        videoModels.add(videoModel5);

        VideoModel videoModel6 = new VideoModel("https://docjamal.xyz/wp-content/upload/2020/08/video10.mp4","Title6","This is description of first video.");
        videoModels.add(videoModel6);

        viewPager2.setAdapter(new VideoAdapter(videoModels));
    }

}