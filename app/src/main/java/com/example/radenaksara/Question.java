package com.example.radenaksara;

import android.widget.ImageView;

public class Question {
    private Integer imageQusetion;
    private String question;
    private String oprion1;
    private String option2;
    private String option3;

    public Question(){}

    public Question(Integer imageQusetion, String question, String oprion1, String option2, String option3, String option4, int answer) {
        this.imageQusetion = imageQusetion;
        this.question = question;
        this.oprion1 = oprion1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    private String option4;
    private int answer;

    public Integer getImageQusetion() {
        return imageQusetion;
    }

    public void setImageQusetion(Integer imageQusetion) {
        this.imageQusetion = imageQusetion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOprion1() {
        return oprion1;
    }

    public void setOprion1(String oprion1) {
        this.oprion1 = oprion1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
