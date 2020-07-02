// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeLogStreamsRequestBuilderOps(val self: DescribeLogStreamsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamePrefixAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v => self.logStreamNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def orderByAsScala(value: Option[OrderBy]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v => self.orderBy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descendingAsScala(value: Option[Boolean]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v => self.descending(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeLogStreamsRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

}

final class DescribeLogStreamsRequestOps(val self: DescribeLogStreamsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def orderByAsScala: Option[OrderBy] = Option(self.orderBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descendingAsScala: Option[Boolean] = Option(self.descending)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
