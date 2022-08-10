package peaksoft;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:application.properties")
public class MyConfig {
}
