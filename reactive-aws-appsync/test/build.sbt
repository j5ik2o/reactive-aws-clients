import Settings._

sdkBaseName := "AppSync"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-test"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % sdkBaseName.value.toLowerCase % awsSdk2Version
)
