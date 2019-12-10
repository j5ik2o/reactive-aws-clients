import Settings._

name := "reactive-aws-common-core"

libraryDependencies ++= Seq(
  "org.reactivestreams"    % "reactive-streams" % "1.0.3",
  "software.amazon.awssdk" % "sdk-core"         % awsSdk2Version
)
