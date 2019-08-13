package com.lei.learn.sprintBoot.knight;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BraveKnightTest {
    @Mock
    private Quest quest;

    @Test
    public void knightShouldEmbarkOnQuest() {

        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        verify(quest, times(1)).embark();
    }
}
