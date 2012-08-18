Clue-Solver
===========
See [Project Site][Project Site] for reports and api

Building the Workspace
----------------------
1. Run the command from console `mvn eclipse:eclipse`
	+ If your build for myeclipse the command is `mvn eclipse:myeclipse`
	+ If you need to undo the generation use `mvn eclipse:clean`
2. After the command is run you should be able to import the project as you normally do from the git repositories view or from. File -> Import -> Existing Projects into Workspace
3. For more information about the changes [Maven Eclipse Generator][Eclipse Site]

Build Instructions
------------------
### Requirements
+ Java JDK 1.6
	+ [Oracle Java 1.6 Download][Java site]
	+ _Rest Server will not build in JDK > 1.6_
+ Maven 2.2.1
	+ [Apache Maven Download Site][Maven Site]

### Building
1. Clone full repo from git
2. Navigate to the base directory of git repo.
3. Run command 'mvn clean package'
	+ This will run all tests and should produce project artifacts

### Generating Enunciate
1. Run `mvn clean site` from root of project

Clue Solver Rest
----------------
### Rest Server Tech/Dependencies
+ Restlet 2.0.13
	+ Provides the basic REST server interfaces, including handling all the thread management
	+ Allows us to serve straight from a jar with no server additional server configuration
	+ [Restlet Home Page][Restlet Site]
+ Jackson
	+ Automatic conversion from Java Objects to JSON objects and back
	+ Currently our rest server uses no configuration and lets Jackson automatically convert
	+ [Jackson Home Page][Jackson Site]
+ JAXB
	+ Handles conversion from Java to XML and back
	+ Annotated objects in the Clue-Solver-Models module
	+ If adding a new object be sure to add it to jaxb.index for that package so that it can be created
	+ Part of standard JDK
+ Enunciate
	+ Generates the API documentation including the active paths that can be connected to
	+ Generates the XML information such as examples
	+ Generates code that handles connection and conversion in C#, Java, and C
	+ Automatically runs from maven and outputs to `/target/site/wsdocs`
	+ [Enunciate Home Page][Enunciate Site]

### Api Docs
After running `mvn clean site` the full API docs should be available in the directory
`Clue-Solver-Rest/target/site/wsdocs/index.html`
Navigating from this site will also allow you to download any of the generated code libraries
The site is full navigable from the html in the target directory, does not need to be deployed to a server

[Maven Site]: http://maven.apache.org/download.html "Apache Maven download"
[Java Site]: http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloads-javase6-419409.html "Java Download"
[Restlet Site]: http://www.restlet.org/ "Restlet Home Page"
[Jackson Site]: http://jackson.codehaus.org/Home "Jackson Home Page"
[Enunciate Site]: http://enunciate.codehaus.org/ "Enunciate"
[Project Site]: http://AfterHoursProjects.github.com/Clue-Solver "Project Site"
[Eclipse Site]: http://maven.apache.org/guides/mini/guide-ide-eclipse.html "Maven Eclipse Generator"