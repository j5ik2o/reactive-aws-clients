// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetInstancesResponseBuilderOps(val self: DescribeFleetInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeInstancesAsScala(value: Option[Seq[ActiveInstance]]): DescribeFleetInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.activeInstances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeFleetInstancesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fleetIdAsScala(value: Option[String]): DescribeFleetInstancesResponse.Builder = {
    value.fold(self) { v => self.fleetId(v) }
  }

}

final class DescribeFleetInstancesResponseOps(val self: DescribeFleetInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeInstancesAsScala: Option[Seq[ActiveInstance]] =
    Option(self.activeInstances).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetInstancesResponseOps {

  implicit def toDescribeFleetInstancesResponseBuilderOps(
      v: DescribeFleetInstancesResponse.Builder
  ): DescribeFleetInstancesResponseBuilderOps = new DescribeFleetInstancesResponseBuilderOps(v)

  implicit def toDescribeFleetInstancesResponseOps(
      v: DescribeFleetInstancesResponse
  ): DescribeFleetInstancesResponseOps = new DescribeFleetInstancesResponseOps(v)

}
