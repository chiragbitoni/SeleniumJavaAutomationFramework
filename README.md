# Selenium Java Automation Framework

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.27.0-green.svg)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-7.10.2-red.svg)](https://testng.org/)
[![Allure](https://img.shields.io/badge/Allure-2.29.1-yellow.svg)](https://allurereport.org/)

A robust, enterprise-ready end-to-end test automation framework built with **Java 21**, **Selenium WebDriver**, **TestNG**, and **Maven**, targeting modern web applications with comprehensive reporting via **Allure** and structured JSON test telemetry.

---

## Key Features

- **Page Object Model (POM):** Clean separation of test logic and page interaction layers.
- **Dynamic Element Synchronization:** Explicit `WebDriverWait` and `ExpectedConditions` handling dynamic web elements, timeouts, and state transitions.
- **Telemetry & Reporting:**
  - Automated HTML reports via **Allure Report**.
  - Structured JSON export (`target/test-results.json`) through custom `TestResultListener`, enabling downstream analytics in dashboards like [TestNexus](https://github.com/chiragbitoni/TestNexus).
- **Cross-Browser Architecture:** Configurable browser execution across Chrome, Edge, and Firefox.
- **CI/CD Ready:** Automated execution via Maven Surefire plugin.

---

## Test Suites & Coverage

- **Elements Suite:**
  - **Text Box (`TextBoxTest`):** Data entry, form submission, and output validation.
  - **Check Box (`CheckBoxTest`):** Tree-node selection and multi-branch checks.
  - **Radio Button (`RadioButtonTest`):** Option selection and state assertions.
  - **Web Tables (`WebTablesTest`):** Record addition, editing, row deletion, and table search.
  - **Buttons (`ButtonTest`):** Double-click, right-click, and dynamic single-click validations.
  - **Links (`LinkTest`):** Navigation redirects, HTTP status validation (200, 301, 400, 404, 500).
  - **Broken Links & Images (`BrokenLinkImageTest`):** HTTP status verification and broken image DOM detection.
  - **Upload & Download (`UploadAndDownloadTest`):** File download verification and multipart file uploads.
  - **Dynamic Properties (`DynamicPropertiesTest`):**
    - `TC014`: Verification of button enablement after 5-second asynchronous delay.
    - `TC015`: Text color transition validation after 5 seconds.
    - `TC016`: Element visibility wait assertion after 5-second delay.

---

## Getting Started

### Prerequisites

- **JDK 21+**
- **Apache Maven 3.9+**
- **Google Chrome** (or target browser)

### Installation & Execution

1. **Clone the repository:**
   ```bash
   git clone https://github.com/chiragbitoni/SeleniumJavaAutomationFramework.git
   cd SeleniumJavaAutomationFramework
   ```

2. **Compile and build:**
   ```bash
   mvn clean test-compile
   ```

3. **Run the full regression test suite:**
   ```bash
   mvn test
   ```

4. **Generate and view Allure Report:**
   ```bash
   allure serve allure-results
   ```

5. **JSON Test Results:**
   Execution results are automatically recorded in `target/test-results.json` after test completion.

---

## License

This project is licensed under the [MIT License](LICENSE).
