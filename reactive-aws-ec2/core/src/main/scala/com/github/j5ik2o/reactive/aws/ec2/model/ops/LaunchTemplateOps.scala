// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateBuilderOps(val self: LaunchTemplate.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdByAsScala(value: Option[String]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.createdBy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionNumberAsScala(value: Option[Long]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.defaultVersionNumber(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def latestVersionNumberAsScala(value: Option[Long]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.latestVersionNumber(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): LaunchTemplate.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class LaunchTemplateOps(val self: LaunchTemplate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdByAsScala: Option[String] = Option(self.createdBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionNumberAsScala: Option[Long] = Option(self.defaultVersionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def latestVersionNumberAsScala: Option[Long] = Option(self.latestVersionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateOps {

  implicit def toLaunchTemplateBuilderOps(v: LaunchTemplate.Builder): LaunchTemplateBuilderOps =
    new LaunchTemplateBuilderOps(v)

  implicit def toLaunchTemplateOps(v: LaunchTemplate): LaunchTemplateOps = new LaunchTemplateOps(v)

}
