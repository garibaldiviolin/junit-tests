package com.garibaldi.junittests;

import static org.junit.Assert.assertEquals;

import com.garibaldi.junittests.BreadthFirstSearch;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class BreadthFirstSearchTest {

    @Test
    public void shouldFindPath() {
        HashMap<String, String[]> graph = new HashMap<String, String[]>();
        graph.put("A", new String[]{"B"});
        graph.put("B", new String[]{"C"});
        graph.put("C", new String[]{});

        ArrayList<String> expectedPath = new ArrayList<String>(
            Arrays.asList("A", "B", "C"));
        ArrayList<String> path = BreadthFirstSearch.search("A", "C", graph);
        assertEquals(path, expectedPath);
    }

}
