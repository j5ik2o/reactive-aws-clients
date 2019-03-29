import Settings._

coreSettings

name := "reactive-aws-kinesis-test"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-kinesis" % awsSdk1Version
)
