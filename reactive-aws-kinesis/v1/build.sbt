import Settings._

coreSettings

scalaWrapperGenKinesisBaseSettings

name := "reactive-aws-kinesis-v1"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-kinesis" % awsSdk1Version
)
