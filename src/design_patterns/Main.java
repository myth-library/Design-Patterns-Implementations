package design_patterns;

import design_patterns.behavioural_patterns.memento.Editor;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();

        // How to implement following scenario
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
    }
}