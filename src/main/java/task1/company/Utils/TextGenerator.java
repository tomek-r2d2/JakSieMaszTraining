package task1.company.Utils;

import java.util.concurrent.ThreadLocalRandom;

public class TextGenerator {

    private int getRandomNum(int range) {
        return ThreadLocalRandom.current().nextInt(0, range + 1);
    }

    public String generateName(){
        int range = SampleData.names.length;

        int randomNum = getRandomNum(range);

        return (SampleData.names[randomNum]);


    }


    public String generateTask(){
        int range1 = SampleData.Task1.length;
        int range2 = SampleData.Task2.length;

        int randomNum1 = getRandomNum(range1-1);
        int randomNum2 = getRandomNum(range2-1);
        int randomNum3 = getRandomNum(1000);

        StringBuilder sb = new StringBuilder();
        sb.append(SampleData.Task1[randomNum1]).append(SampleData.Task2[randomNum2]);
        sb.append("#").append(randomNum3);

        return (sb.toString());
    }


}
