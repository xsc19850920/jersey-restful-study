1. pom.xml 或者 maven的setting.xml中加入这个资源地址（因为是不稳定版本）
	<repository>
	    <id>snapshot-repository.java.net</id>
	    <name>Java.net Snapshot Repository for Maven</name>
	    <url>https://maven.java.net/content/repositories/snapshots/</url>
	    <layout>default</layout>
	</repository>

2. 命令运行
	mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false -DgroupId=com.genpact -DartifactId=jersey_restful_study_forweb -Dpackage=com.genpact.restful -DarchetypeVersion=2.16
	
3. 编译
	mvn clean compile -DskipTests 
4. 运行	
	http://localhost:8080/jersey_restful_study_forweb/