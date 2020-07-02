// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstancesResponseBuilderOps(val self: DescribeInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationsAsScala(value: Option[Seq[Reservation]]): DescribeInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInstancesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeInstancesResponseOps(val self: DescribeInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationsAsScala: Option[Seq[Reservation]] =
    Option(self.reservations).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstancesResponseOps {

  implicit def toDescribeInstancesResponseBuilderOps(
      v: DescribeInstancesResponse.Builder
  ): DescribeInstancesResponseBuilderOps = new DescribeInstancesResponseBuilderOps(v)

  implicit def toDescribeInstancesResponseOps(v: DescribeInstancesResponse): DescribeInstancesResponseOps =
    new DescribeInstancesResponseOps(v)

}
