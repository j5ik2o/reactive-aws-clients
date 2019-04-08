// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackResourcesRequestBuilderOps(val self: ListStackResourcesRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): ListStackResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListStackResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListStackResourcesRequestOps(val self: ListStackResourcesRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackResourcesRequestOps {

  implicit def toListStackResourcesRequestBuilderOps(
      v: ListStackResourcesRequest.Builder
  ): ListStackResourcesRequestBuilderOps = new ListStackResourcesRequestBuilderOps(v)

  implicit def toListStackResourcesRequestOps(v: ListStackResourcesRequest): ListStackResourcesRequestOps =
    new ListStackResourcesRequestOps(v)

}
