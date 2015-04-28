/*
 * Director, constructs the complex object using Builder interface
 */ 
public class Director {
    public Computer buildComputer(Builder b) {
        b.buildCase();
        b.buildPsu();
        b.buildMotherboard();
        b.buildCpu();
        b.buildRam();
        b.buildGpu();
        b.buildHdd();
        return b.getComputer();
    }
}
