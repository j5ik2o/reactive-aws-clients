import Settings._

scalaWrapperGenBaseSettings(typeName = "Akka", packageName = "akka")

sdkBaseName := "AppSync"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-akka"

libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2L, scalaMajor)) if scalaMajor >= 12 =>
      Seq(
        "com.typesafe.akka" %% "akka-testkit"        % akka26Version % Test,
        "com.typesafe.akka" %% "akka-stream-testkit" % akka26Version % Test
      )
    case Some((2L, scalaMajor)) if scalaMajor == 11 =>
      Seq(
        "com.typesafe.akka" %% "akka-testkit"        % akka25Version % Test,
        "com.typesafe.akka" %% "akka-stream-testkit" % akka25Version % Test
      )
  }
}

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
