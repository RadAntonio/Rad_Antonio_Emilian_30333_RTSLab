package LabSession2.Application2;


import LabSession2.Application2.Window;

public class Main {
    static final int noOfThreads = 6;
    static final int processorLoad = 100000000;

    public static void main(String[] args) {
        StartClas startClas = new StartClas();
        startClas.startProgram();
    }
}
