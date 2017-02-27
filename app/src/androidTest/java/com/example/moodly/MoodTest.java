package com.example.moodly;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by mliew on 2017-02-25.
 */

public class MoodTest extends ActivityInstrumentationTestCase2{
    public MoodTest() {
        super(MoodHolder.class);
    }

    public void testAddMood(){
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        String owner = "Harambe";
        String trigger = "Banana";
        String reasonText = "Ate a banana";
        mood.setOwner(owner);
        mood.setEmotion(emotion);
        mood.setTrigger(trigger);
        mood.setReasonText(reasonText);
        moodList.add(mood);
        assertTrue(moodList.contains(mood));
    }

    public void testChooseEmotionalState() {
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        mood.setEmotion(emotion);
        moodList.add(mood);
        assertEquals(moodList.get(moodList.size()-1).getEmotion(),emotion);
    }

    public void testAddTextReason() {
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String textReason = "Happy";
        mood.setReasonText(textReason);
        moodList.add(mood);
        assertEquals(moodList.get(moodList.size()-1).getReasonText(),textReason);
    }

    public void testAddSocialSituation() {
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String location = "Cincinnatti";
        mood.setLocation(location);
        moodList.add(mood);
        assertEquals(moodList.get(moodList.size()-1).getLocation(),location);
    }

    public void testAddLocation() {
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        mood.setEmotion(emotion);
        moodList.add(mood);
        assertEquals(moodList.get(moodList.size()-1).getEmotion(),emotion);
    }

    public void testViewMoodDetails(){
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        String owner = "Harambe";
        String trigger = "Banana";
        String reasonText = "Ate a banana";
        mood.setOwner(owner);
        mood.setEmotion(emotion);
        mood.setTrigger(trigger);
        mood.setReasonText(reasonText);
        moodList.add(mood);
        assertEquals(emotion,moodList.get(moodList.size()-1).getEmotion());
        assertEquals(trigger,moodList.get(moodList.size()-1).getTrigger());
        assertEquals(reasonText,moodList.get(moodList.size()-1).getReasonText());
    }

    public void testEditMood() {
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        String owner = "Harambe";
        String trigger = "Banana";
        String reasonText = "Ate a banana";
        mood.setOwner(owner);
        mood.setEmotion(emotion);
        mood.setTrigger(trigger);
        mood.setReasonText(reasonText);
        moodList.add(mood);
        String newTrigger = "a kid";
        moodList.get(moodList.size()-1).setTrigger(newTrigger);
        assertEquals(emotion,moodList.get(moodList.size()-1).getEmotion());
        assertEquals(newTrigger,moodList.get(moodList.size()-1).getTrigger());
        assertEquals(reasonText,moodList.get(moodList.size()-1).getReasonText());
    }

    public void testDeleteMood(){
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        String owner = "Harambe";
        String trigger = "Banana";
        String reasonText = "Ate a banana";
        mood.setOwner(owner);
        mood.setEmotion(emotion);
        mood.setTrigger(trigger);
        mood.setReasonText(reasonText);
        moodList.add(mood);
        moodList.remove(mood);
        assertFalse(moodList.contains(mood));
    }


    public void testRegister() {}

    public void testFilter() {
        ArrayList<Mood> moodList = new ArrayList<>();
        Mood mood = new Mood();
        String emotion = "Happy";
        mood.setEmotion(emotion);
        moodList.add(mood);
        Mood anotherMood = new Mood();
        String newEmotion = "Sad";
        anotherMood.setEmotion(newEmotion);
        moodList.add(anotherMood);
        //Add stuff here
    }
}