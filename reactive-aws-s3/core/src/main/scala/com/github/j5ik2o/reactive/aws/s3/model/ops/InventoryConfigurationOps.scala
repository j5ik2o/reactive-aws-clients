// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryConfigurationBuilderOps(val self: InventoryConfiguration.Builder) extends AnyVal {

  final def withDestinationAsScala(value: Option[InventoryDestination]): InventoryConfiguration.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  } // InventoryDestination

  final def withIsEnabledAsScala(value: Option[Boolean]): InventoryConfiguration.Builder = {
    value.fold(self) { v =>
      self.isEnabled(v)
    }
  } // Boolean

  final def withFilterAsScala(value: Option[InventoryFilter]): InventoryConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // InventoryFilter

  final def withIdAsScala(value: Option[String]): InventoryConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withIncludedObjectVersionsAsScala(
      value: Option[InventoryIncludedObjectVersions]
  ): InventoryConfiguration.Builder = {
    value.fold(self) { v =>
      self.includedObjectVersions(v)
    }
  } // String

  final def withOptionalFieldsAsScala(value: Option[Seq[InventoryOptionalField]]): InventoryConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionalFields(v.asJava)
    } // Seq[String]
  }

  final def withScheduleAsScala(value: Option[InventorySchedule]): InventoryConfiguration.Builder = {
    value.fold(self) { v =>
      self.schedule(v)
    }
  } // InventorySchedule

}

final class InventoryConfigurationOps(val self: InventoryConfiguration) extends AnyVal {

  final def destinationAsScala: Option[InventoryDestination] = Option(self.destination) // InventoryDestination

  final def isEnabledAsScala: Option[Boolean] = Option(self.isEnabled) // Boolean

  final def filterAsScala: Option[InventoryFilter] = Option(self.filter) // InventoryFilter

  final def idAsScala: Option[String] = Option(self.id) // String

  final def includedObjectVersionsAsScala: Option[InventoryIncludedObjectVersions] =
    Option(self.includedObjectVersions) // String

  final def optionalFieldsAsScala: Option[Seq[InventoryOptionalField]] = Option(self.optionalFields).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def scheduleAsScala: Option[InventorySchedule] = Option(self.schedule) // InventorySchedule

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryConfigurationOps {

  implicit def toInventoryConfigurationBuilderOps(v: InventoryConfiguration.Builder): InventoryConfigurationBuilderOps =
    new InventoryConfigurationBuilderOps(v)

  implicit def toInventoryConfigurationOps(v: InventoryConfiguration): InventoryConfigurationOps =
    new InventoryConfigurationOps(v)

}
