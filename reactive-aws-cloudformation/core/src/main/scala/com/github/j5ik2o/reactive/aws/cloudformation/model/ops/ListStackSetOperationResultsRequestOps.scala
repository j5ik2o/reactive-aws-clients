// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetOperationResultsRequestBuilderOps(val self: ListStackSetOperationResultsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListStackSetOperationResultsRequestOps(val self: ListStackSetOperationResultsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackSetOperationResultsRequestOps {

  implicit def toListStackSetOperationResultsRequestBuilderOps(
      v: ListStackSetOperationResultsRequest.Builder
  ): ListStackSetOperationResultsRequestBuilderOps = new ListStackSetOperationResultsRequestBuilderOps(v)

  implicit def toListStackSetOperationResultsRequestOps(
      v: ListStackSetOperationResultsRequest
  ): ListStackSetOperationResultsRequestOps = new ListStackSetOperationResultsRequestOps(v)

}
