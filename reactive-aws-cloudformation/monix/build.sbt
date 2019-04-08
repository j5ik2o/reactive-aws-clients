import Settings._

coreSettings

scalaWrapperGenBaseSettings("Monix", "monix")

sdkBaseName := "CloudFormation"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-monix"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
