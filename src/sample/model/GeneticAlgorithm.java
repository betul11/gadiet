package sample.model;

public class GeneticAlgorithm {
    private int[] targetSolution;
    private double crossoverRate;
    private double mutationRate;
    private int noOfEliteChromosomes;
    private int tournamentSelectionSize;



    public GeneticAlgorithm(int[] targetSolution, double crossoverRate, double mutationRate,
                            int noOfEliteChromosomes, int tournamentSelectionSize) {
        this.targetSolution = targetSolution;
        this.crossoverRate = crossoverRate;
        this.mutationRate = mutationRate;
        this.noOfEliteChromosomes = noOfEliteChromosomes;
        this.tournamentSelectionSize = tournamentSelectionSize;
    }

    public int[] getTargetSolution() {
        return targetSolution;
    }


}
