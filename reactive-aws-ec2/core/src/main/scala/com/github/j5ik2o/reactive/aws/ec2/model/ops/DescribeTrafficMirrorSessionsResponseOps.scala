// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTrafficMirrorSessionsResponseBuilderOps(val self: DescribeTrafficMirrorSessionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionsAsScala(
      value: Option[Seq[TrafficMirrorSession]]
  ): DescribeTrafficMirrorSessionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.trafficMirrorSessions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTrafficMirrorSessionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTrafficMirrorSessionsResponseOps(val self: DescribeTrafficMirrorSessionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionsAsScala: Option[Seq[TrafficMirrorSession]] = Option(self.trafficMirrorSessions).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTrafficMirrorSessionsResponseOps {

  implicit def toDescribeTrafficMirrorSessionsResponseBuilderOps(
      v: DescribeTrafficMirrorSessionsResponse.Builder
  ): DescribeTrafficMirrorSessionsResponseBuilderOps = new DescribeTrafficMirrorSessionsResponseBuilderOps(v)

  implicit def toDescribeTrafficMirrorSessionsResponseOps(
      v: DescribeTrafficMirrorSessionsResponse
  ): DescribeTrafficMirrorSessionsResponseOps = new DescribeTrafficMirrorSessionsResponseOps(v)

}
