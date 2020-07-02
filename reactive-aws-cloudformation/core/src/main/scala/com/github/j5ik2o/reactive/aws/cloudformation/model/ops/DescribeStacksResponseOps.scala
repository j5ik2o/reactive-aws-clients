// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStacksResponseBuilderOps(val self: DescribeStacksResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stacksAsScala(value: Option[Seq[Stack]]): DescribeStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stacks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeStacksResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeStacksResponseOps(val self: DescribeStacksResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stacksAsScala: Option[Seq[Stack]] =
    Option(self.stacks).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStacksResponseOps {

  implicit def toDescribeStacksResponseBuilderOps(v: DescribeStacksResponse.Builder): DescribeStacksResponseBuilderOps =
    new DescribeStacksResponseBuilderOps(v)

  implicit def toDescribeStacksResponseOps(v: DescribeStacksResponse): DescribeStacksResponseOps =
    new DescribeStacksResponseOps(v)

}
