// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryConfiguration => ScalaInventoryConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryConfiguration => JavaInventoryConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InventoryConfigurationOps {

  implicit class ScalaInventoryConfigurationOps(val self: ScalaInventoryConfiguration) extends AnyVal {

    def toJava: JavaInventoryConfiguration = {
      val result = JavaInventoryConfiguration.builder()
      self.destination.foreach { v =>
        import InventoryDestinationOps._; result.destination(v.toJava)
      } // InventoryDestination
      self.isEnabled.map(_.booleanValue).foreach(v => result.isEnabled(v)) // Boolean
      self.filter.foreach { v =>
        import InventoryFilterOps._; result.filter(v.toJava)
      } // InventoryFilter
      self.id.filter(_.nonEmpty).foreach(v => result.id(v)) // String
      self.includedObjectVersions.foreach { v =>
        import InventoryIncludedObjectVersionsOps._; result.includedObjectVersions(v.toJava)
      } // String
      self.optionalFields.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, InventoryOptionalFieldOps._;
        result.optionalFields(v.map(_.toJava).asJava)
      } // Seq[String]
      self.schedule.foreach { v =>
        import InventoryScheduleOps._; result.schedule(v.toJava)
      } // InventorySchedule

      result.build()
    }

  }

  implicit class JavaInventoryConfigurationOps(val self: JavaInventoryConfiguration) extends AnyVal {

    def toScala: ScalaInventoryConfiguration = {
      ScalaInventoryConfiguration()
        .withDestination(Option(self.destination).map { v =>
          import InventoryDestinationOps._; v.toScala
        }) // InventoryDestination
        .withIsEnabled(Option(self.isEnabled).map(_.booleanValue)) // Boolean
        .withFilter(Option(self.filter).map { v =>
          import InventoryFilterOps._; v.toScala
        }) // InventoryFilter
        .withId(Option(self.id)) // String
        .withIncludedObjectVersions(Option(self.includedObjectVersions).map { v =>
          import InventoryIncludedObjectVersionsOps._; v.toScala
        }) // String
        .withOptionalFields(Option(self.optionalFields).map { v =>
          import scala.collection.JavaConverters._, InventoryOptionalFieldOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
        .withSchedule(Option(self.schedule).map { v =>
          import InventoryScheduleOps._; v.toScala
        }) // InventorySchedule
    }

  }

}
