// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeletedObject => ScalaDeletedObject, _ }
import software.amazon.awssdk.services.s3.model.{ DeletedObject => JavaDeletedObject }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeletedObjectOps {

  implicit class ScalaDeletedObjectOps(val self: ScalaDeletedObject) extends AnyVal {

    def toJava: JavaDeletedObject = {
      val result = JavaDeletedObject.builder()
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                                     // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v))                         // String
      self.deleteMarker.map(_.booleanValue).foreach(v => result.deleteMarker(v))                  // Boolean
      self.deleteMarkerVersionId.filter(_.nonEmpty).foreach(v => result.deleteMarkerVersionId(v)) // String

      result.build()
    }

  }

  implicit class JavaDeletedObjectOps(val self: JavaDeletedObject) extends AnyVal {

    def toScala: ScalaDeletedObject = {
      ScalaDeletedObject()
        .withKey(Option(self.key)) // String
        .withVersionId(Option(self.versionId)) // String
        .withDeleteMarker(Option(self.deleteMarker).map(_.booleanValue)) // Boolean
        .withDeleteMarkerVersionId(Option(self.deleteMarkerVersionId)) // String
    }

  }

}
