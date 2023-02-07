package design_patterns;

import design_patterns.structural_patterns.adapter.*;
import design_patterns.structural_patterns.adapter.availableFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());

        // How to solve following type error using adapter pattern
        imageView.apply(new CaramelAdaptor(new Caramel()));

    }
}