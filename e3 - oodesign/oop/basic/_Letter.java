package com.nbicocchi.exercises.oop.basic;

public class _Letter {
    String from;
    String to;
    StringBuilder lines;

    public _Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    public void addLine(String line) {
        lines.append(line).append("\n");
    }

    public String getText() {
        return "Dear " + to + "\n\n" + lines.toString() + "\n" + "Sincerely\n\n" + from;
    }


}
