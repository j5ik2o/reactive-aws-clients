// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class EvaluationResultBuilderOps(val self: EvaluationResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def f1ScoreAsScala(value: Option[Float]): EvaluationResult.Builder = {
    value.fold(self) { v => self.f1Score(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summaryAsScala(value: Option[Summary]): EvaluationResult.Builder = {
    value.fold(self) { v => self.summary(v) }
  }

}

final class EvaluationResultOps(val self: EvaluationResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def f1ScoreAsScala: Option[Float] = Option(self.f1Score)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summaryAsScala: Option[Summary] = Option(self.summary)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEvaluationResultOps {

  implicit def toEvaluationResultBuilderOps(v: EvaluationResult.Builder): EvaluationResultBuilderOps =
    new EvaluationResultBuilderOps(v)

  implicit def toEvaluationResultOps(v: EvaluationResult): EvaluationResultOps = new EvaluationResultOps(v)

}
