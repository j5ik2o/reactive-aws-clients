import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenDynamoDBBaseSettings

// logLevel := Level.Debug,

name := "reactive-aws-dynamodb-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "dynamodb" % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, tn, _) if tn.endsWith("Ops") =>
    s.replace("software.amazon.awssdk.services.dynamodb.model", "com.github.j5ik2o.reactive.aws.dynamodb.model.ops")
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services.dynamodb", "com.github.j5ik2o.reactive.aws.dynamodb")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient"                                              => true
  case cd if cd.simpleTypeName == "DynamoDbClient"                                                   => true
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")                                      => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")                                         => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("ResponseMetadata")                               => false
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract => true
  case cd: EnumDesc if cd.packageName.exists(_.endsWith("model"))                                    => true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    Seq("DynamoDBClient", "DynamoDBAsyncClient")
  case cd if cd.simpleTypeName == "DynamoDbClient"      => Seq("DynamoDBSyncClient")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName, cd.simpleTypeName + "Ops")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("DynamoDBClient", cd) if cd.simpleTypeName == "DynamoDbAsyncClient" => "DynamoDBClient.ftl"
  case ("DynamoDBAsyncClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    "DynamoDBAsyncClient.ftl"
  case ("DynamoDBSyncClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbClient" =>
    "DynamoDBSyncClient.ftl"

  case (s, cd: EnumDesc) if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "EnumOps.ftl"
  case (s, cd: ClassDesc)
      if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName
        .endsWith("Request") && !Seq("WriteRequest", "PutRequest", "DeleteRequest").contains(cd.simpleTypeName) =>
    "RequestOps.ftl"
  case (s, cd: ClassDesc)
      if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName
        .endsWith("Response") && cd.simpleTypeName != "ItemResponse" =>
    "ResponseOps.ftl"
  case (s, cd: ClassDesc) if s.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"

  case (_, cd: EnumDesc) if cd.packageName.exists(_.endsWith("model")) => "EnumModel.ftl"
  case (_, cd: ClassDesc)
      if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && cd.simpleTypeName == "AttributeValue" =>
    "ModelWithSupport.ftl"
  case (_, cd: ClassDesc)
      if cd.simpleTypeName.endsWith("Response") && cd.packageName.exists(_.endsWith("model")) && !cd.isStatic =>
    "ResponseModel.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic => "Model.ftl"
  case (_, cd)                                                                          => throw new Exception(s"error: ${cd}")
}
