// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeDestinationsRequestBuilderOps(val self: DescribeDestinationsRequest.Builder) extends AnyVal {

  final def destinationNamePrefixAsScala(value: Option[String]): DescribeDestinationsRequest.Builder = {
    value.fold(self) { v =>
      self.destinationNamePrefix(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): DescribeDestinationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): DescribeDestinationsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

}

final class DescribeDestinationsRequestOps(val self: DescribeDestinationsRequest) extends AnyVal {

  final def destinationNamePrefixAsScala: Option[String] = Option(self.destinationNamePrefix) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDestinationsRequestOps {

  implicit def toDescribeDestinationsRequestBuilderOps(
      v: DescribeDestinationsRequest.Builder
  ): DescribeDestinationsRequestBuilderOps = new DescribeDestinationsRequestBuilderOps(v)

  implicit def toDescribeDestinationsRequestOps(v: DescribeDestinationsRequest): DescribeDestinationsRequestOps =
    new DescribeDestinationsRequestOps(v)

}
