// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListClustersRequestBuilderOps(val self: ListClustersRequest.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): ListClustersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListClustersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListClustersRequestOps(val self: ListClustersRequest) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListClustersRequestOps {

  implicit def toListClustersRequestBuilderOps(v: ListClustersRequest.Builder): ListClustersRequestBuilderOps =
    new ListClustersRequestBuilderOps(v)

  implicit def toListClustersRequestOps(v: ListClustersRequest): ListClustersRequestOps = new ListClustersRequestOps(v)

}
