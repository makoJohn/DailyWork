package collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.junit.MockitoJUnitRunner;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.when;

/**
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MyListTest {

    @Test
    public void listIsEmptyAfterConstruction() {
        // Arrange
        MyArrayList newList = new MyArrayList();

        // Act
        boolean isEmpty = newList.isEmpty();

        // Assert
        assertThat(isEmpty).isTrue();

        when(null).thenThrow();
    }
}
