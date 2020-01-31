package com.example.rubyatfifa;

public class Hero {
    private String name;
    private String winning_rate;

    public Hero(String name, String winning_rate) {
        this.name = name;
        this.winning_rate = winning_rate;
    }

    public String getName() {
        return name;
    }


    public String getwinning_rate() {
        return winning_rate;
    }


}
