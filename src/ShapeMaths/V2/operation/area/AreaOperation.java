package V2.operation.area;

import V2.operation.Operation;

public interface AreaOperation extends Operation {
    @Override
    double execute(int[] size);
}
