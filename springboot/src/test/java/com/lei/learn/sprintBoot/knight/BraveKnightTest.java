package com.lei.learn.sprintBoot.knight;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
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
