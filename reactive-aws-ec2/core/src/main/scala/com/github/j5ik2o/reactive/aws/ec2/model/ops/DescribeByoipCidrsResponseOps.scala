// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeByoipCidrsResponseBuilderOps(val self: DescribeByoipCidrsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrsAsScala(value: Option[Seq[ByoipCidr]]): DescribeByoipCidrsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.byoipCidrs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeByoipCidrsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeByoipCidrsResponseOps(val self: DescribeByoipCidrsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrsAsScala: Option[Seq[ByoipCidr]] =
    Option(self.byoipCidrs).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeByoipCidrsResponseOps {

  implicit def toDescribeByoipCidrsResponseBuilderOps(
      v: DescribeByoipCidrsResponse.Builder
  ): DescribeByoipCidrsResponseBuilderOps = new DescribeByoipCidrsResponseBuilderOps(v)

  implicit def toDescribeByoipCidrsResponseOps(v: DescribeByoipCidrsResponse): DescribeByoipCidrsResponseOps =
    new DescribeByoipCidrsResponseOps(v)

}
