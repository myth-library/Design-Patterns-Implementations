package design_patterns.behavioural_patterns.state;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
