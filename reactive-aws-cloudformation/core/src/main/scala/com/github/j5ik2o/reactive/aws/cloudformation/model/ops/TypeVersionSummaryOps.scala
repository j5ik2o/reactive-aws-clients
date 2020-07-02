// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class TypeVersionSummaryBuilderOps(val self: TypeVersionSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): TypeVersionSummary.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): TypeVersionSummary.Builder = {
    value.fold(self) { v => self.typeName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): TypeVersionSummary.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): TypeVersionSummary.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeCreatedAsScala(value: Option[java.time.Instant]): TypeVersionSummary.Builder = {
    value.fold(self) { v => self.timeCreated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TypeVersionSummary.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class TypeVersionSummaryOps(val self: TypeVersionSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeCreatedAsScala: Option[java.time.Instant] = Option(self.timeCreated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTypeVersionSummaryOps {

  implicit def toTypeVersionSummaryBuilderOps(v: TypeVersionSummary.Builder): TypeVersionSummaryBuilderOps =
    new TypeVersionSummaryBuilderOps(v)

  implicit def toTypeVersionSummaryOps(v: TypeVersionSummary): TypeVersionSummaryOps = new TypeVersionSummaryOps(v)

}
