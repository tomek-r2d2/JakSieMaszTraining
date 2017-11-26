package task0.jarbuilder;


public class Factory {

    public static void main(String[] args) {
        Generator gen = new Generator(10);
        gen.generate();
        gen.print();
    }
}

