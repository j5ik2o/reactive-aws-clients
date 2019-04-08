// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLaunchTemplatesRequestBuilderOps(val self: DescribeLaunchTemplatesRequest.Builder) extends AnyVal {

  final def launchTemplateIdsAsScala(value: Option[Seq[String]]): DescribeLaunchTemplatesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchTemplateIds(v.asJava)
    }
  }

  final def launchTemplateNamesAsScala(value: Option[Seq[String]]): DescribeLaunchTemplatesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchTemplateNames(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeLaunchTemplatesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeLaunchTemplatesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeLaunchTemplatesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeLaunchTemplatesRequestOps(val self: DescribeLaunchTemplatesRequest) extends AnyVal {

  final def launchTemplateIdsAsScala: Option[Seq[String]] = Option(self.launchTemplateIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def launchTemplateNamesAsScala: Option[Seq[String]] = Option(self.launchTemplateNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLaunchTemplatesRequestOps {

  implicit def toDescribeLaunchTemplatesRequestBuilderOps(
      v: DescribeLaunchTemplatesRequest.Builder
  ): DescribeLaunchTemplatesRequestBuilderOps = new DescribeLaunchTemplatesRequestBuilderOps(v)

  implicit def toDescribeLaunchTemplatesRequestOps(
      v: DescribeLaunchTemplatesRequest
  ): DescribeLaunchTemplatesRequestOps = new DescribeLaunchTemplatesRequestOps(v)

}
