import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenSQSBaseSettings

// logLevel := Level.Debug,

name := "reactive-aws-sqs-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "sqs" % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace("software.amazon.awssdk.services.sqs.model", "com.github.j5ik2o.reactive.aws.sqs.model.ops")
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "SqsAsyncClient"                                                         => true
  case cd if cd.simpleTypeName == "SqsClient"                                                              => true
  case cd: ClassDesc if cd.simpleTypeName.startsWith("Default") && cd.packageName.exists(_.endsWith("s3")) => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                            => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                               => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Builder")                                              => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Handler")                                              => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("ResponseMetadata")                                     => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract       => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "SqsAsyncClient" =>
    Seq("SQSClient", "SQSAsyncClient")
  case cd if cd.simpleTypeName == "SqsClient" =>
    Seq("SQSSyncClient")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")

  case cd => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("SQSClient", cd: ClassDesc) if cd.simpleTypeName == "SqsAsyncClient" => "SQSClient.ftl"
  case ("SQSAsyncClient", cd: ClassDesc) if cd.simpleTypeName == "SqsAsyncClient" =>
    "SQSAsyncClient.ftl"
  case ("SQSSyncClient", cd: ClassDesc) if cd.simpleTypeName == "SqsClient" =>
    "SQSSyncClient.ftl"

  case (s, cd: ClassDesc) if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
  case (_, cd)                                                                               => throw new Exception(s"error: ${cd}")
}
