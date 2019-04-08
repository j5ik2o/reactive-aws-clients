// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetOperationResultsRequestBuilderOps(val self: ListStackSetOperationResultsRequest.Builder)
    extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def operationIdAsScala(value: Option[String]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): ListStackSetOperationResultsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListStackSetOperationResultsRequestOps(val self: ListStackSetOperationResultsRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def operationIdAsScala: Option[String] = Option(self.operationId) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

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
