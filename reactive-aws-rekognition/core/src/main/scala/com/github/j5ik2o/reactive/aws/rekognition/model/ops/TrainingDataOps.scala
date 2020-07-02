// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TrainingDataBuilderOps(val self: TrainingData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assetsAsScala(value: Option[Seq[Asset]]): TrainingData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.assets(v.asJava)
    }
  }

}

final class TrainingDataOps(val self: TrainingData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assetsAsScala: Option[Seq[Asset]] =
    Option(self.assets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrainingDataOps {

  implicit def toTrainingDataBuilderOps(v: TrainingData.Builder): TrainingDataBuilderOps = new TrainingDataBuilderOps(v)

  implicit def toTrainingDataOps(v: TrainingData): TrainingDataOps = new TrainingDataOps(v)

}
