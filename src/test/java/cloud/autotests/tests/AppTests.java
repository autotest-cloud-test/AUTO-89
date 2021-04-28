package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("UI Test CMS")
    void generatedTest() {
        step("Open cms.vlife.kz", () -> {
            // todo
        });

        step("login: admin", () -> {
            // todo
        });

        step("pass: qwe123", () -> {
            // todo
        });

        step("banner should be visible", () -> {
            // todo
        });
    }
}