// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClassicLinkInstancesResponseBuilderOps(val self: DescribeClassicLinkInstancesResponse.Builder)
    extends AnyVal {

  final def instancesAsScala(value: Option[Seq[ClassicLinkInstance]]): DescribeClassicLinkInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClassicLinkInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClassicLinkInstancesResponseOps(val self: DescribeClassicLinkInstancesResponse) extends AnyVal {

  final def instancesAsScala: Option[Seq[ClassicLinkInstance]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClassicLinkInstancesResponseOps {

  implicit def toDescribeClassicLinkInstancesResponseBuilderOps(
      v: DescribeClassicLinkInstancesResponse.Builder
  ): DescribeClassicLinkInstancesResponseBuilderOps = new DescribeClassicLinkInstancesResponseBuilderOps(v)

  implicit def toDescribeClassicLinkInstancesResponseOps(
      v: DescribeClassicLinkInstancesResponse
  ): DescribeClassicLinkInstancesResponseOps = new DescribeClassicLinkInstancesResponseOps(v)

}
