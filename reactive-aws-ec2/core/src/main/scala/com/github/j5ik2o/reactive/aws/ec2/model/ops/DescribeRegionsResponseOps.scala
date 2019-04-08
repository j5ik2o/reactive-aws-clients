// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeRegionsResponseBuilderOps(val self: DescribeRegionsResponse.Builder) extends AnyVal {

  final def regionsAsScala(value: Option[Seq[Region]]): DescribeRegionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regions(v.asJava)
    }
  }

}

final class DescribeRegionsResponseOps(val self: DescribeRegionsResponse) extends AnyVal {

  final def regionsAsScala: Option[Seq[Region]] = Option(self.regions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRegionsResponseOps {

  implicit def toDescribeRegionsResponseBuilderOps(
      v: DescribeRegionsResponse.Builder
  ): DescribeRegionsResponseBuilderOps = new DescribeRegionsResponseBuilderOps(v)

  implicit def toDescribeRegionsResponseOps(v: DescribeRegionsResponse): DescribeRegionsResponseOps =
    new DescribeRegionsResponseOps(v)

}
