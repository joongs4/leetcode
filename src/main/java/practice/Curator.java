package practice;

import practice.entity.Deployment;

public class Curator extends Thread {

    private Deployment deployment;

    public Curator(Deployment deployment) {
        this.deployment = deployment;
    }

    @Override
    public void run() {
        deploy(this.deployment);
    }

    public static void deploy(Deployment deployment) {

        System.out.println("Start deployment " + deployment.getId());

        for (int i = 0; i <= 500000; i++) {
            System.out.println("Thread ID (" + Thread.currentThread().getId() + ") : " + i);
            deployment.getCallback().notifyResult(deployment);
        }
    }

}
