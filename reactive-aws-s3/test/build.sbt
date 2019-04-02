import Settings._

coreSettings

name := "reactive-aws-s3-test"

libraryDependencies ++= Seq(
  "software.amazon.awssdk"   % "s3"                   % awsSdk2Version,
)