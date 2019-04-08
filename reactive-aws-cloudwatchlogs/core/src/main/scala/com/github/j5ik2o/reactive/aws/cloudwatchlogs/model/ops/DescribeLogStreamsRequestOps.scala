// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeLogStreamsRequestBuilderOps(val self: DescribeLogStreamsRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def logStreamNamePrefixAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamNamePrefix(v)
    }
  }

  final def orderByAsScala(value: Option[OrderBy]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.orderBy(v)
    }
  }

  final def descendingAsScala(value: Option[Boolean]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.descending(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def limitAsScala(value: Option[Int]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

}

final class DescribeLogStreamsRequestOps(val self: DescribeLogStreamsRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix)

  final def orderByAsScala: Option[OrderBy] = Option(self.orderBy)

  final def descendingAsScala: Option[Boolean] = Option(self.descending)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLogStreamsRequestOps {

  implicit def toDescribeLogStreamsRequestBuilderOps(
      v: DescribeLogStreamsRequest.Builder
  ): DescribeLogStreamsRequestBuilderOps = new DescribeLogStreamsRequestBuilderOps(v)

  implicit def toDescribeLogStreamsRequestOps(v: DescribeLogStreamsRequest): DescribeLogStreamsRequestOps =
    new DescribeLogStreamsRequestOps(v)

}
