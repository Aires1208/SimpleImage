package com.alibaba.simpleimage.analyze.search.tree;

import com.alibaba.simpleimage.analyze.search.cluster.Clusterable;

import java.util.List;

public interface VocabularyTree {
    public List<Float> getCurrentWords();

    public List<Integer> getVisualWords(List<? extends Clusterable> imagePoint);

    public void reset();
}
