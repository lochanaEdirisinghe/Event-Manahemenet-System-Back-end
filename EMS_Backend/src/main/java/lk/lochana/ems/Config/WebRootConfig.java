package lk.lochana.ems.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JpaConfig.class})
public class WebRootConfig {
}
