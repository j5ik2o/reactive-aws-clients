import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenBaseSettings()

// logLevel := Level.Debug,

val baseName = "AppSync"

sdkBaseName := baseName

name := s"reactive-aws-${baseName.toLowerCase}-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % baseName.toLowerCase % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

val BaseClient  = baseName + "Client"
val AsyncClient = baseName + "AsyncClient"
val SyncClient  = baseName + "SyncClient"

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace(s"software.amazon.awssdk.services.${baseName.toLowerCase}.model",
              s"com.github.j5ik2o.reactive.aws.${baseName.toLowerCase}.model.ops")
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${baseName}AsyncClient"                                          => true
  case cd if cd.simpleTypeName == s"${baseName}Client"                                               => true
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                         => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("ResponseMetadata")                               => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract => true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${baseName}AsyncClient" =>
    Seq(s"$BaseClient", s"$AsyncClient")
  case cd if cd.simpleTypeName == s"${baseName}Client"  => Seq(s"$SyncClient")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case (BaseClient, cd) if cd.simpleTypeName == s"${baseName}AsyncClient" => s"$BaseClient.ftl"
  case (AsyncClient, cd: ClassDesc) if cd.simpleTypeName == s"${baseName}AsyncClient" =>
    s"$AsyncClient.ftl"
  case (SyncClient, cd: ClassDesc) if cd.simpleTypeName == s"${baseName}Client" =>
    s"$SyncClient.ftl"

  case (s, cd: ClassDesc) if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"

  case (_, cd) => throw new Exception(s"error: ${cd}")
}
