package com.lei.learn.sprintBoot.knight;

/**
 * 强耦合例子
 */
public class DamselRescuingKnight implements Knight {

    private Quest quest;

    public DamselRescuingKnight() {

        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();

    }
}
