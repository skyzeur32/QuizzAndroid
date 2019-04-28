package com.example.skyze.topquiz.modele;

import java.util.List;

public class Question {

    private String mQuestion;
    private List<String> mChoix;
    private int mIndexReponse;


    public Question(String mQuestion, List<String> mChoix, int mIndexReponse) {
        this.mQuestion = mQuestion;
        this.mChoix = mChoix;
        this.mIndexReponse = mIndexReponse;
    }

    public void setQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public void setChoix(List<String> mChoix) {
        this.mChoix = mChoix;
    }

    public void setIndexReponse(int mIndexReponse) {
        this.mIndexReponse = mIndexReponse;
    }

    public String getQuestion() {

        return mQuestion;
    }

    public List<String> getChoix() {
        return mChoix;
    }

    public int getIndexReponse() {
        return mIndexReponse;
    }
}
