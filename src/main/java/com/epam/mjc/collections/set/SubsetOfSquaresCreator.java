package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> resultSet = new TreeSet<>();
        for (Integer str : sourceList)
        {
            double strSquare = Math.pow(str, 2);
            resultSet.add((int) strSquare);
        }
        resultSet = resultSet.subSet(lowerBound, true, upperBound, true);

        return resultSet;
    }
}
