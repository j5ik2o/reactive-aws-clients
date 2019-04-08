// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeRegionsRequestBuilderOps(val self: DescribeRegionsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeRegionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def regionNamesAsScala(value: Option[Seq[String]]): DescribeRegionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regionNames(v.asJava)
    }
  }

}

final class DescribeRegionsRequestOps(val self: DescribeRegionsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def regionNamesAsScala: Option[Seq[String]] = Option(self.regionNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRegionsRequestOps {

  implicit def toDescribeRegionsRequestBuilderOps(v: DescribeRegionsRequest.Builder): DescribeRegionsRequestBuilderOps =
    new DescribeRegionsRequestBuilderOps(v)

  implicit def toDescribeRegionsRequestOps(v: DescribeRegionsRequest): DescribeRegionsRequestOps =
    new DescribeRegionsRequestOps(v)

}
