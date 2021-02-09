package practice.entity;

import lombok.Getter;
import lombok.Setter;
import practice.func.DeploymentCallback;

@Getter
@Setter
public class Deployment {
    //
    private String id;
    private DeploymentCallback callback;

}
