// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTagsResponseBuilderOps(val self: DescribeTagsResponse.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeTagsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[TagDescription]]): DescribeTagsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class DescribeTagsResponseOps(val self: DescribeTagsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def tagsAsScala: Option[Seq[TagDescription]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTagsResponseOps {

  implicit def toDescribeTagsResponseBuilderOps(v: DescribeTagsResponse.Builder): DescribeTagsResponseBuilderOps =
    new DescribeTagsResponseBuilderOps(v)

  implicit def toDescribeTagsResponseOps(v: DescribeTagsResponse): DescribeTagsResponseOps =
    new DescribeTagsResponseOps(v)

}
