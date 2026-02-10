# Kameleoon 🦎

**Kameleoon** (derived from Chameleon) is an adaptive and comprehensive template for building **Compose Multiplatform Libraries** targeting Android, iOS, and Desktop (JVM). Just like a chameleon adapts to its environment, this template helps your UI code adapt seamlessly across platforms.

## Project Structure

* **`/library`**: The core module containing your shared library code.
    * `commonMain`: Code shared across all platforms.
    * `androidMain`, `iosMain`, `jvmMain`: Platform-specific implementations.
* **`/sample`**: A sample application to demonstrate and test your library.
    * Depends on the `:library` module.
    * Runs on Android and Desktop.

## Features & Tools included

* **Kotlin Multiplatform**: Pre-configured for Android, iOS, and Desktop.
* **Compose Multiplatform**: UI framework ready.
* **Maven Publish Plugin**: Easy publishing to Maven Central using `vanniktech/gradle-maven-publish-plugin`.
* **Binary Compatibility Validator**: Ensures your library's public API remains stable.
* **Dokka**: Generates API documentation.
* **Spotless**: Enforces code formatting (Ktlint) and license headers.
* **Detekt**: Static code analysis for Kotlin.
* **GitHub Actions**: CI/CD workflows for building, testing, and checking code quality.

## Getting Started

### 1. Rename and Configure
Update `library/build.gradle.kts` with your library's details:
* `mavenPublishing` block: Update `groupId`, `artifactId`, `version`, and `pom` details (licenses, developers, SCM).
* `android` block: Update `namespace`.

Update `spotless/copyright.kt` with your license header.

### 2. Build and Run Sample

**Android:**
```shell
./gradlew :sample:assembleDebug
```

**Desktop:**
```shell
./gradlew :sample:run
```

### 3. Code Quality Checks

**Format Code (Spotless):**
```shell
./gradlew spotlessApply
```

**Static Analysis (Detekt):**
```shell
./gradlew detekt
```

**Check API Compatibility:**
```shell
./gradlew apiCheck
```
*Run `./gradlew apiDump` to generate the initial API dump file.*

**Generate Documentation (Dokka):**
```shell
./gradlew dokkaHtml
```

### 4. Publishing

To publish to Maven Central, you need to configure your Sonatype credentials.
The project is set up to use the `vanniktech` plugin. Refer to the [plugin documentation](https://github.com/vanniktech/gradle-maven-publish-plugin) for setting up secrets (GPG key, Sonatype username/password).

A manual workflow is available at `.github/workflows/publish.yml`.

---

## License

[Add your license here]
