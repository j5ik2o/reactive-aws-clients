// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLaunchTemplateVersionsRequestBuilderOps(val self: DescribeLaunchTemplateVersionsRequest.Builder)
    extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionsAsScala(value: Option[Seq[String]]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.versions(v.asJava)
    }
  }

  final def minVersionAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.minVersion(v)
    }
  }

  final def maxVersionAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxVersion(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeLaunchTemplateVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeLaunchTemplateVersionsRequestOps(val self: DescribeLaunchTemplateVersionsRequest) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionsAsScala: Option[Seq[String]] = Option(self.versions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def minVersionAsScala: Option[String] = Option(self.minVersion)

  final def maxVersionAsScala: Option[String] = Option(self.maxVersion)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
