package com.example.viewpager_tiktok;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.myViewHolder>{
    ArrayList<VideoModel> videoModels;

    public VideoAdapter(ArrayList<VideoModel> videoModels) {
        this.videoModels = videoModels;
    }

    @Override
    public myViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.myViewHolder holder, int position) {
        holder.setData(videoModels.get(position));
    }

    @Override
    public int getItemCount() {
        return videoModels.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        VideoView mVideoView;
        TextView mTvTitle, mTvDesc;
        ProgressBar mProgressbar;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            initView(itemView);
        }

        private void initView(View itemView) {
            mVideoView =itemView.findViewById(R.id.videoView);
            mTvTitle = itemView.findViewById(R.id.tvVideoTitle);
            mTvDesc = itemView.findViewById(R.id.tvVideoDescription);
            mProgressbar = itemView.findViewById(R.id.progressbar);
        }

        void setData(VideoModel videoModel){
            mVideoView.setVideoPath(videoModel.getVideourl());
            mTvTitle.setText(videoModel.getVideoTitle());
            mTvDesc.setText(videoModel.getVideoDesc());

            mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mProgressbar.setVisibility(View.INVISIBLE);
                    mp.start();
                }
            });

            mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                }
            });

        }

    }
}
