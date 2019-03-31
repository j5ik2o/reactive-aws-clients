import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenS3BaseSettings

name := "reactive-aws-s3-v2"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "s3" % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace("software.amazon.awssdk.services.s3.model", "com.github.j5ik2o.reactive.aws.s3.model.ops")
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services.s3", "com.github.j5ik2o.reactive.aws.s3.v2")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "S3AsyncClient"                 => true
  case cd if cd.simpleTypeName == "S3Client"                      => true
  case cd: ClassDesc if cd.simpleTypeName.startsWith("Default")   => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")   => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Builder")     => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Handler")     => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")      => false
  case cd: EnumDesc if cd.packageName.exists(_.endsWith("model")) => true
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract =>
    true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "S3AsyncClient" =>
    Seq("S3AsyncClient", "S3AsyncClientImpl")
  case cd if cd.simpleTypeName == "S3Client" =>
    Seq("S3SyncClient", "S3SyncClientImpl")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("S3AsyncClient", cd: ClassDesc) if cd.simpleTypeName == "S3AsyncClient" =>
    "S3AsyncClient.ftl"
  case ("S3AsyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "S3AsyncClient" =>
    "S3AsyncClientImpl.ftl"
  case ("S3SyncClient", cd: ClassDesc) if cd.simpleTypeName == "S3Client" =>
    "S3SyncClient.ftl"
  case ("S3SyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "S3Client" =>
    "S3SyncClientImpl.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName.endsWith("Request") =>
    "RequestOps.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName.endsWith("Response") =>
    "ResponseOps.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
  case (_, cd: EnumDesc) if cd.packageName.exists(_.endsWith("model"))  => "EnumOps.ftl"
  case (name, cd)                                                       => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
