package com.example.skyze.topquiz.modele;

import java.util.Collections;
import java.util.List;

public class ListeQuestions {

    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public ListeQuestions(List<Question> questionList) {
        mQuestionList = questionList;

        // Shuffle the question list
        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        // Ensure we loop over the questions
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }

        // Please note the post-incrementation
        return mQuestionList.get(mNextQuestionIndex++);
    }

}
