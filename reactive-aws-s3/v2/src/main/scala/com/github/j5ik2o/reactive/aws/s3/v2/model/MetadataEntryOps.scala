// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ MetadataEntry => ScalaMetadataEntry, _ }
import software.amazon.awssdk.services.s3.model.{ MetadataEntry => JavaMetadataEntry }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MetadataEntryOps {

  implicit class ScalaMetadataEntryOps(val self: ScalaMetadataEntry) extends AnyVal {

    def toJava: JavaMetadataEntry = {
      val result = JavaMetadataEntry.builder()
      self.name.filter(_.nonEmpty).foreach(v => result.name(v))   // String
      self.value.filter(_.nonEmpty).foreach(v => result.value(v)) // String

      result.build()
    }

  }

  implicit class JavaMetadataEntryOps(val self: JavaMetadataEntry) extends AnyVal {

    def toScala: ScalaMetadataEntry = {
      ScalaMetadataEntry()
        .withName(Option(self.name)) // String
        .withValue(Option(self.value)) // String
    }

  }

}
