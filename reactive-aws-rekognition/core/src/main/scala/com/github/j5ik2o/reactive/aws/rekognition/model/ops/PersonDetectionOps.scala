// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class PersonDetectionBuilderOps(val self: PersonDetection.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[Long]): PersonDetection.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def personAsScala(value: Option[PersonDetail]): PersonDetection.Builder = {
    value.fold(self) { v =>
      self.person(v)
    }
  }

}

final class PersonDetectionOps(val self: PersonDetection) extends AnyVal {

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def personAsScala: Option[PersonDetail] = Option(self.person)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPersonDetectionOps {

  implicit def toPersonDetectionBuilderOps(v: PersonDetection.Builder): PersonDetectionBuilderOps =
    new PersonDetectionBuilderOps(v)

  implicit def toPersonDetectionOps(v: PersonDetection): PersonDetectionOps = new PersonDetectionOps(v)

}
