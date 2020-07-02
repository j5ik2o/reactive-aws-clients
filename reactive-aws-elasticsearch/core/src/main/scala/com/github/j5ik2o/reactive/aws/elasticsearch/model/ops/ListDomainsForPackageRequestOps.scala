// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListDomainsForPackageRequestBuilderOps(val self: ListDomainsForPackageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala(value: Option[String]): ListDomainsForPackageRequest.Builder = {
    value.fold(self) { v => self.packageID(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListDomainsForPackageRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDomainsForPackageRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListDomainsForPackageRequestOps(val self: ListDomainsForPackageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala: Option[String] = Option(self.packageID)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDomainsForPackageRequestOps {

  implicit def toListDomainsForPackageRequestBuilderOps(
      v: ListDomainsForPackageRequest.Builder
  ): ListDomainsForPackageRequestBuilderOps = new ListDomainsForPackageRequestBuilderOps(v)

  implicit def toListDomainsForPackageRequestOps(v: ListDomainsForPackageRequest): ListDomainsForPackageRequestOps =
    new ListDomainsForPackageRequestOps(v)

}
