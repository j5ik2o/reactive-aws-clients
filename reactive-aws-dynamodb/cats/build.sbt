import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenDynamoDBBaseSettings

name := "reactive-aws-dynamodb-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  _.replace("software.amazon.awssdk.services.dynamodb", "com.github.j5ik2o.reactive.aws.dynamodb.cats")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    Seq("DynamoDBReaderTFutureClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("DynamoDBReaderTFutureClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    "DynamoDBReaderTFutureClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
