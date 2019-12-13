// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListTypeVersionsRequestBuilderOps(val self: ListTypeVersionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): ListTypeVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): ListTypeVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): ListTypeVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListTypeVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypeVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deprecatedStatusAsScala(value: Option[DeprecatedStatus]): ListTypeVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.deprecatedStatus(v)
    }
  }

}

final class ListTypeVersionsRequestOps(val self: ListTypeVersionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deprecatedStatusAsScala: Option[DeprecatedStatus] = Option(self.deprecatedStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypeVersionsRequestOps {

  implicit def toListTypeVersionsRequestBuilderOps(
      v: ListTypeVersionsRequest.Builder
  ): ListTypeVersionsRequestBuilderOps = new ListTypeVersionsRequestBuilderOps(v)

  implicit def toListTypeVersionsRequestOps(v: ListTypeVersionsRequest): ListTypeVersionsRequestOps =
    new ListTypeVersionsRequestOps(v)

}
