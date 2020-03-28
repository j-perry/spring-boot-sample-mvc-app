package uk.perry.software.sample.spring.boot.spring_boot_sample_mvc_app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class AppTest {
	
    public AppTest(String testName) {
    }

    public void testApp() {
        assertTrue(true);
    }
}
