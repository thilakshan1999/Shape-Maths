package ShapeMaths.V4.UI;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class UserInterfaceTest {

    @Test
    public void printArgument() {
        UserInterface userInterface = mock(UserInterface.class);
        userInterface.print("hi");
        verify(userInterface, times(1)).print("hi");
    }

}