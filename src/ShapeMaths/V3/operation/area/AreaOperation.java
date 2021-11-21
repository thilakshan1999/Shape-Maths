package V3.operation.area;

import V3.operation.Operation;

public interface AreaOperation extends Operation {
    @Override
    double execute(int[] size);
}
