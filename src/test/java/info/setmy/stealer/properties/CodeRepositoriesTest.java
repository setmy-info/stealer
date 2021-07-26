package info.setmy.stealer.properties;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CodeRepositoriesTest {

    @Autowired
    private RepositoriesProperties codeRepositories;

    @Test
    public void instanceExists() {
        assertThat(codeRepositories).isNotNull();
    }

    @Test
    public void testGetCodeRepositories() {
        assertThat(codeRepositories).asList().size().isEqualTo(1);
        assertThat(codeRepositories.get(0).getShortName()).isEqualTo("stealer-test-a");
        assertThat(codeRepositories.get(0).getUrl()).isEqualTo("https://github.com/setmy-info/stealer-test-a.git");
        assertThat(codeRepositories.get(0).getType()).isEqualTo("git");
    }
}
