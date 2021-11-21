package V4.operation.area;

import V4.operation.Operation;

public interface AreaOperation extends Operation {
    @Override
    double execute(int[] size);
}
