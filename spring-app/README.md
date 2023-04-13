# Spring in Kotlin

1. Initialize project with `gradle init`
2. Use official syntax for Kotlin plugin and change test platform to JUnit
3. Run `./gradlew build` will generate the JAR and TAR file under `app/build/distributions/app.zip`
    - These distribution compress the JAR of the application, manifest and JAR of dependencies
4. Add Spring dependency and plugin
   - Adds `bootJar` Gradle task that creates "fat jar" (with dependencies) in `app/build/libs/app.jar`
   - Can run it with a valid JRE `java -jar app/build/libs/app.jar`
5. Customize the bootJar task if needed using `val bootJar: BootJar by tasks` and `bootJar.apply {}`