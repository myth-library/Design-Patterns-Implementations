package design_patterns.behavioural_patterns.state;

public class Canvas {
    private ToolType currentType;

    // How to avoid same implementation repetition
    public void mouseDown() {
        if (currentType == ToolType.SELECTION)
            System.out.println("Selection Icon");
        else if (currentType == ToolType.BRUSH)
            System.out.println("Brush Icon");
        else if (currentType == ToolType.ERASER)
            System.out.println("Eraser Icon");
    }

    public void mouseUp() {
        if (currentType == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if (currentType == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if (currentType == ToolType.ERASER)
            System.out.println("Erase something");

    }

    public ToolType getCurrentType() {
        return currentType;
    }

    public void setCurrentType(ToolType currentType) {
        this.currentType = currentType;
    }
}
