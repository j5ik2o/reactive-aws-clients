// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class SourceSelectionCriteriaBuilderOps(val self: SourceSelectionCriteria.Builder) extends AnyVal {

  final def sseKmsEncryptedObjectsAsScala(value: Option[SseKmsEncryptedObjects]): SourceSelectionCriteria.Builder = {
    value.fold(self) { v =>
      self.sseKmsEncryptedObjects(v)
    }
  } // SseKmsEncryptedObjects

}

final class SourceSelectionCriteriaOps(val self: SourceSelectionCriteria) extends AnyVal {

  final def sseKmsEncryptedObjectsAsScala: Option[SseKmsEncryptedObjects] =
    Option(self.sseKmsEncryptedObjects) // SseKmsEncryptedObjects

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceSelectionCriteriaOps {

  implicit def toSourceSelectionCriteriaBuilderOps(
      v: SourceSelectionCriteria.Builder
  ): SourceSelectionCriteriaBuilderOps = new SourceSelectionCriteriaBuilderOps(v)

  implicit def toSourceSelectionCriteriaOps(v: SourceSelectionCriteria): SourceSelectionCriteriaOps =
    new SourceSelectionCriteriaOps(v)

}
