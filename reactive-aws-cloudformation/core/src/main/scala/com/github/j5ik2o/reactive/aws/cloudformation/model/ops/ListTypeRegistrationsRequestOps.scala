// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListTypeRegistrationsRequestBuilderOps(val self: ListTypeRegistrationsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): ListTypeRegistrationsRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): ListTypeRegistrationsRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeArnAsScala(value: Option[String]): ListTypeRegistrationsRequest.Builder = {
    value.fold(self) { v =>
      self.typeArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationStatusFilterAsScala(value: Option[RegistrationStatus]): ListTypeRegistrationsRequest.Builder = {
    value.fold(self) { v =>
      self.registrationStatusFilter(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListTypeRegistrationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypeRegistrationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTypeRegistrationsRequestOps(val self: ListTypeRegistrationsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeArnAsScala: Option[String] = Option(self.typeArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationStatusFilterAsScala: Option[RegistrationStatus] = Option(self.registrationStatusFilter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypeRegistrationsRequestOps {

  implicit def toListTypeRegistrationsRequestBuilderOps(
      v: ListTypeRegistrationsRequest.Builder
  ): ListTypeRegistrationsRequestBuilderOps = new ListTypeRegistrationsRequestBuilderOps(v)

  implicit def toListTypeRegistrationsRequestOps(v: ListTypeRegistrationsRequest): ListTypeRegistrationsRequestOps =
    new ListTypeRegistrationsRequestOps(v)

}
