package design_patterns;

import design_patterns.behavioural_patterns.memento.Editor;
import design_patterns.behavioural_patterns.memento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}