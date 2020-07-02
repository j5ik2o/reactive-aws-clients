// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListNodegroupsRequestBuilderOps(val self: ListNodegroupsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): ListNodegroupsRequest.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListNodegroupsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListNodegroupsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListNodegroupsRequestOps(val self: ListNodegroupsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListNodegroupsRequestOps {

  implicit def toListNodegroupsRequestBuilderOps(v: ListNodegroupsRequest.Builder): ListNodegroupsRequestBuilderOps =
    new ListNodegroupsRequestBuilderOps(v)

  implicit def toListNodegroupsRequestOps(v: ListNodegroupsRequest): ListNodegroupsRequestOps =
    new ListNodegroupsRequestOps(v)

}
