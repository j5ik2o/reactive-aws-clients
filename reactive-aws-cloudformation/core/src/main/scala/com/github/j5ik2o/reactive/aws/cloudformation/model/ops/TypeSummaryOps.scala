// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class TypeSummaryBuilderOps(val self: TypeSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): TypeSummary.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): TypeSummary.Builder = {
    value.fold(self) { v => self.typeName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionIdAsScala(value: Option[String]): TypeSummary.Builder = {
    value.fold(self) { v => self.defaultVersionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeArnAsScala(value: Option[String]): TypeSummary.Builder = {
    value.fold(self) { v => self.typeArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedAsScala(value: Option[java.time.Instant]): TypeSummary.Builder = {
    value.fold(self) { v => self.lastUpdated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TypeSummary.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class TypeSummaryOps(val self: TypeSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionIdAsScala: Option[String] = Option(self.defaultVersionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeArnAsScala: Option[String] = Option(self.typeArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedAsScala: Option[java.time.Instant] = Option(self.lastUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTypeSummaryOps {

  implicit def toTypeSummaryBuilderOps(v: TypeSummary.Builder): TypeSummaryBuilderOps = new TypeSummaryBuilderOps(v)

  implicit def toTypeSummaryOps(v: TypeSummary): TypeSummaryOps = new TypeSummaryOps(v)

}
