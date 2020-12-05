package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runFirst = new Runner("Runner1");
        Runner runSecond = new Runner("Runner2");
        Runner runThird = new Runner("Runner3");
        Runner runForth = new Runner("Runner4");
        Runner runFifth = new Runner("Runner5");
        runFirst.setRuns(runFifth, runSecond);
        runSecond.setRuns(runFirst, runThird);
        runThird.setRuns(runSecond, runForth);
        runForth.setRuns(runThird, runFifth);
        runFifth.setRuns(runForth, runFirst);
        runFirst.start();
    }
}