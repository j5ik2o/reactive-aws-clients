// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectCustomLabelsResponseBuilderOps(val self: DetectCustomLabelsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customLabelsAsScala(value: Option[Seq[CustomLabel]]): DetectCustomLabelsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.customLabels(v.asJava)
    }
  }

}

final class DetectCustomLabelsResponseOps(val self: DetectCustomLabelsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customLabelsAsScala: Option[Seq[CustomLabel]] = Option(self.customLabels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectCustomLabelsResponseOps {

  implicit def toDetectCustomLabelsResponseBuilderOps(
      v: DetectCustomLabelsResponse.Builder
  ): DetectCustomLabelsResponseBuilderOps = new DetectCustomLabelsResponseBuilderOps(v)

  implicit def toDetectCustomLabelsResponseOps(v: DetectCustomLabelsResponse): DetectCustomLabelsResponseOps =
    new DetectCustomLabelsResponseOps(v)

}
