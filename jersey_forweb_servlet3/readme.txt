1. pom.xml 或者 maven的setting.xml中加入这个资源地址（因为是不稳定版本）
	<repository>
	    <id>snapshot-repository.java.net</id>
	    <name>Java.net Snapshot Repository for Maven</name>
	    <url>https://maven.java.net/content/repositories/snapshots/</url>
	    <layout>default</layout>
	</repository>

2. 命令运行
	mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false -DgroupId=com.genpact -DartifactId=jersey_forweb_servlet3 -Dpackage=com.genpact.restful -DarchetypeVersion=2.16
3. pom.xml中加入下面依赖
	<dependency>
			<groupId>org.glassfish.jersey.containers</groupId>
			
			<!-- <artifactId>jersey-container-servlet-core</artifactId> -->
			<!-- needed for web.xml-less deploy -->
			<artifactId>jersey-container-servlet</artifactId>
			<!-- use the following artifactId if you don't need servlet 2.x compatibility -->
			<!-- artifactId>jersey-container-servlet</artifactId -->
		</dependency>

	
4. 运行	
	http://localhost:8080/jersey_forweb_servlet3/
	http://localhost:8080/jersey_forweb_servlet3/api/application.wadl