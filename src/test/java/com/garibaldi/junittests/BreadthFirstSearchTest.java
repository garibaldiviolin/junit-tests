package com.garibaldi.junittests;

import static org.junit.Assert.assertEquals;

import com.garibaldi.junittests.BreadthFirstSearch;
import com.garibaldi.junittests.EmptyGraphException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BreadthFirstSearchTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowNullPointerException() throws EmptyGraphException {
        HashMap<String, String[]> graph = null;

        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Graph pointer is null.");
        ArrayList<String> path = BreadthFirstSearch.search("A", "D", graph);
    }

    @Test
    public void shouldThrowEmptyGraphException() throws EmptyGraphException {
        HashMap<String, String[]> graph = new HashMap<String, String[]>();

        expectedException.expect(EmptyGraphException.class);
        expectedException.expectMessage("Graph has no nodes.");
        ArrayList<String> path = BreadthFirstSearch.search("A", "D", graph);
    }

    @Test
    public void shouldFindPath() throws EmptyGraphException {
        HashMap<String, String[]> graph = new HashMap<String, String[]>();
        graph.put("A", new String[]{"B"});
        graph.put("B", new String[]{"C", "D"});
        graph.put("C", new String[]{"D"});
        graph.put("D", new String[]{"C"});

        ArrayList<String> expectedPath = new ArrayList<String>(
            Arrays.asList("A", "B", "D"));
        ArrayList<String> path = BreadthFirstSearch.search("A", "D", graph);
        assertEquals(path, expectedPath);
    }

}
