libraryDependencies ++= Seq(
  "com.github.javaparser"    % "javaparser-core"     % "3.13.1",
  "com.google.code.findbugs" % "jsr305"              % "3.0.2",
  "com.beachape"             %% "enumeratum"         % "1.5.13",
  "org.scala-lang.modules"   %% "scala-java8-compat" % "0.9.0"
)

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.3.1")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.0")
