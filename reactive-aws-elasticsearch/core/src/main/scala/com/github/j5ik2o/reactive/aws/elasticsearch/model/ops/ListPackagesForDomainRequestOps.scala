// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListPackagesForDomainRequestBuilderOps(val self: ListPackagesForDomainRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): ListPackagesForDomainRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListPackagesForDomainRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListPackagesForDomainRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListPackagesForDomainRequestOps(val self: ListPackagesForDomainRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPackagesForDomainRequestOps {

  implicit def toListPackagesForDomainRequestBuilderOps(
      v: ListPackagesForDomainRequest.Builder
  ): ListPackagesForDomainRequestBuilderOps = new ListPackagesForDomainRequestBuilderOps(v)

  implicit def toListPackagesForDomainRequestOps(v: ListPackagesForDomainRequest): ListPackagesForDomainRequestOps =
    new ListPackagesForDomainRequestOps(v)

}
