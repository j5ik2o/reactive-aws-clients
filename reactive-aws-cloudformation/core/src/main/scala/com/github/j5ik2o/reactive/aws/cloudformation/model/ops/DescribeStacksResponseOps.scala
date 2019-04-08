// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStacksResponseBuilderOps(val self: DescribeStacksResponse.Builder) extends AnyVal {

  final def stacksAsScala(value: Option[Seq[Stack]]): DescribeStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stacks(v.asJava)
    } // Seq[Stack]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStacksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeStacksResponseOps(val self: DescribeStacksResponse) extends AnyVal {

  final def stacksAsScala: Option[Seq[Stack]] = Option(self.stacks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Stack]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStacksResponseOps {

  implicit def toDescribeStacksResponseBuilderOps(v: DescribeStacksResponse.Builder): DescribeStacksResponseBuilderOps =
    new DescribeStacksResponseBuilderOps(v)

  implicit def toDescribeStacksResponseOps(v: DescribeStacksResponse): DescribeStacksResponseOps =
    new DescribeStacksResponseOps(v)

}
