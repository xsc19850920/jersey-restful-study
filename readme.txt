1. pom.xml 或者 maven的setting.xml中加入这个资源地址（因为是不稳定版本）
	<repository>
	    <id>snapshot-repository.java.net</id>
	    <name>Java.net Snapshot Repository for Maven</name>
	    <url>https://maven.java.net/content/repositories/snapshots/</url>
	    <layout>default</layout>
	</repository>

2. 命令运行
	mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false -DgroupId=com.genpact.restful -DartifactId=jersey_restful_study -Dpackage=com.genpact -DarchetypeVersion=2.16
	
3. 编译
	mvn clean compile -DskipTests 
	
4. 运行	
	http://localhost:8080/myapp/myresource
	http://localhost:8080/myapp/application.wadl