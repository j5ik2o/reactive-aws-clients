import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenDynamoDBBaseSettings

name := "reactive-aws-dynamodb-monix"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services.dynamodb", "com.github.j5ik2o.reactive.aws.dynamodb.monix")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient"        => true
  case cd if cd.simpleTypeName == "DynamoDbStreamsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    Seq("DynamoDBMonixClient")
  case cd if cd.simpleTypeName == "DynamoDbStreamsAsyncClient" =>
    Seq("DynamoDBStreamsMonixClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("DynamoDBMonixClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    "DynamoDBMonixClient.ftl"
  case ("DynamoDBStreamsMonixClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbStreamsAsyncClient" =>
    "DynamoDBStreamsMonixClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
