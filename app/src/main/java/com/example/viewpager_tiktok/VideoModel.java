package com.example.viewpager_tiktok;

public class VideoModel  {

    String videourl, videoTitle, videoDesc;

    public VideoModel(String videourl, String videoTitle, String videoDesc) {
        this.videourl = videourl;
        this.videoTitle = videoTitle;
        this.videoDesc = videoDesc;
    }

    public String getVideourl() {
        return videourl;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }
}
