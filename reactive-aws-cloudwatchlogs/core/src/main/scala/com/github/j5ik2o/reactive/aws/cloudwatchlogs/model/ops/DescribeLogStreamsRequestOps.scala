// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeLogStreamsRequestBuilderOps(val self: DescribeLogStreamsRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def logStreamNamePrefixAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamNamePrefix(v)
    }
  } // String

  final def orderByAsScala(value: Option[OrderBy]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.orderBy(v)
    }
  } // OrderBy

  final def descendingAsScala(value: Option[Boolean]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.descending(v)
    }
  } // Boolean

  final def nextTokenAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

}

final class DescribeLogStreamsRequestOps(val self: DescribeLogStreamsRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix) // String

  final def orderByAsScala: Option[OrderBy] = Option(self.orderBy) // OrderBy

  final def descendingAsScala: Option[Boolean] = Option(self.descending) // Boolean

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLogStreamsRequestOps {

  implicit def toDescribeLogStreamsRequestBuilderOps(
      v: DescribeLogStreamsRequest.Builder
  ): DescribeLogStreamsRequestBuilderOps = new DescribeLogStreamsRequestBuilderOps(v)

  implicit def toDescribeLogStreamsRequestOps(v: DescribeLogStreamsRequest): DescribeLogStreamsRequestOps =
    new DescribeLogStreamsRequestOps(v)

}
