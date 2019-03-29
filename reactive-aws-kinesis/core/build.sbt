import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenKinesisBaseSettings

name := "reactive-aws-kinesis-core"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  _.replace("software.amazon.awssdk.services.kinesis", "com.github.j5ik2o.reactive.aws.kinesis")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient"                                               => true
  case cd: ClassDesc if cd.simpleTypeName.startsWith("Default")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Handler")                                        => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                         => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract => true
  case cd: EnumDesc if cd.packageName.exists(_.endsWith("model"))                                    => true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" => Seq("KinesisClient")
  case cd                                              => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("KinesisClient", cd) if cd.simpleTypeName == "KinesisAsyncClient" => "KinesisClient.ftl"
  case (_, _: EnumDesc)                                                   => "EnumModel.ftl"
  case (_, cd: ClassDesc)
      if cd.simpleTypeName.endsWith("Response") && cd.packageName.exists(_.endsWith("model")) && !cd.isStatic =>
    "ResponseModel.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic => "Model.ftl"
  case (_, cd)                                                                          => throw new Exception(s"error: ${cd}")
}
