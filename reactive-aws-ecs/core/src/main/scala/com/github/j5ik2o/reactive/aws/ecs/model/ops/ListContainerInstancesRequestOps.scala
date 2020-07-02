// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListContainerInstancesRequestBuilderOps(val self: ListContainerInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): ListContainerInstancesRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala(value: Option[String]): ListContainerInstancesRequest.Builder = {
    value.fold(self) { v => self.filter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListContainerInstancesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListContainerInstancesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ContainerInstanceStatus]): ListContainerInstancesRequest.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class ListContainerInstancesRequestOps(val self: ListContainerInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala: Option[String] = Option(self.filter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ContainerInstanceStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListContainerInstancesRequestOps {

  implicit def toListContainerInstancesRequestBuilderOps(
      v: ListContainerInstancesRequest.Builder
  ): ListContainerInstancesRequestBuilderOps = new ListContainerInstancesRequestBuilderOps(v)

  implicit def toListContainerInstancesRequestOps(v: ListContainerInstancesRequest): ListContainerInstancesRequestOps =
    new ListContainerInstancesRequestOps(v)

}
