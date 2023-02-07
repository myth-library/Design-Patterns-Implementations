package design_patterns.structural_patterns.adapter;

import design_patterns.structural_patterns.adapter.availableFilters.Caramel;

// Following method (composition) is better than CaramelAdaptor2
public class CaramelAdaptor implements Filter {
    private Caramel caramel;

    public CaramelAdaptor(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
