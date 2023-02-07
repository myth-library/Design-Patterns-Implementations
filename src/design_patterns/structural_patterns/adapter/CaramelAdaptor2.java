package design_patterns.structural_patterns.adapter;

import design_patterns.structural_patterns.adapter.availableFilters.Caramel;

public class CaramelAdaptor2 extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
