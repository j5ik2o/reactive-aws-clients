// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostsResponseBuilderOps(val self: DescribeHostsResponse.Builder) extends AnyVal {

  final def hostsAsScala(value: Option[Seq[Host]]): DescribeHostsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hosts(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeHostsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeHostsResponseOps(val self: DescribeHostsResponse) extends AnyVal {

  final def hostsAsScala: Option[Seq[Host]] = Option(self.hosts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostsResponseOps {

  implicit def toDescribeHostsResponseBuilderOps(v: DescribeHostsResponse.Builder): DescribeHostsResponseBuilderOps =
    new DescribeHostsResponseBuilderOps(v)

  implicit def toDescribeHostsResponseOps(v: DescribeHostsResponse): DescribeHostsResponseOps =
    new DescribeHostsResponseOps(v)

}
