// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeProjectVersionsResponseBuilderOps(val self: DescribeProjectVersionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionDescriptionsAsScala(
      value: Option[Seq[ProjectVersionDescription]]
  ): DescribeProjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.projectVersionDescriptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeProjectVersionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeProjectVersionsResponseOps(val self: DescribeProjectVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionDescriptionsAsScala: Option[Seq[ProjectVersionDescription]] =
    Option(self.projectVersionDescriptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeProjectVersionsResponseOps {

  implicit def toDescribeProjectVersionsResponseBuilderOps(
      v: DescribeProjectVersionsResponse.Builder
  ): DescribeProjectVersionsResponseBuilderOps = new DescribeProjectVersionsResponseBuilderOps(v)

  implicit def toDescribeProjectVersionsResponseOps(
      v: DescribeProjectVersionsResponse
  ): DescribeProjectVersionsResponseOps = new DescribeProjectVersionsResponseOps(v)

}
