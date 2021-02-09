package practice.func;

import practice.entity.Deployment;

@FunctionalInterface
public interface DeploymentCallback {
    void notifyResult(Deployment deployment);
}
