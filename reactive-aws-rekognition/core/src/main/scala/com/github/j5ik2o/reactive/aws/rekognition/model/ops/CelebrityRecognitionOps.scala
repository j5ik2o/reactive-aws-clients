// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CelebrityRecognitionBuilderOps(val self: CelebrityRecognition.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[Long]): CelebrityRecognition.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def celebrityAsScala(value: Option[CelebrityDetail]): CelebrityRecognition.Builder = {
    value.fold(self) { v =>
      self.celebrity(v)
    }
  }

}

final class CelebrityRecognitionOps(val self: CelebrityRecognition) extends AnyVal {

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def celebrityAsScala: Option[CelebrityDetail] = Option(self.celebrity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCelebrityRecognitionOps {

  implicit def toCelebrityRecognitionBuilderOps(v: CelebrityRecognition.Builder): CelebrityRecognitionBuilderOps =
    new CelebrityRecognitionBuilderOps(v)

  implicit def toCelebrityRecognitionOps(v: CelebrityRecognition): CelebrityRecognitionOps =
    new CelebrityRecognitionOps(v)

}
