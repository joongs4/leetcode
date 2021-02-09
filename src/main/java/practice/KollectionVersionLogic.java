package practice;

import practice.entity.Deployment;
import practice.func.DeploymentCallback;

public class KollectionVersionLogic {

    public DeploymentCallback callback = new DeploymentCallback() {
        @Override
        public void notifyResult(Deployment deployment) {

            System.out.println("ID : " + deployment.getId() + ", " + getTypeName() + " deployed ");

        }
    };


    public Deployment getSampleDeployment() {

        Deployment deployment = new Deployment();
        deployment.setId("Ko1");
        deployment.setCallback(callback);
        return deployment;
    }


    public String getTypeName() {


        return "KollectionVersion";
    }
}
