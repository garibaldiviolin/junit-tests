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
        graph.put("B", new String[]{"C", "D"});
        graph.put("C", new String[]{"D"});
        graph.put("D", new String[]{"C"});

        ArrayList<String> expectedPath = new ArrayList<String>(
            Arrays.asList("A", "B", "D"));
        ArrayList<String> path = BreadthFirstSearch.search("A", "D", graph);
        assertEquals(path, expectedPath);
    }

}
