// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeScheduledInstancesResponseBuilderOps(val self: DescribeScheduledInstancesResponse.Builder)
    extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeScheduledInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def scheduledInstanceSetAsScala(
      value: Option[Seq[ScheduledInstance]]
  ): DescribeScheduledInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.scheduledInstanceSet(v.asJava)
    }
  }

}

final class DescribeScheduledInstancesResponseOps(val self: DescribeScheduledInstancesResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def scheduledInstanceSetAsScala: Option[Seq[ScheduledInstance]] = Option(self.scheduledInstanceSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeScheduledInstancesResponseOps {

  implicit def toDescribeScheduledInstancesResponseBuilderOps(
      v: DescribeScheduledInstancesResponse.Builder
  ): DescribeScheduledInstancesResponseBuilderOps = new DescribeScheduledInstancesResponseBuilderOps(v)

  implicit def toDescribeScheduledInstancesResponseOps(
      v: DescribeScheduledInstancesResponse
  ): DescribeScheduledInstancesResponseOps = new DescribeScheduledInstancesResponseOps(v)

}
