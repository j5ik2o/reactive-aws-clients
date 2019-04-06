import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenKinesisBaseSettings

name := "reactive-aws-kinesis-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "kinesis" % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace("software.amazon.awssdk.services.kinesis.model", "com.github.j5ik2o.reactive.aws.kinesis.model.ops")
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient"                                               => true
  case cd if cd.simpleTypeName == "KinesisClient"                                                    => true
  case cd: ClassDesc if cd.simpleTypeName.startsWith("Default")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Builder")                                        => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Handler")                                        => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                         => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("ResponseMetadata")                               => false
  case cd: ClassDesc if cd.simpleTypeName == "SubscribeToShardEventStream"                           => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" =>
    Seq("KinesisClient", "KinesisAsyncClient")
  case cd if cd.simpleTypeName == "KinesisClient" =>
    Seq("KinesisSyncClient")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("KinesisClient", cd) if cd.simpleTypeName == "KinesisAsyncClient" => "KinesisClient.ftl"
  case ("KinesisAsyncClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
    "KinesisAsyncClient.ftl"
  case ("KinesisSyncClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisClient" =>
    "KinesisSyncClient.ftl"

  case (s, cd: ClassDesc) if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"

  case (_, cd) => throw new Exception(s"error: ${cd}")
}
