// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeQueriesRequestBuilderOps(val self: DescribeQueriesRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DescribeQueriesRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def statusAsScala(value: Option[QueryStatus]): DescribeQueriesRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // QueryStatus

  final def maxResultsAsScala(value: Option[Int]): DescribeQueriesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeQueriesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeQueriesRequestOps(val self: DescribeQueriesRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def statusAsScala: Option[QueryStatus] = Option(self.status) // QueryStatus

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeQueriesRequestOps {

  implicit def toDescribeQueriesRequestBuilderOps(v: DescribeQueriesRequest.Builder): DescribeQueriesRequestBuilderOps =
    new DescribeQueriesRequestBuilderOps(v)

  implicit def toDescribeQueriesRequestOps(v: DescribeQueriesRequest): DescribeQueriesRequestOps =
    new DescribeQueriesRequestOps(v)

}
