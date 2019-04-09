import Settings._

scalaWrapperGenBaseSettings(typeName = "Akka", packageName = "akka")

sdkBaseName := "AppSync"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-akka"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
