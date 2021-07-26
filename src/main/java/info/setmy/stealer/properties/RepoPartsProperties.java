package info.setmy.stealer.properties;

import info.setmy.stealer.models.CodeRepository;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "repoParts")
public class RepoPartsProperties extends ArrayList<CodeRepository> {
}
