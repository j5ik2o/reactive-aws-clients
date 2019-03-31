// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectVersion => ScalaObjectVersion, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectVersion => JavaObjectVersion }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ObjectVersionOps {

  implicit class ScalaObjectVersionOps(val self: ScalaObjectVersion) extends AnyVal {

    def toJava: JavaObjectVersion = {
      val result = JavaObjectVersion.builder()
      self.eTag.filter(_.nonEmpty).foreach(v => result.eTag(v)) // String
      self.size.map(_.intValue).foreach(v => result.size(v))    // Int
      self.storageClass.foreach { v =>
        import ObjectVersionStorageClassOps._; result.storageClass(v.toJava)
      } // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String
      self.isLatest.map(_.booleanValue).foreach(v => result.isLatest(v))  // Boolean
      self.lastModified.foreach(v => result.lastModified(v))              // Instant
      self.owner.foreach { v =>
        import OwnerOps._; result.owner(v.toJava)
      } // Owner

      result.build()
    }

  }

  implicit class JavaObjectVersionOps(val self: JavaObjectVersion) extends AnyVal {

    def toScala: ScalaObjectVersion = {
      ScalaObjectVersion()
        .withETag(Option(self.eTag)) // String
        .withSize(Option(self.size).map(_.intValue)) // Int
        .withStorageClass(Option(self.storageClass).map { v =>
          import ObjectVersionStorageClassOps._; v.toScala
        }) // String
        .withKey(Option(self.key)) // String
        .withVersionId(Option(self.versionId)) // String
        .withIsLatest(Option(self.isLatest).map(_.booleanValue)) // Boolean
        .withLastModified(Option(self.lastModified)) // Instant
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
    }

  }

}
