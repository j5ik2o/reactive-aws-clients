import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenBaseSettings()

val baseName = "DynamoDb"

sdkBaseName := baseName

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % sdkBaseName.value.toLowerCase % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn == "JavaAsyncClientMetricsInterceptor" =>
    s.replace(s"software.amazon.awssdk.services.${baseName.toLowerCase}",
              s"com.github.j5ik2o.reactive.aws.${baseName.toLowerCase}.metrics")
  case (s, tn, _) if tn == "JavaSyncClientMetricsInterceptor" =>
    s.replace(s"software.amazon.awssdk.services.${baseName.toLowerCase}",
              s"com.github.j5ik2o.reactive.aws.${baseName.toLowerCase}.metrics")
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace(s"software.amazon.awssdk.services.${baseName.toLowerCase}.model",
              s"com.github.j5ik2o.reactive.aws.${baseName.toLowerCase}.model.ops")
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"                                 => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client"                                      => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient"                          => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsClient"                               => true
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                         => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("ResponseMetadata")                               => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract => true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    Seq(s"${sdkBaseName.value}Client",
        s"${sdkBaseName.value}AsyncClient",
        "JavaAsyncClientMetricsInterceptor",
        "JavaSyncClientMetricsInterceptor")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client" => Seq(s"${sdkBaseName.value}SyncClient")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    Seq(s"${sdkBaseName.value}StreamsClient", s"${sdkBaseName.value}StreamsAsyncClient")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsClient" => Seq(s"${sdkBaseName.value}StreamsSyncClient")
  case cd if cd.packageName.exists(_.endsWith("model"))                => Seq(cd.simpleTypeName + "Ops")
  case cd                                                              => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case (f, cd) if f == s"${sdkBaseName.value}Client" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}Client.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}AsyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}AsyncClient.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}SyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}Client" =>
    s"${sdkBaseName.value}SyncClient.ftl"

  case (f, cd)
      if f == s"${sdkBaseName.value}StreamsClient" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    s"${sdkBaseName.value}StreamsClient.ftl"
  case (f, cd)
      if f == s"${sdkBaseName.value}StreamsAsyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    s"${sdkBaseName.value}StreamsAsyncClient.ftl"
  case (f, cd)
      if f == s"${sdkBaseName.value}StreamsSyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsClient" =>
    s"${sdkBaseName.value}StreamsSyncClient.ftl"

  case ("JavaAsyncClientMetricsInterceptor", cd: ClassDesc)
      if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    "JavaAsyncClientMetricsInterceptor.ftl"
  case ("JavaSyncClientMetricsInterceptor", cd: ClassDesc) if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    "JavaSyncClientMetricsInterceptor.ftl"

  case (f, cd: ClassDesc) if f.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"

  case (f, cd) => throw new Exception(s"error: $f, ${cd.simpleTypeName}")
}
