// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeDestinationsRequestBuilderOps(val self: DescribeDestinationsRequest.Builder) extends AnyVal {

  final def destinationNamePrefixAsScala(value: Option[String]): DescribeDestinationsRequest.Builder = {
    value.fold(self) { v =>
      self.destinationNamePrefix(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeDestinationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def limitAsScala(value: Option[Int]): DescribeDestinationsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

}

final class DescribeDestinationsRequestOps(val self: DescribeDestinationsRequest) extends AnyVal {

  final def destinationNamePrefixAsScala: Option[String] = Option(self.destinationNamePrefix)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDestinationsRequestOps {

  implicit def toDescribeDestinationsRequestBuilderOps(
      v: DescribeDestinationsRequest.Builder
  ): DescribeDestinationsRequestBuilderOps = new DescribeDestinationsRequestBuilderOps(v)

  implicit def toDescribeDestinationsRequestOps(v: DescribeDestinationsRequest): DescribeDestinationsRequestOps =
    new DescribeDestinationsRequestOps(v)

}
