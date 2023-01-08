package org.example;

import org.example.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    @org.junit.jupiter.api.Test
    public void analyseMood() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood= moodAnalyser.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
