package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator
{
    public HashSet<Integer> createHashSet(List<Integer> sourceList)
    {
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++)
        {
            int value = sourceList.get(i);
            if (sourceList.get(i) % 2 == 0){
                while (value % 2 == 0){
                    resultSet.add(value);
                    value /= 2;
                }
                resultSet.add(value);
            } else {
                resultSet.add(sourceList.get(i));
                resultSet.add(sourceList.get(i)*2);
            }
        }
        return resultSet;
    }
}
