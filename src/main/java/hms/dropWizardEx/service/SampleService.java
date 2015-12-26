package hms.dropWizardEx.service;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import hms.dropWizardEx.resources.DeveloperResource;

/**
 * Created by dasuni on 12/17/15.
 */
public class SampleService extends Service<ServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new SampleService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {

    }

    @Override
    public void run(ServiceConfiguration serviceConfiguration, Environment environment) throws Exception {
        environment.addResource(new DeveloperResource());
    }
}
