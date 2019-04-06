import Settings._

coreSettings

name := "reactive-aws-sqs-test"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "sqs" % awsSdk2Version
)
