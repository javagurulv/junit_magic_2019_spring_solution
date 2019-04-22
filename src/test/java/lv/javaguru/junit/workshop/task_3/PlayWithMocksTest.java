package lv.javaguru.junit.workshop.task_3;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatcher;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.argThat;

public class PlayWithMocksTest {

    @Test
    public void test1() {
        List list = Mockito.mock(List.class);
    }

    @Test
    public void test2() {
        List list = Mockito.mock(List.class);
        assertEquals(list.size(), 0);
        assertEquals(list.isEmpty(), false);
        assertEquals(list.get(0), null);
    }

    @Test
    public void test3_and_4() {
        List list = Mockito.mock(List.class);

        Mockito.when(list.size()).thenReturn(1);
        assertEquals(list.size(), 1);

        Mockito.when(list.isEmpty()).thenReturn(true);
        assertEquals(list.isEmpty(), true);

        Mockito.when(list.get(0)).thenReturn("Java");
        assertEquals(list.get(0), "Java");
    }

    @Test
    public void test5() {
        List list = Mockito.mock(List.class);
        Mockito.verify(list, Mockito.times(0)).size();
        list.size();
        Mockito.verify(list, Mockito.times(1)).size();
        list.size();
        Mockito.verify(list, Mockito.times(2)).size();
    }

    @Test
    public void test6() {
        List list = Mockito.mock(List.class);
        Mockito.verifyZeroInteractions(list);
    }

    @Test
    public void test7() {
        List list = Mockito.mock(List.class);
        list.size();
        list.isEmpty();
        InOrder inOrder = Mockito.inOrder(list);
        inOrder.verify(list).size();
        inOrder.verify(list).isEmpty();
    }

    @Test
    public void test8() {
        List list = Mockito.mock(List.class);
        list.add("Java");
        Mockito.verify(list).add("Java");
        Mockito.verify(list).add(Mockito.anyString());
        Mockito.verify(list).add(Mockito.any(String.class));
    }

    @Test
    public void test9() {
        List list = Mockito.mock(List.class);
        list.add("Java");
        Mockito.verify(list).add(argThat(new CustomArgumentMatcher("Java")));
    }

    private class CustomArgumentMatcher implements ArgumentMatcher<String> {

        private String arg;

        public CustomArgumentMatcher(String arg) {
            this.arg = arg;
        }

        @Override
        public boolean matches(String s) {
            return arg.equals(s);
        }
    }

    @Test
    public void test10() {
        List list = Mockito.mock(List.class);
        list.add("Java");
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        Mockito.verify(list).add(argument.capture());
        assertEquals("Java", argument.getValue());
    }

}
