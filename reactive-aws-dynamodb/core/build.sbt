import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenDynamoDBBaseSettings

// logLevel := Level.Debug,

name := "reactive-aws-dynamodb-core"

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  _.replace("software.amazon.awssdk.services.dynamodb", "com.github.j5ik2o.reactive.aws.dynamodb")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient"                                              => true
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                         => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract => true
  case cd: EnumDesc if cd.packageName.exists(_.endsWith("model"))                                    => true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" => Seq("DynamoDBClient")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("DynamoDBClient", cd) if cd.simpleTypeName == "DynamoDbAsyncClient" => "DynamoDBClient.ftl"
  case (_, _: EnumDesc)                                                     => "EnumModel.ftl"
  case (_, cd: ClassDesc)
      if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && cd.simpleTypeName == "AttributeValue" =>
    "ModelWithSupport.ftl"
  case (_, cd: ClassDesc)
      if cd.simpleTypeName.endsWith("Response") && cd.packageName.exists(_.endsWith("model")) && !cd.isStatic =>
    "ResponseModel.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic => "Model.ftl"
  case (_, cd)                                                                          => throw new Exception(s"error: ${cd}")
}
