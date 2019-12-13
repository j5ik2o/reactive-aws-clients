// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeProjectsResponseBuilderOps(val self: DescribeProjectsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectDescriptionsAsScala(value: Option[Seq[ProjectDescription]]): DescribeProjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.projectDescriptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeProjectsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeProjectsResponseOps(val self: DescribeProjectsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectDescriptionsAsScala: Option[Seq[ProjectDescription]] = Option(self.projectDescriptions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeProjectsResponseOps {

  implicit def toDescribeProjectsResponseBuilderOps(
      v: DescribeProjectsResponse.Builder
  ): DescribeProjectsResponseBuilderOps = new DescribeProjectsResponseBuilderOps(v)

  implicit def toDescribeProjectsResponseOps(v: DescribeProjectsResponse): DescribeProjectsResponseOps =
    new DescribeProjectsResponseOps(v)

}
