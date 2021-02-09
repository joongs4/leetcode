package practice;

import practice.entity.Deployment;

import java.util.concurrent.*;

public class FunctionalInterfaceTest {


    public static void main(String... args) {

        DramaLogic dramaLogic = new DramaLogic();
        KollectionVersionLogic kollectionVersionLogic = new KollectionVersionLogic();

        Deployment deployment1 = dramaLogic.getSampleDeployment();
        Deployment deployment2 = kollectionVersionLogic.getSampleDeployment();

        Deployment deployment3 = kollectionVersionLogic.getSampleDeployment();
        Deployment deployment4 = kollectionVersionLogic.getSampleDeployment();
        Deployment deployment5 = kollectionVersionLogic.getSampleDeployment();


        Curator curator1 = new Curator(deployment1);
        Curator curator2 = new Curator(deployment2);
        Curator curator3 = new Curator(deployment3);
        Curator curator4 = new Curator(deployment4);
        Curator curator5 = new Curator(deployment5);


        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService.execute(curator1);
//        executorService.execute(curator2);
//        executorService.execute(curator3);
//        executorService.execute(curator4);
//        executorService.execute(curator5);




    }


}
