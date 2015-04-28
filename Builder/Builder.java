/*
 * Builder, specifies interface for creating parts of a Product object
 */ 
public interface Builder {
    void buildCase();
    void buildPsu();
    void buildMotherboard();
    void buildCpu();
    void buildRam();
    void buildGpu();
    void buildHdd();
    Computer getComputer();
}