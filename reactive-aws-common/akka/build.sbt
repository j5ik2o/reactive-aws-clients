import Settings._

name := "reactive-aws-common-akka"

libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2L, scalaMajor)) if scalaMajor == 13 =>
      Seq(
        "com.typesafe.akka" %% "akka-actor"  % akka25Version,
        "com.typesafe.akka" %% "akka-stream" % akka25Version,
        "com.typesafe.akka" %% "akka-slf4j"  % akka25Version,
        "org.scalatest"     %% "scalatest"   % "3.2.1" % Test
      )
    case Some((2L, scalaMajor)) if scalaMajor == 12 =>
      Seq(
        "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.4",
        "com.typesafe.akka"      %% "akka-actor"              % akka26Version,
        "com.typesafe.akka"      %% "akka-stream"             % akka26Version,
        "com.typesafe.akka"      %% "akka-slf4j"              % akka26Version,
        "org.scalatest"          %% "scalatest"               % "3.2.1" % Test
      )
    case Some((2L, scalaMajor)) if scalaMajor == 11 =>
      Seq(
        "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.4",
        "com.typesafe.akka"      %% "akka-actor"              % akka25Version,
        "com.typesafe.akka"      %% "akka-stream"             % akka25Version,
        "com.typesafe.akka"      %% "akka-slf4j"              % akka25Version,
        "org.scalatest"          %% "scalatest"               % "3.0.8" % Test
      )
  }
}
