// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformDescriptionBuilderOps(val self: PlatformDescription.Builder) extends AnyVal {

  final def platformArnAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def platformOwnerAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformOwner(v)
    }
  } // String

  final def platformNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformName(v)
    }
  } // String

  final def platformVersionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  } // String

  final def solutionStackNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformStatusAsScala(value: Option[PlatformStatus]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformStatus(v)
    }
  } // String

  final def dateCreatedAsScala(value: Option[java.time.Instant]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // Instant

  final def platformCategoryAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformCategory(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def maintainerAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.maintainer(v)
    }
  } // String

  final def operatingSystemNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.operatingSystemName(v)
    }
  } // String

  final def operatingSystemVersionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.operatingSystemVersion(v)
    }
  } // String

  final def programmingLanguagesAsScala(
      value: Option[Seq[PlatformProgrammingLanguage]]
  ): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.programmingLanguages(v.asJava)
    } // Seq[PlatformProgrammingLanguage]
  }

  final def frameworksAsScala(value: Option[Seq[PlatformFramework]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.frameworks(v.asJava)
    } // Seq[PlatformFramework]
  }

  final def customAmiListAsScala(value: Option[Seq[CustomAmi]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.customAmiList(v.asJava)
    } // Seq[CustomAmi]
  }

  final def supportedTierListAsScala(value: Option[Seq[String]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.supportedTierList(v.asJava)
    } // Seq[String]
  }

  final def supportedAddonListAsScala(value: Option[Seq[String]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.supportedAddonList(v.asJava)
    } // Seq[String]
  }

}

final class PlatformDescriptionOps(val self: PlatformDescription) extends AnyVal {

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def platformOwnerAsScala: Option[String] = Option(self.platformOwner) // String

  final def platformNameAsScala: Option[String] = Option(self.platformName) // String

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion) // String

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName) // String

  final def platformStatusAsScala: Option[PlatformStatus] = Option(self.platformStatus) // String

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // Instant

  final def platformCategoryAsScala: Option[String] = Option(self.platformCategory) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def maintainerAsScala: Option[String] = Option(self.maintainer) // String

  final def operatingSystemNameAsScala: Option[String] = Option(self.operatingSystemName) // String

  final def operatingSystemVersionAsScala: Option[String] = Option(self.operatingSystemVersion) // String

  final def programmingLanguagesAsScala: Option[Seq[PlatformProgrammingLanguage]] =
    Option(self.programmingLanguages).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[PlatformProgrammingLanguage]

  final def frameworksAsScala: Option[Seq[PlatformFramework]] = Option(self.frameworks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[PlatformFramework]

  final def customAmiListAsScala: Option[Seq[CustomAmi]] = Option(self.customAmiList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[CustomAmi]

  final def supportedTierListAsScala: Option[Seq[String]] = Option(self.supportedTierList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def supportedAddonListAsScala: Option[Seq[String]] = Option(self.supportedAddonList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformDescriptionOps {

  implicit def toPlatformDescriptionBuilderOps(v: PlatformDescription.Builder): PlatformDescriptionBuilderOps =
    new PlatformDescriptionBuilderOps(v)

  implicit def toPlatformDescriptionOps(v: PlatformDescription): PlatformDescriptionOps = new PlatformDescriptionOps(v)

}
