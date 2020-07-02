// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeProjectVersionsRequestBuilderOps(val self: DescribeProjectVersionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala(value: Option[String]): DescribeProjectVersionsRequest.Builder = {
    value.fold(self) { v => self.projectArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNamesAsScala(value: Option[Seq[String]]): DescribeProjectVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versionNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeProjectVersionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeProjectVersionsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class DescribeProjectVersionsRequestOps(val self: DescribeProjectVersionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala: Option[String] = Option(self.projectArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNamesAsScala: Option[Seq[String]] =
    Option(self.versionNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeProjectVersionsRequestOps {

  implicit def toDescribeProjectVersionsRequestBuilderOps(
      v: DescribeProjectVersionsRequest.Builder
  ): DescribeProjectVersionsRequestBuilderOps = new DescribeProjectVersionsRequestBuilderOps(v)

  implicit def toDescribeProjectVersionsRequestOps(
      v: DescribeProjectVersionsRequest
  ): DescribeProjectVersionsRequestOps = new DescribeProjectVersionsRequestOps(v)

}
