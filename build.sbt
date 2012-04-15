organization := "org.grumpysoft"

name := "change-me"

version := "0.1"

scalaVersion := "2.9.1"

compileOrder := CompileOrder.JavaThenScala

libraryDependencies += Seq("org.apache.httpcomponents" % "httpclient" % "4.1.2",
		           "com.google.guava" % "guava" % "11.0.2",
		           "org.jsoup" % "jsoup" % "1.6.2",	      
		           "org.hamcrest" % "hamcrest-core" % "1.3.RC2" % "test->default",
			   "org.hamcrest" % "hamcrest-library" % "1.3.RC2" % "test->default",
			   "junit" % "junit-dep" % "4.10" % "test->default",
			   "org.jmock" % "jmock-junit4" % "2.5.1" % "test->default",
			   "com.novocode" % "junit-interface" % "0.7" % "test->default",
			   "commons-io" % "commons-io" % "2.1" % "test->default",
			   "org.mockito" % "mockito-all" % "1.8.5" % "test",
			   "org.specs2" %% "specs2" % "1.9" % "test")

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"  at "http://oss.sonatype.org/content/repositories/releases")