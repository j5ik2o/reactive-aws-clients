// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLaunchTemplateVersionsRequestBuilderOps(val self: DescribeLaunchTemplateVersionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v => self.launchTemplateId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v => self.launchTemplateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionsAsScala(value: Option[Seq[String]]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minVersionAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v => self.minVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxVersionAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v => self.maxVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

}

final class DescribeLaunchTemplateVersionsRequestOps(val self: DescribeLaunchTemplateVersionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionsAsScala: Option[Seq[String]] =
    Option(self.versions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minVersionAsScala: Option[String] = Option(self.minVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxVersionAsScala: Option[String] = Option(self.maxVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLaunchTemplateVersionsRequestOps {

  implicit def toDescribeLaunchTemplateVersionsRequestBuilderOps(
      v: DescribeLaunchTemplateVersionsRequest.Builder
  ): DescribeLaunchTemplateVersionsRequestBuilderOps = new DescribeLaunchTemplateVersionsRequestBuilderOps(v)

  implicit def toDescribeLaunchTemplateVersionsRequestOps(
      v: DescribeLaunchTemplateVersionsRequest
  ): DescribeLaunchTemplateVersionsRequestOps = new DescribeLaunchTemplateVersionsRequestOps(v)

}
