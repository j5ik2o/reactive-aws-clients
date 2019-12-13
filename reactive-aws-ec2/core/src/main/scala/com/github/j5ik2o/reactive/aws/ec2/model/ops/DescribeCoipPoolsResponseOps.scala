// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCoipPoolsResponseBuilderOps(val self: DescribeCoipPoolsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coipPoolsAsScala(value: Option[Seq[CoipPool]]): DescribeCoipPoolsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.coipPools(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeCoipPoolsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeCoipPoolsResponseOps(val self: DescribeCoipPoolsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coipPoolsAsScala: Option[Seq[CoipPool]] = Option(self.coipPools).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCoipPoolsResponseOps {

  implicit def toDescribeCoipPoolsResponseBuilderOps(
      v: DescribeCoipPoolsResponse.Builder
  ): DescribeCoipPoolsResponseBuilderOps = new DescribeCoipPoolsResponseBuilderOps(v)

  implicit def toDescribeCoipPoolsResponseOps(v: DescribeCoipPoolsResponse): DescribeCoipPoolsResponseOps =
    new DescribeCoipPoolsResponseOps(v)

}
