package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class DummyBotTest {

    @Test
    public void answerHi() {
        String in = "Привет, Бот.";
        String out = "Привет, умник.";
        String rsl = DummyBot.answer(in);
        Assert.assertEquals(out, rsl);
    }

    @Test
    public void answerBye() {
        String in = "Пока.";
        String out = "До скорой встречи.";
        String rsl = DummyBot.answer(in);
        Assert.assertEquals(out, rsl);
    }

    @Test
    public void answerOther() {
        String in = "Что лучше, Java или C#?";
        String out = "Это ставит меня в тупик. Задайте другой вопрос.";
        String rsl = DummyBot.answer(in);
        Assert.assertEquals(out, rsl);
    }
}