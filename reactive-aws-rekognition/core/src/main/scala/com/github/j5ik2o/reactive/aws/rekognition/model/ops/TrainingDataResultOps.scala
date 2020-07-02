// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TrainingDataResultBuilderOps(val self: TrainingDataResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala(value: Option[TrainingData]): TrainingDataResult.Builder = {
    value.fold(self) { v => self.input(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala(value: Option[TrainingData]): TrainingDataResult.Builder = {
    value.fold(self) { v => self.output(v) }
  }

}

final class TrainingDataResultOps(val self: TrainingDataResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala: Option[TrainingData] = Option(self.input)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala: Option[TrainingData] = Option(self.output)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrainingDataResultOps {

  implicit def toTrainingDataResultBuilderOps(v: TrainingDataResult.Builder): TrainingDataResultBuilderOps =
    new TrainingDataResultBuilderOps(v)

  implicit def toTrainingDataResultOps(v: TrainingDataResult): TrainingDataResultOps = new TrainingDataResultOps(v)

}
