# Serenity-selenium-bootstrap
This project is the base to start automating web applications, based on the Screenplay pattern.

## Technology Used
Java, JUnit, Gradle, Serenity, Selenium and Cucumber.

## Configurations
It is necessary to have installed the Java JDK and Gradle, as well as the environment variables configured in the operating system: `JAVA_HOME` and `GRADLE_HOME`.
<br>Then run the command `gradle clean install` to download all the necessary dependencies.

## Execution for Intellij
Create a gradle run with the runners located in `com/wolox/certification/demoblaze/runners` 
<br>The following variables must be added in the run command
<br>`-DURL="base_url"`
<br>`-DregisteredUser="registeredUser"`
<br>`-DregisteredPassword="registeredPassword"`

## Command line execution with gradle
`gradle clean test -DURL="base_url" -DregisteredUser="registeredUser" -DregisteredPassword="registeredPassword"` 

## Contributing
1. Clone the repository
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Run the tests or make changes
4. Commit your changes (`git add .` , `Git commit -m "Add some feature"`)
5. Push the branch (`git push origin my-new-feature`)
6. Create a new pull request
