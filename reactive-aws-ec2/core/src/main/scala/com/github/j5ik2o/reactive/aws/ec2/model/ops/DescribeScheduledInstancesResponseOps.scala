// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeScheduledInstancesResponseBuilderOps(val self: DescribeScheduledInstancesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeScheduledInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceSetAsScala(
      value: Option[Seq[ScheduledInstance]]
  ): DescribeScheduledInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.scheduledInstanceSet(v.asJava)
    }
  }

}

final class DescribeScheduledInstancesResponseOps(val self: DescribeScheduledInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceSetAsScala: Option[Seq[ScheduledInstance]] = Option(self.scheduledInstanceSet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
