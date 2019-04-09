import Settings._

scalaWrapperGenBaseSettings("Monix", "monix")

sdkBaseName := "Ec2"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-monix"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
