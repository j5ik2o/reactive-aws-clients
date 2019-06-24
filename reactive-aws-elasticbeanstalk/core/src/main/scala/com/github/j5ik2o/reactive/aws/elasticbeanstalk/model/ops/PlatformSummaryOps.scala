// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformSummaryBuilderOps(val self: PlatformSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformOwnerAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformOwner(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformStatusAsScala(value: Option[PlatformStatus]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformCategoryAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.platformCategory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemNameAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.operatingSystemName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemVersionAsScala(value: Option[String]): PlatformSummary.Builder = {
    value.fold(self) { v =>
      self.operatingSystemVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedTierListAsScala(value: Option[Seq[String]]): PlatformSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedTierList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedAddonListAsScala(value: Option[Seq[String]]): PlatformSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedAddonList(v.asJava)
    }
  }

}

final class PlatformSummaryOps(val self: PlatformSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformOwnerAsScala: Option[String] = Option(self.platformOwner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformStatusAsScala: Option[PlatformStatus] = Option(self.platformStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformCategoryAsScala: Option[String] = Option(self.platformCategory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemNameAsScala: Option[String] = Option(self.operatingSystemName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemVersionAsScala: Option[String] = Option(self.operatingSystemVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedTierListAsScala: Option[Seq[String]] = Option(self.supportedTierList).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedAddonListAsScala: Option[Seq[String]] = Option(self.supportedAddonList).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformSummaryOps {

  implicit def toPlatformSummaryBuilderOps(v: PlatformSummary.Builder): PlatformSummaryBuilderOps =
    new PlatformSummaryBuilderOps(v)

  implicit def toPlatformSummaryOps(v: PlatformSummary): PlatformSummaryOps = new PlatformSummaryOps(v)

}
