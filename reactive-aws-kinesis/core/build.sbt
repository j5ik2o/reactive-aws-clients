import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenCoreSettings

sdkBaseName := "Kinesis"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % sdkBaseName.value.toLowerCase % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"                                 => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client"                                      => true
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
