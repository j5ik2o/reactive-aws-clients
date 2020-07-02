// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeDestinationsResponseBuilderOps(val self: DescribeDestinationsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationsAsScala(value: Option[Seq[Destination]]): DescribeDestinationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.destinations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeDestinationsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeDestinationsResponseOps(val self: DescribeDestinationsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationsAsScala: Option[Seq[Destination]] =
    Option(self.destinations).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDestinationsResponseOps {

  implicit def toDescribeDestinationsResponseBuilderOps(
      v: DescribeDestinationsResponse.Builder
  ): DescribeDestinationsResponseBuilderOps = new DescribeDestinationsResponseBuilderOps(v)

  implicit def toDescribeDestinationsResponseOps(v: DescribeDestinationsResponse): DescribeDestinationsResponseOps =
    new DescribeDestinationsResponseOps(v)

}
