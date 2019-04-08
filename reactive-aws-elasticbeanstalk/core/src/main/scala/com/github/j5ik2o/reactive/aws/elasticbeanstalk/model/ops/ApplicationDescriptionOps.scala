// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationDescriptionBuilderOps(val self: ApplicationDescription.Builder) extends AnyVal {

  final def applicationArnAsScala(value: Option[String]): ApplicationDescription.Builder = {
    value.fold(self) { v =>
      self.applicationArn(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): ApplicationDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): ApplicationDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def dateCreatedAsScala(value: Option[java.time.Instant]): ApplicationDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): ApplicationDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // Instant

  final def versionsAsScala(value: Option[Seq[String]]): ApplicationDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.versions(v.asJava)
    } // Seq[String]
  }

  final def configurationTemplatesAsScala(value: Option[Seq[String]]): ApplicationDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.configurationTemplates(v.asJava)
    } // Seq[String]
  }

  final def resourceLifecycleConfigAsScala(
      value: Option[ApplicationResourceLifecycleConfig]
  ): ApplicationDescription.Builder = {
    value.fold(self) { v =>
      self.resourceLifecycleConfig(v)
    }
  } // ApplicationResourceLifecycleConfig

}

final class ApplicationDescriptionOps(val self: ApplicationDescription) extends AnyVal {

  final def applicationArnAsScala: Option[String] = Option(self.applicationArn) // String

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // Instant

  final def versionsAsScala: Option[Seq[String]] = Option(self.versions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def configurationTemplatesAsScala: Option[Seq[String]] = Option(self.configurationTemplates).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def resourceLifecycleConfigAsScala: Option[ApplicationResourceLifecycleConfig] =
    Option(self.resourceLifecycleConfig) // ApplicationResourceLifecycleConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplicationDescriptionOps {

  implicit def toApplicationDescriptionBuilderOps(v: ApplicationDescription.Builder): ApplicationDescriptionBuilderOps =
    new ApplicationDescriptionBuilderOps(v)

  implicit def toApplicationDescriptionOps(v: ApplicationDescription): ApplicationDescriptionOps =
    new ApplicationDescriptionOps(v)

}
