import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenBaseSettings("Monix", "monix")

sdkBaseName := "DynamoDb"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-monix"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"        => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    Seq(s"${sdkBaseName.value}MonixClient")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    Seq(s"${sdkBaseName.value}StreamsMonixClient")
}

templateNameMapper in scalaWrapperGen := {
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}MonixClient" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}MonixClient.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}StreamsMonixClient" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    s"${sdkBaseName.value}StreamsMonixClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
