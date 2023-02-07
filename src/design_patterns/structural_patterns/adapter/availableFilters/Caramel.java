package design_patterns.structural_patterns.adapter.availableFilters;

import design_patterns.structural_patterns.adapter.Image;

public class Caramel {
    public void init() {}

    public void render(Image image) {
        System.out.println("Applying Caramel Filter");
    }
}
