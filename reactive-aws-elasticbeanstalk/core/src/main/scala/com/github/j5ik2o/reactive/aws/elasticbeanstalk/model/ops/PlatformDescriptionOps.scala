// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformDescriptionBuilderOps(val self: PlatformDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformOwnerAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformOwner(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformStatusAsScala(value: Option[PlatformStatus]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala(value: Option[java.time.Instant]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala(value: Option[java.time.Instant]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformCategoryAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.platformCategory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maintainerAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.maintainer(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemNameAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.operatingSystemName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemVersionAsScala(value: Option[String]): PlatformDescription.Builder = {
    value.fold(self) { v =>
      self.operatingSystemVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def programmingLanguagesAsScala(
      value: Option[Seq[PlatformProgrammingLanguage]]
  ): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.programmingLanguages(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameworksAsScala(value: Option[Seq[PlatformFramework]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.frameworks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customAmiListAsScala(value: Option[Seq[CustomAmi]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.customAmiList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedTierListAsScala(value: Option[Seq[String]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedTierList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedAddonListAsScala(value: Option[Seq[String]]): PlatformDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedAddonList(v.asJava)
    }
  }

}

final class PlatformDescriptionOps(val self: PlatformDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformOwnerAsScala: Option[String] = Option(self.platformOwner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformNameAsScala: Option[String] = Option(self.platformName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformStatusAsScala: Option[PlatformStatus] = Option(self.platformStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformCategoryAsScala: Option[String] = Option(self.platformCategory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maintainerAsScala: Option[String] = Option(self.maintainer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemNameAsScala: Option[String] = Option(self.operatingSystemName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatingSystemVersionAsScala: Option[String] = Option(self.operatingSystemVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def programmingLanguagesAsScala: Option[Seq[PlatformProgrammingLanguage]] =
    Option(self.programmingLanguages).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameworksAsScala: Option[Seq[PlatformFramework]] = Option(self.frameworks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customAmiListAsScala: Option[Seq[CustomAmi]] = Option(self.customAmiList).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

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
trait ToPlatformDescriptionOps {

  implicit def toPlatformDescriptionBuilderOps(v: PlatformDescription.Builder): PlatformDescriptionBuilderOps =
    new PlatformDescriptionBuilderOps(v)

  implicit def toPlatformDescriptionOps(v: PlatformDescription): PlatformDescriptionOps = new PlatformDescriptionOps(v)

}
