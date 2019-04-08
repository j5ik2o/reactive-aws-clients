// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImagesResponseBuilderOps(val self: DescribeImagesResponse.Builder) extends AnyVal {

  final def imagesAsScala(value: Option[Seq[Image]]): DescribeImagesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.images(v.asJava)
    }
  }

}

final class DescribeImagesResponseOps(val self: DescribeImagesResponse) extends AnyVal {

  final def imagesAsScala: Option[Seq[Image]] = Option(self.images).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImagesResponseOps {

  implicit def toDescribeImagesResponseBuilderOps(v: DescribeImagesResponse.Builder): DescribeImagesResponseBuilderOps =
    new DescribeImagesResponseBuilderOps(v)

  implicit def toDescribeImagesResponseOps(v: DescribeImagesResponse): DescribeImagesResponseOps =
    new DescribeImagesResponseOps(v)

}
