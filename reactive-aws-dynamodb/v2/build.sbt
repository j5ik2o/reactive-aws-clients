import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenDynamoDBBaseSettings

name := "reactive-aws-dynamodb-v2"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "dynamodb" % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  _.replace("software.amazon.awssdk.services.dynamodb", "com.github.j5ik2o.reactive.aws.dynamodb.v2")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient"         => true
  case cd if cd.simpleTypeName == "DynamoDbClient"              => true
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception") => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")    => false
  case cd: ClassDesc
      if cd.simpleTypeName == "DynamoDbResponseMetadata" || cd.simpleTypeName == "DynamoDbStreamsResponseMetadata" =>
    false
  case cd: EnumDesc if cd.packageName.exists(_.endsWith("model")) => true
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract =>
    true
  case cd =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    Seq("DynamoDBAsyncClient", "DynamoDBAsyncClientImpl")
  case cd if cd.simpleTypeName == "DynamoDbClient" =>
    Seq("DynamoDBSyncClient", "DynamoDBSyncClientImpl")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("DynamoDBAsyncClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    "DynamoDBAsyncClient.ftl"
  case ("DynamoDBAsyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    "DynamoDBAsyncClientImpl.ftl"
  case ("DynamoDBSyncClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbClient" =>
    "DynamoDBSyncClient.ftl"
  case ("DynamoDBSyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbClient" =>
    "DynamoDBSyncClientImpl.ftl"
  case (_, cd: ClassDesc)
      if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName
        .endsWith("Request") && !Seq("WriteRequest", "PutRequest", "DeleteRequest").contains(cd.simpleTypeName) =>
    "RequestOps.ftl"
  case (_, cd: ClassDesc)
      if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName
        .endsWith("Response") && cd.simpleTypeName != "ItemResponse" =>
    "ResponseOps.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
  case (_, cd: EnumDesc) if cd.packageName.exists(_.endsWith("model"))  => "EnumOps.ftl"
  case (name, cd)                                                       => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
