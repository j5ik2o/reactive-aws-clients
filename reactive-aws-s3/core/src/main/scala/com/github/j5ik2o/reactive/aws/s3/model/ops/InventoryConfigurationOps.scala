// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryConfigurationBuilderOps(val self: InventoryConfiguration.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationAsScala(value: Option[InventoryDestination]): InventoryConfiguration.Builder = {
            value.fold(self){ v => self.destination(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def isEnabledAsScala(value: Option[Boolean]): InventoryConfiguration.Builder = {
            value.fold(self){ v => self.isEnabled(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filterAsScala(value: Option[InventoryFilter]): InventoryConfiguration.Builder = {
            value.fold(self){ v => self.filter(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala(value: Option[String]): InventoryConfiguration.Builder = {
            value.fold(self){ v => self.id(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def includedObjectVersionsAsScala(value: Option[InventoryIncludedObjectVersions]): InventoryConfiguration.Builder = {
            value.fold(self){ v => self.includedObjectVersions(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def optionalFieldsAsScala(value: Option[Seq[InventoryOptionalField]]): InventoryConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionalFields(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def scheduleAsScala(value: Option[InventorySchedule]): InventoryConfiguration.Builder = {
            value.fold(self){ v => self.schedule(v) }
            } 


}

final class InventoryConfigurationOps(val self: InventoryConfiguration) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationAsScala: Option[InventoryDestination] = Option(self.destination) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def isEnabledAsScala: Option[Boolean] = Option(self.isEnabled) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filterAsScala: Option[InventoryFilter] = Option(self.filter) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala: Option[String] = Option(self.id) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def includedObjectVersionsAsScala: Option[InventoryIncludedObjectVersions] = Option(self.includedObjectVersions) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def optionalFieldsAsScala: Option[Seq[InventoryOptionalField]] = Option(self.optionalFields).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def scheduleAsScala: Option[InventorySchedule] = Option(self.schedule) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryConfigurationOps {

implicit def toInventoryConfigurationBuilderOps(v: InventoryConfiguration.Builder): InventoryConfigurationBuilderOps = new InventoryConfigurationBuilderOps(v)

implicit def toInventoryConfigurationOps(v: InventoryConfiguration): InventoryConfigurationOps = new InventoryConfigurationOps(v)

}

