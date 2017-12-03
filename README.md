# server-cxf-spring

> This project works with *__Apache CXF framework__*. It's an example that create a simple web service. 
> We build, in the same project, a WS with Soap, Restful and Spring.

![Book Service.png](/Users/PauMB/Desktop/Book Service.png)

### Table of Contents
1. [Overview](#overview)
2. [Built](#built)
2. [Deploy](#deploy)
3. [How to use](#how_to_use)
4. [Versioning](#versioning)

### Overview
This project tech you how to configure a Web Service with CXF framework, 
where you can build a SOAP and Rest services in the same project. 

### Built
To built it, you must download the zip or clone the project.
In the directory of the pom file launch the following maven command line
```bash
mvn clean install
```
### Deploy
To deploy the war file, you must use with your favorite server, for example a tomcat.
Copy the war file into the webapp folder in you tomcat directory
```bash
cp target/server-cxf.wat /directory/to/tomcat/webapps
```
move to your bin directory from your tomcat and deploy the war file
```bash
./startup.sh
```
and the application is running on url __http://localhost:8080/server-cxf__

### How to use
In this example project, you can test the SOAP and Rest service with the __*Book Service*__.
With this service, you can create, get one or all books that you have created.
You can test the rest service with this json
```json
{
	"title": "My Book",
	"editorial": "My editorial",
	"author": "My author"
}
```
or xml
```xml
<book>
	<title>My Book 2</title>
	<editorial>My editorial</editorial>
	<author>My author</author>	
</book>
```

### Versioning
We use following:
```text
v<Major>.<Minor>.<Path/Upgrade>.<BuildNumber>
```
* Major. The major version is a definite release of the product. It increased when there are a significant changes in the functionality.
* Minor. The minor version is incremented when there are new features.
* Path. the patch version is incremented when fix a critical bug or a collection of issues.
* Build Number. This auto-increment with each release build in the CI system or when update the version of any framework or library.

For the version availables, you can see [the tags on the repository](https://github.com/PauMB85/server-cxf-spring/tags).









