//package com.java2s;
//License from project: Apache License

import java.util.*;

public class q3 {
    public static <T> List<Map<String, T>> permutations(Map<String, List<T>> parameterValues) {
        List<Map<String, T>> list = new ArrayList<Map<String, T>>();
        if (parameterValues == null || parameterValues.size() == 0) {
            return list;
        }/*from w ww . ja  v a 2  s.  co  m*/

        permute(new HashMap<String, T>(), new ArrayList<String>(parameterValues.keySet()), parameterValues, list);

        return list;

    }

    private static <T> void permute(Map<String, T> basePermutation, List<String> remainingKeys,
                                    Map<String, List<T>> parameterValues, List<Map<String, T>> returnList) {

        String thisKey = remainingKeys.get(0);
        remainingKeys = remainingKeys.subList(1, remainingKeys.size());
        for (T value : parameterValues.get(thisKey)) {
            Map<String, T> permutation = new HashMap<String, T>(basePermutation);

            permutation.put(thisKey, value);

            if (remainingKeys.size() == 0) {
                returnList.add(permutation);
            } else {
                permute(permutation, remainingKeys, parameterValues, returnList);
            }
        }
    }
}