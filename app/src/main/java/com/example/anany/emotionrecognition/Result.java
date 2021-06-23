package com.example.anany.emotionrecognition;

import android.media.Image;

public class Result {
    double procenat;
    String emotion;
    Image pic;

    public Result() {
    }

    public Result(double procenat, String emotion, Image pic) {
        this.procenat = procenat;
        this.emotion = emotion;
        this.pic = pic;
    }

    public double getProcenat() {
        return procenat;
    }

    public void setProcenat(double procenat) {
        this.procenat = procenat;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public Image getPic() {
        return pic;
    }

    public void setPic(Image pic) {
        this.pic = pic;
    }
}
