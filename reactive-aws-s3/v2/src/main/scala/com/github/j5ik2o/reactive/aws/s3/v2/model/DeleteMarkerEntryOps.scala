// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteMarkerEntry => ScalaDeleteMarkerEntry, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteMarkerEntry => JavaDeleteMarkerEntry }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteMarkerEntryOps {

  implicit class ScalaDeleteMarkerEntryOps(val self: ScalaDeleteMarkerEntry) extends AnyVal {

    def toJava: JavaDeleteMarkerEntry = {
      val result = JavaDeleteMarkerEntry.builder()
      self.owner.foreach { v =>
        import OwnerOps._; result.owner(v.toJava)
      } // Owner
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String
      self.isLatest.map(_.booleanValue).foreach(v => result.isLatest(v))  // Boolean
      self.lastModified.foreach(v => result.lastModified(v))              // Instant

      result.build()
    }

  }

  implicit class JavaDeleteMarkerEntryOps(val self: JavaDeleteMarkerEntry) extends AnyVal {

    def toScala: ScalaDeleteMarkerEntry = {
      ScalaDeleteMarkerEntry()
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
        .withKey(Option(self.key)) // String
        .withVersionId(Option(self.versionId)) // String
        .withIsLatest(Option(self.isLatest).map(_.booleanValue)) // Boolean
        .withLastModified(Option(self.lastModified)) // Instant
    }

  }

}
