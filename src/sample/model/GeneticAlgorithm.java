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
    public Population evolve(Population population){
         return mutatePopulation(crossoverPopulation(population));

    }
    private Population crossoverPopulation(Population population){
        Population crossoverPopulation = new Population(population.getChromosomes().length,this);
        for(int i=0;i< noOfEliteChromosomes;i++){
            crossoverPopulation.getChromosomes()[i]= population.getChromosomes()[i];
        }
        Chromosome chromosome1 = null;
        Chromosome chromosome2 = null;

        for(int i=noOfEliteChromosomes;i<population.getChromosomes().length;i++){
            if(Math.random()<=crossoverRate){
                //pick the two chromosomes with the highest fitness score
                chromosome1 = selectTournamentPopulation(population).getChromosomes()[0];
                chromosome2 = selectTournamentPopulation(population).getChromosomes()[0];
                crossoverPopulation.getChromosomes()[i] = crossoverChromosome(chromosome1,chromosome2);
            }else{
                // No crossover
                crossoverPopulation.getChromosomes()[i]= selectTournamentPopulation(population).getChromosomes()[0];
            }
        }
        return crossoverPopulation;
    }
    private Population mutatePopulation(Population population){
        Population mutatePopulation = new Population(population.getChromosomes().length,this);
        for(int i=0; i<noOfEliteChromosomes;i++){
            mutatePopulation.getChromosomes()[i]= population.getChromosomes()[i];
        }
        for(int i=noOfEliteChromosomes;i<population.getChromosomes().length;i++){
            mutatePopulation.getChromosomes()[i]= mutateChromosome(population.getChromosomes()[i]);
        }

        return mutatePopulation;
    }


    public int[] getTargetSolution() {
        return targetSolution;
    }

    private Chromosome crossoverChromosome(Chromosome chromosome1,Chromosome chromosome2){
        //mutate population method will call this method in a loop
        Chromosome crossoverChromosome = new Chromosome(this);
        for(int i=0;i<chromosome1.getGenes().length;i++){
            if(Math.random() <0.5) crossoverChromosome.getGenes()[i]= chromosome1.getGenes()[i];
            else crossoverChromosome.getGenes()[i] = chromosome2.getGenes()[i];
        }

        return crossoverChromosome;
    }

    private Chromosome mutateChromosome(Chromosome chromosome){
        Chromosome mutateChromosome = new Chromosome(this);

        for(int i=0;i<chromosome.getGenes().length;i++){
            if(Math.random() <= mutationRate) {
                // perform mutation
                if(Math.random() < 0.5) mutateChromosome.getGenes()[i]=1; // change to decimal later!
                else mutateChromosome.getGenes()[i]=0; // change to decimal later!

            } else mutateChromosome.getGenes()[i] = chromosome.getGenes()[i];

        }

        return mutateChromosome;
    }

    private Population selectTournamentPopulation(Population population){
        Population tournamentPopulation = new Population(tournamentSelectionSize, this);
        for(int i=0; i<tournamentSelectionSize;i++){
            tournamentPopulation.getChromosomes()[i]= population.getChromosomes()[(int)
                    (Math.random()* population.getChromosomes().length)];
        }
        tournamentPopulation.sortChromosomesByFitness();
        return tournamentPopulation;
    }


}
