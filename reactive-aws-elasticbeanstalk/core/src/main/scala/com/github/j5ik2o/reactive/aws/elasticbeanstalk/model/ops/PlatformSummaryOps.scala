// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformSummaryBuilderOps(val self: PlatformSummary.Builder) extends AnyVal {

  final def platformArnAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def platformOwnerAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformOwner(v)
    }
  }

  final def platformStatusAsScala(value: Option[PlatformStatus]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformStatus(v)
    }
  }

  final def platformCategoryAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformCategory(v)
    }
  }

  final def operatingSystemNameAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.operatingSystemName(v)
    }
  }

  final def operatingSystemVersionAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.operatingSystemVersion(v)
    }
  }

  final def supportedTierListAsScala(value: Option[Seq[String]]): PlatformSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.supportedTierList(v.asJava)
    }
  }

  final def supportedAddonListAsScala(value: Option[Seq[String]]): PlatformSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.supportedAddonList(v.asJava)
    }
  }

}

final class PlatformSummaryOps(val self: PlatformSummary) extends AnyVal {

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def platformOwnerAsScala: Option[String] = Option(self.platformOwner)

  final def platformStatusAsScala: Option[PlatformStatus] = Option(self.platformStatus)

  final def platformCategoryAsScala: Option[String] = Option(self.platformCategory)

  final def operatingSystemNameAsScala: Option[String] = Option(self.operatingSystemName)

  final def operatingSystemVersionAsScala: Option[String] = Option(self.operatingSystemVersion)

  final def supportedTierListAsScala: Option[Seq[String]] = Option(self.supportedTierList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def supportedAddonListAsScala: Option[Seq[String]] = Option(self.supportedAddonList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformSummaryOps {

  implicit def toPlatformSummaryBuilderOps(v: PlatformSummary.Builder): PlatformSummaryBuilderOps =
    new PlatformSummaryBuilderOps(v)

  implicit def toPlatformSummaryOps(v: PlatformSummary): PlatformSummaryOps = new PlatformSummaryOps(v)

}
