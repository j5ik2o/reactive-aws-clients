// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackInstancesRequestBuilderOps(val self: ListStackInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackInstanceAccountAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v => self.stackInstanceAccount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackInstanceRegionAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v => self.stackInstanceRegion(v) }
  }

}

final class ListStackInstancesRequestOps(val self: ListStackInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackInstanceAccountAsScala: Option[String] = Option(self.stackInstanceAccount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackInstanceRegionAsScala: Option[String] = Option(self.stackInstanceRegion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackInstancesRequestOps {

  implicit def toListStackInstancesRequestBuilderOps(
      v: ListStackInstancesRequest.Builder
  ): ListStackInstancesRequestBuilderOps = new ListStackInstancesRequestBuilderOps(v)

  implicit def toListStackInstancesRequestOps(v: ListStackInstancesRequest): ListStackInstancesRequestOps =
    new ListStackInstancesRequestOps(v)

}
