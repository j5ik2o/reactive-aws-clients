// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetInstancesResponseBuilderOps(val self: DescribeFleetInstancesResponse.Builder) extends AnyVal {

  final def activeInstancesAsScala(value: Option[Seq[ActiveInstance]]): DescribeFleetInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.activeInstances(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFleetInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): DescribeFleetInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

}

final class DescribeFleetInstancesResponseOps(val self: DescribeFleetInstancesResponse) extends AnyVal {

  final def activeInstancesAsScala: Option[Seq[ActiveInstance]] = Option(self.activeInstances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
