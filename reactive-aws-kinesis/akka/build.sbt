import Settings._

coreSettings

name := "reactive-aws-kinesis-akka"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
)
