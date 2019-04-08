// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcsResponseBuilderOps(val self: DescribeVpcsResponse.Builder) extends AnyVal {

  final def vpcsAsScala(value: Option[Seq[Vpc]]): DescribeVpcsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcs(v.asJava)
    }
  }

}

final class DescribeVpcsResponseOps(val self: DescribeVpcsResponse) extends AnyVal {

  final def vpcsAsScala: Option[Seq[Vpc]] = Option(self.vpcs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcsResponseOps {

  implicit def toDescribeVpcsResponseBuilderOps(v: DescribeVpcsResponse.Builder): DescribeVpcsResponseBuilderOps =
    new DescribeVpcsResponseBuilderOps(v)

  implicit def toDescribeVpcsResponseOps(v: DescribeVpcsResponse): DescribeVpcsResponseOps =
    new DescribeVpcsResponseOps(v)

}
