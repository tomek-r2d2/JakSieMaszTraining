package task1.company.Utils;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextGeneratorTest {


    @Test
    public void TestTextGenerator() {

        System.out.println("Testing text generator");
        TextGenerator textGenerator = new TextGenerator();

        String sampleName = textGenerator.generateName();
        assertEquals(sampleName.isEmpty(), false);
        String sampleTask = textGenerator.generateTask();
        assertEquals(sampleTask.isEmpty(), false);

        System.out.println(sampleName);
        System.out.println(sampleTask);

    }

}