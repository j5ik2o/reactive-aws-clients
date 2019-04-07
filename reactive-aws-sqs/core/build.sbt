import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenBaseSettings()

sdkBaseName := "Sqs"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % sdkBaseName.value.toLowerCase % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace(
      s"software.amazon.awssdk.services.${sdkBaseName.value.toLowerCase}.model",
      s"com.github.j5ik2o.reactive.aws.${sdkBaseName.value.toLowerCase}.model.ops"
    )
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"                                       => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client"                                            => true
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
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    Seq(s"${sdkBaseName.value}Client", s"${sdkBaseName.value}AsyncClient")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client" =>
    Seq(s"${sdkBaseName.value}SyncClient")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")

  case cd => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}Client" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}Client.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}AsyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}AsyncClient.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}SyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}Client" =>
    s"${sdkBaseName.value}SyncClient.ftl"

  case (s, cd: ClassDesc) if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
  case (_, cd)                                                                               => throw new Exception(s"error: ${cd}")
}
