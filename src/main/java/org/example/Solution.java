package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> zero = new ArrayList<>(List.of(1));
        if(rowIndex == 0) return zero;
        List<Integer> previous = new ArrayList<>(List.of(1,1));
        if(rowIndex == 1) return previous;
        while (rowIndex > 1) {
            List<Integer> current = new ArrayList<>();
            current.add(1);

            for (int i = 0; i < previous.size() - 1; i++) {
                current.add(previous.get(i) + previous.get(i + 1));
            }
            current.add(1);
            previous = current;
            rowIndex--;
        }
        return previous;
    }
}