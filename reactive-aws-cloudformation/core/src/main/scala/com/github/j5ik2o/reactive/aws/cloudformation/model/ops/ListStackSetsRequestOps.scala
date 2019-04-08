// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetsRequestBuilderOps(val self: ListStackSetsRequest.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): ListStackSetsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): ListStackSetsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def statusAsScala(value: Option[StackSetStatus]): ListStackSetsRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // StackSetStatus

}

final class ListStackSetsRequestOps(val self: ListStackSetsRequest) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def statusAsScala: Option[StackSetStatus] = Option(self.status) // StackSetStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackSetsRequestOps {

  implicit def toListStackSetsRequestBuilderOps(v: ListStackSetsRequest.Builder): ListStackSetsRequestBuilderOps =
    new ListStackSetsRequestBuilderOps(v)

  implicit def toListStackSetsRequestOps(v: ListStackSetsRequest): ListStackSetsRequestOps =
    new ListStackSetsRequestOps(v)

}
