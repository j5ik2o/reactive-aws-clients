// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeImagesResponseBuilderOps(val self: DescribeImagesResponse.Builder) extends AnyVal {

  final def imageDetailsAsScala(value: Option[Seq[ImageDetail]]): DescribeImagesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imageDetails(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeImagesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeImagesResponseOps(val self: DescribeImagesResponse) extends AnyVal {

  final def imageDetailsAsScala: Option[Seq[ImageDetail]] = Option(self.imageDetails).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImagesResponseOps {

  implicit def toDescribeImagesResponseBuilderOps(v: DescribeImagesResponse.Builder): DescribeImagesResponseBuilderOps =
    new DescribeImagesResponseBuilderOps(v)

  implicit def toDescribeImagesResponseOps(v: DescribeImagesResponse): DescribeImagesResponseOps =
    new DescribeImagesResponseOps(v)

}
