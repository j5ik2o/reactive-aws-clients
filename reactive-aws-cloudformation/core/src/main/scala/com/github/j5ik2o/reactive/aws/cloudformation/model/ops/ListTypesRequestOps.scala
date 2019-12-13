// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListTypesRequestBuilderOps(val self: ListTypesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityAsScala(value: Option[Visibility]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.visibility(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisioningTypeAsScala(value: Option[ProvisioningType]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.provisioningType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deprecatedStatusAsScala(value: Option[DeprecatedStatus]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.deprecatedStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTypesRequestOps(val self: ListTypesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityAsScala: Option[Visibility] = Option(self.visibility)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisioningTypeAsScala: Option[ProvisioningType] = Option(self.provisioningType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deprecatedStatusAsScala: Option[DeprecatedStatus] = Option(self.deprecatedStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypesRequestOps {

  implicit def toListTypesRequestBuilderOps(v: ListTypesRequest.Builder): ListTypesRequestBuilderOps =
    new ListTypesRequestBuilderOps(v)

  implicit def toListTypesRequestOps(v: ListTypesRequest): ListTypesRequestOps = new ListTypesRequestOps(v)

}
