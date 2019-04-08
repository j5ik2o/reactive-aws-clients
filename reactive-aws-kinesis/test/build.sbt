import Settings._

coreSettings

sdkBaseName := "Kinesis"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-test"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % sdkBaseName.value.toLowerCase % awsSdk2Version
)
