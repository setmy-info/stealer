package info.setmy.stealer.properties;

import info.setmy.stealer.models.CodeRepository;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "repositories")
public class CodeRepositories {

    private List<CodeRepository> codeRepositories;
}
