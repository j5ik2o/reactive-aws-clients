// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListClustersRequestBuilderOps(val self: ListClustersRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListClustersRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListClustersRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListClustersRequestOps(val self: ListClustersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListClustersRequestOps {

  implicit def toListClustersRequestBuilderOps(v: ListClustersRequest.Builder): ListClustersRequestBuilderOps =
    new ListClustersRequestBuilderOps(v)

  implicit def toListClustersRequestOps(v: ListClustersRequest): ListClustersRequestOps = new ListClustersRequestOps(v)

}
