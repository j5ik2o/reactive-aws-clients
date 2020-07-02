// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeRegionsRequestBuilderOps(val self: DescribeRegionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeRegionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNamesAsScala(value: Option[Seq[String]]): DescribeRegionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regionNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allRegionsAsScala(value: Option[Boolean]): DescribeRegionsRequest.Builder = {
    value.fold(self) { v => self.allRegions(v) }
  }

}

final class DescribeRegionsRequestOps(val self: DescribeRegionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNamesAsScala: Option[Seq[String]] =
    Option(self.regionNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allRegionsAsScala: Option[Boolean] = Option(self.allRegions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRegionsRequestOps {

  implicit def toDescribeRegionsRequestBuilderOps(v: DescribeRegionsRequest.Builder): DescribeRegionsRequestBuilderOps =
    new DescribeRegionsRequestBuilderOps(v)

  implicit def toDescribeRegionsRequestOps(v: DescribeRegionsRequest): DescribeRegionsRequestOps =
    new DescribeRegionsRequestOps(v)

}
