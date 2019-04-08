// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformDescriptionBuilderOps(val self: PlatformDescription.Builder) extends AnyVal {

  final def platformArnAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def platformOwnerAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformOwner(v)
    }
  }

  final def platformNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformName(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformStatusAsScala(value: Option[PlatformStatus]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformStatus(v)
    }
  }

  final def dateCreatedAsScala(value: Option[java.time.Instant]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  }

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  }

  final def platformCategoryAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformCategory(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def maintainerAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.maintainer(v)
    }
  }

  final def operatingSystemNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.operatingSystemName(v)
    }
  }

  final def operatingSystemVersionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.operatingSystemVersion(v)
    }
  }

  final def programmingLanguagesAsScala(
      value: Option[Seq[PlatformProgrammingLanguage]]
  ): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.programmingLanguages(v.asJava)
    }
  }

  final def frameworksAsScala(value: Option[Seq[PlatformFramework]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.frameworks(v.asJava)
    }
  }

  final def customAmiListAsScala(value: Option[Seq[CustomAmi]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.customAmiList(v.asJava)
    }
  }

  final def supportedTierListAsScala(value: Option[Seq[String]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.supportedTierList(v.asJava)
    }
  }

  final def supportedAddonListAsScala(value: Option[Seq[String]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.supportedAddonList(v.asJava)
    }
  }

}

final class PlatformDescriptionOps(val self: PlatformDescription) extends AnyVal {

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def platformOwnerAsScala: Option[String] = Option(self.platformOwner)

  final def platformNameAsScala: Option[String] = Option(self.platformName)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformStatusAsScala: Option[PlatformStatus] = Option(self.platformStatus)

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  final def platformCategoryAsScala: Option[String] = Option(self.platformCategory)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def maintainerAsScala: Option[String] = Option(self.maintainer)

  final def operatingSystemNameAsScala: Option[String] = Option(self.operatingSystemName)

  final def operatingSystemVersionAsScala: Option[String] = Option(self.operatingSystemVersion)

  final def programmingLanguagesAsScala: Option[Seq[PlatformProgrammingLanguage]] =
    Option(self.programmingLanguages).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def frameworksAsScala: Option[Seq[PlatformFramework]] = Option(self.frameworks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def customAmiListAsScala: Option[Seq[CustomAmi]] = Option(self.customAmiList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def supportedTierListAsScala: Option[Seq[String]] = Option(self.supportedTierList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def supportedAddonListAsScala: Option[Seq[String]] = Option(self.supportedAddonList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformDescriptionOps {

  implicit def toPlatformDescriptionBuilderOps(v: PlatformDescription.Builder): PlatformDescriptionBuilderOps =
    new PlatformDescriptionBuilderOps(v)

  implicit def toPlatformDescriptionOps(v: PlatformDescription): PlatformDescriptionOps = new PlatformDescriptionOps(v)

}
